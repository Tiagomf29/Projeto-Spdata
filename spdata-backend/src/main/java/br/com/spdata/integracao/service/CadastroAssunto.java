package br.com.spdata.integracao.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spdata.integracao.entity.Assunto;
import br.com.spdata.integracao.model.AssuntoModel;
import br.com.spdata.integracao.repository.AssuntoRepository;

@Service
public class CadastroAssunto {
	
	@Autowired
	AssuntoRepository assuntoRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public String salvar(AssuntoModel assunto){
		
		Assunto assunt = modelMapper.map(assunto, Assunto.class);
		assuntoRepository.save(assunt);
		
		return "Assunto " + String.valueOf(assunt.getDescricao()) + " - " +  String.valueOf(assunt.getId()) + " registrado com sucesso!";		
		
	}
	
	public String deletar(AssuntoModel assunto) {
		
		Assunto assunt = modelMapper.map(assunto, Assunto.class);
		assuntoRepository.delete(assunt);
		
		return "Assunto "+ String.valueOf(assunt.getDescricao()) + "- ID: " + String.valueOf(assunt.getId())+ " foi removido!";
	}

	public String atualizar(AssuntoModel assunto) {
		
		Assunto assunt = modelMapper.map(assunto, Assunto.class);
		assuntoRepository.save(assunt);
		
		return "Assunto "+ String.valueOf(assunt.getDescricao()) + "- ID: " + String.valueOf(assunt.getId())+ " atualizado!";
	}
}
