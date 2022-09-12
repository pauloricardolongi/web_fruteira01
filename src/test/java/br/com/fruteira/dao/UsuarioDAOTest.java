package br.com.fruteira.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.fruteira.domain.Pessoa;
import br.com.fruteira.domain.Usuario;

public class UsuarioDAOTest {
	@Test
	
	public void salvar(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);
		
		System.out.println("Pessoa Encontrada");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("Email: " + pessoa.getEmail());
		System.out.println("cidade: " + pessoa.getCidade().getNome());
		
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("q1w2e3r4");
		usuario.setTipo('A');
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
		
		System.out.println("Usuário salvo com sucesso.");
	}
}	


