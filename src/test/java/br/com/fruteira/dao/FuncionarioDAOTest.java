package br.com.fruteira.dao;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import org.junit.Ignore;
import org.junit.Test;

import br.com.fruteira.domain.Funcionario;
import br.com.fruteira.domain.Pessoa;

public class FuncionarioDAOTest {
	
	@Test

	public void salvar() throws ParseException{
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(1L);
		
		System.out.println("Pessoa Encontrada");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("Email: " + pessoa.getEmail());
		System.out.println("cidade: " + pessoa.getCidade().getNome());
		System.out.println("celular: " + pessoa.getCelular());
		
		
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setPessoa(pessoa);
		funcionario.setCarteiraTrabalho("11174as88");
		funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2022"));
		
		
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.salvar(funcionario);
		
		
		System.out.println("Funcionário salvo com sucesso.");
	}
}	





