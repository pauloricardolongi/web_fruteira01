package br.com.fruteira.dao;

import java.util.List;

import org.junit.Ignore;


import org.junit.Test;

import br.com.fruteira.domain.Cidade;
import br.com.fruteira.domain.Funcionario;
import br.com.fruteira.domain.Pessoa;

public class PessoaDAOTest {

@Test
@Ignore
	public void salvar(){
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(1L);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Paulo Santos");
		pessoa.setCidade(cidade);
		pessoa.setRua("Jucambeira");
		pessoa.setNumero(new Short("75"));
		pessoa.setBairro("centro");
		pessoa.setTelefone("99977788");
		pessoa.setEmail("paulo@gmail.com");
		pessoa.setCep("888999999");
		pessoa.setCpf("09998877");
		
		
		
		
		System.out.println("Pessoa salva com sucesso");
	}
@Test
@Ignore
public void listar() {
	
	PessoaDAO pessoaDAO = new PessoaDAO();	
	List<Pessoa> resultado = pessoaDAO.listar();

	System.out.println("Total de Registros Encontrados: " + resultado.size());

	for (Pessoa pessoa : resultado) {
		System.out.println( " código: " + pessoa.getCodigo() + " pessoa: " 
	+ pessoa.getNome());
	}
	}
@Test
@Ignore
public void buscar(){
	Long codigo = 3L;
	
	PessoaDAO pessoaDAO = new PessoaDAO();
	Pessoa pessoa = pessoaDAO.buscar(codigo);
	
	if(pessoa == null){
		System.out.println("Nenhum registro encontrado");
	}else{
		System.out.println("Registro encontrado:");
		System.out.println( " código: " +pessoa.getCodigo() + " - " + pessoa.getNome()+ ", " );
		System.out.println( " CPF: " +pessoa.getCpf() + ",  email: " + pessoa.getEmail());
	}
	
}
@Test
@Ignore
public void excluir(){
	Long codigo = 3L;
	PessoaDAO pessoaDAO = new PessoaDAO();
	Pessoa pessoa = pessoaDAO.buscar(codigo);
	
	if(pessoa == null){
		System.out.println("Nenhum registro da pessoa encontrado");
	}else{
		pessoaDAO.excluir(pessoa);
		System.out.println("Registro removido:");
		System.out.println("Código " + pessoa.getCodigo() + " - " + pessoa.getNome()
		+ " - " + pessoa.getEmail() + " - " + pessoa.getCidade());
	}
}
}
