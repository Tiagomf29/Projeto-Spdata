package br.com.spdata.integracao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spdata.integracao.entity.Assunto;

@Repository
public interface AssuntoRepository extends JpaRepository<Assunto, Integer> {


}
