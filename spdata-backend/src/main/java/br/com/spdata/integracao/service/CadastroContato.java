package br.com.spdata.integracao.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spdata.integracao.entity.Contato;
import br.com.spdata.integracao.entity.ContatoAssunto;
import br.com.spdata.integracao.model.ContatoModel;
import br.com.spdata.integracao.repository.ContatoAssuntoRespository;
import br.com.spdata.integracao.repository.ContatoRepository;

@Service
public class CadastroContato {

	@Autowired
	ContatoRepository contatoRepository;
	
	@Autowired
	ContatoAssuntoRespository contatoAssuntoRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public String salvar(ContatoModel contato) {
				
		Contato cont = modelMapper.map(contato, Contato.class);				
		
		contatoRepository.save(cont);
		
		for(int i=0; i < contato.getListaAssuntos().size(); i++) {
			
			ContatoAssunto ca = new ContatoAssunto();
			ca.setAssunto(contato.getListaAssuntos().get(i).getAssunto());
			ca.setContato(cont);
			contatoAssuntoRepository.save(ca);
		}

		return "O código do cliente cadastrado é : " + String.valueOf(cont.getId()) ;
		
	}
	
	
	public String deletar(ContatoModel contato) {
		
		Contato cont = modelMapper.map(contato, Contato.class);
		
		contatoRepository.delete(cont);
		
		return "O contato de Id número: "+String.valueOf(cont.getId())+" foi removido!";
	}
	
	
	public String atualizar(ContatoModel contato) {
		
		Contato cont = modelMapper.map(contato, Contato.class);		
		contatoRepository.save(cont);

		return "O código do cliente atualizado é : " + String.valueOf(cont.getId()) ;
		
	}
		
	
	
}
