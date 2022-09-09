package br.com.fruteira.dao;

import org.junit.Test;

import br.com.fruteira.domain.Estado;

public class EstadoDAOTest {

	@Test
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("Minas Gerais");
		estado.setSigla("MG");
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
	}
}
