package br.com.fruteira.dao;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.fruteira.domain.Funcionario;
import br.com.fruteira.domain.Pessoa;


public class FuncionarioDAOTest {
	
	
@Test
@Ignore
	public void salvar() throws ParseException{
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(4L);
		
		System.out.println("Pessoa Encontrada");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("email: " + pessoa.getEmail());
		
		
		Funcionario funcionario= new Funcionario();
		funcionario.setPessoa(pessoa);
		funcionario.setCarteiraTrabalho("ab2222vc");
		funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse("15/09/2022"));

		
		FuncionarioDAO funcionarioDAO   = new FuncionarioDAO();
		funcionarioDAO.salvar(funcionario);
		
		System.out.println("Funcionário salvo com sucesso.");
	}

	@Test
	@Ignore
	public void buscar(){
	Long codigo = 6L;
	
	FuncionarioDAO funcionarioDAO  = new FuncionarioDAO();
	Funcionario funcionario = funcionarioDAO.buscar(codigo);
	System.out.println("Código do funcionario: " + funcionario.getCodigo());
	System.out.println("Data de admissao: " + funcionario.getDataAdmissao());
	System.out.println("Número Carteira de trabalho: " + funcionario.getCarteiraTrabalho());
	System.out.println("Nome do Funcionário: " + funcionario.getPessoa().getNome());
	System.out.println("CPF: " + funcionario.getPessoa().getCpf());
	System.out.println("telefone: " + funcionario.getPessoa().getTelefone());
	System.out.println("email: " + funcionario.getPessoa().getEmail());	
	System.out.println("rua: " + funcionario.getPessoa().getRua());
	System.out.println("número: " + funcionario.getPessoa().getNumero());
	System.out.println("bairro: " + funcionario.getPessoa().getBairro());
		
		
		System.out.println("busca de funcionário  com sucesso.");
	}
	@Test
	@Ignore
	public void listar() {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		List<Funcionario> resultado = funcionarioDAO.listar();

		for (Funcionario funcionario : resultado) {
			System.out.println("Código do funcionário: " + funcionario.getCodigo());
			System.out.println("Nome do funcionário: " + funcionario.getPessoa().getNome());
			System.out.println("Carteira de trabalho: " + funcionario.getCarteiraTrabalho());
			System.out.println("Data de Admissao: " + funcionario.getDataAdmissao());
			System.out.println("Código da Pessoa: " + funcionario.getPessoa().getCodigo());
		
			
			
			System.out.println();
		}
	}
	
	
}
	



