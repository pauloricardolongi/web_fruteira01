package br.com.fruteira.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.fruteira.domain.Fornecedor;
import br.com.fruteira.domain.Pessoa;
import br.com.fruteira.domain.Produto;

public class ProdutoDAOTest {
	@Test
	@Ignore
	public void salvar(){
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = fornecedorDAO.buscar(new Long("1"));
		
		
		Produto produto = new Produto();
		produto.setDescricao("alface-muda");
		produto.setFornecedor(fornecedor);
		produto.setPreco(new BigDecimal("3.70"));
		produto.setQuantidade(new Short("10"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
		
		System.out.println("Produto salvo com sucesso");
	}
	
	@Test
	@Ignore
	public void listar() {
		
		ProdutoDAO produtoDAO = new ProdutoDAO();	
		List<Produto> resultado = produtoDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Produto produto : resultado) {
			System.out.println( " código: " + produto.getCodigo() + " : " 
		+ produto.getDescricao() +" preço: " + produto.getPreco()+ 
		" quantidade estoque " + produto.getQuantidade());
		}
		}
	@Test
	
	public void buscar(){
		Long codigo = 1L;
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		
		if(produto == null){
			System.out.println("Nenhum registro encontrado");
		}else{
			System.out.println("Registro encontrado:");
			System.out.println( " código: " +produto.getCodigo() + ",  descrição: " + produto.getDescricao()+ ", " );
			System.out.println( " quantidade: " +produto.getQuantidade() +
					",  preço: " + produto.getPreco());
		}
		
	}
	}

