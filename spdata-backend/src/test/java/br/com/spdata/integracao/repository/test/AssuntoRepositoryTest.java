package br.com.spdata.integracao.repository.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.spdata.integracao.entity.Assunto;
import br.com.spdata.integracao.repository.AssuntoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class AssuntoRepositoryTest {

	@Autowired
	AssuntoRepository assuntoRepository;

	@Test
	public void testCriarAssunto() {

		Assunto assunto = new Assunto();

		assunto.setDescricao("Assunto 1");
		assunto.setAtivo("T");

		assertEquals(assuntoRepository.findById(assuntoRepository.save(assunto).getId()).get().getDescricao(),"Assunto 1");
		assertEquals(assuntoRepository.findById(assuntoRepository.save(assunto).getId()).get().getAtivo(), "T");

		assuntoRepository.deleteAll();

	}

	@Test
	public void testAtualizarAssunto() {

		Assunto assunto = new Assunto();

		assunto.setDescricao("Assunto 1");
		assunto.setAtivo("T");

		int id = assuntoRepository.save(assunto).getId();

		assunto.setId(id);
		assunto.setDescricao("Assunto 1 alterado");
		assunto.setAtivo("T");

		assuntoRepository.findById(assuntoRepository.save(assunto).getId());

		assertEquals(assunto.getDescricao(), "Assunto 1 alterado");

		assuntoRepository.deleteAll();
	}

	@Test
	public void testExcluirAssunto() {

		Assunto assunto = new Assunto();

		assunto.setDescricao("Assunto 1");
		assunto.setAtivo("T");

		int id = assuntoRepository.save(assunto).getId();

		assuntoRepository.delete(assunto);

		assertFalse(assuntoRepository.findById(id).isPresent());

	}

	@Test
	public void testConsultaAssuntosCriados() {

		Assunto assunto1 = new Assunto();
		assunto1.setDescricao("Assunto 1");
		assunto1.setAtivo("T");

		assuntoRepository.save(assunto1);

		Assunto assunto2 = new Assunto();
		assunto2.setDescricao("Assunto 2");
		assunto2.setAtivo("T");

		assuntoRepository.save(assunto2);

		Assunto assunto3 = new Assunto();
		assunto3.setDescricao("Assunto 3");
		assunto3.setAtivo("T");

		assuntoRepository.save(assunto3);

		List<Assunto> lista = new ArrayList<>();
		lista = assuntoRepository.findAll();

		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i).getId() == 1)
				assertEquals(lista.get(i).getDescricao(), "Assunto 1");
			else if (lista.get(i).getId() == 2)
				assertEquals(lista.get(i).getDescricao(), "Assunto 2");
			else
				assertEquals(lista.get(i).getDescricao(), "Assunto 3");

		}

		assuntoRepository.deleteAll();

	}
		

}
