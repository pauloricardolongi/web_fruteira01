package br.com.fruteira.dao;

import java.math.BigDecimal;


import org.junit.Ignore;
import org.junit.Test;

import br.com.fruteira.domain.Fornecedor;
import br.com.fruteira.domain.Produto;

public class ProdutoDAOTest {
	@Test
	@Ignore
	public void salvar(){
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = fornecedorDAO.buscar(new Long("2"));
		
		Produto produto = new Produto();
		produto.setDescricao("bergamota - kg");
		produto.setFornecedor(fornecedor);
		produto.setPreco(new BigDecimal("7.70"));
		produto.setQuantidade(new Short("10"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
		
		System.out.println("Produto salvo com sucesso");
	}
}