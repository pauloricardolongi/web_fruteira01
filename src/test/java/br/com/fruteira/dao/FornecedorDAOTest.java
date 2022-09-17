package br.com.fruteira.dao;

import java.util.List;


import org.junit.Ignore;
import org.junit.Test;

import br.com.fruteira.domain.Fornecedor;

public class FornecedorDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setDescricao("HortoDores");

		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		fornecedorDAO.salvar(fornecedor);
	}

	@Test
	@Ignore
	public void listar() {
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		List<Fornecedor> resultado = fornecedorDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Fornecedor fornecedor : resultado) {
			System.out.println( " código fornecedor " + fornecedor.getCodigo() + " - Fornecedor  " 
		+ fornecedor.getDescricao());
		}
	}
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 3L;
		
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = fornecedorDAO.buscar(codigo);
		
		if(fornecedor == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			System.out.println("Registro encontrado:");
			System.out.println(fornecedor.getCodigo() + " - " + fornecedor.getDescricao());
		}
	}
}
	
	

