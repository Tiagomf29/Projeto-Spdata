package br.com.spdata.integracao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spdata.integracao.entity.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer>{
	
	List<Contato>findByNomeContaining(String nome);
	
}
