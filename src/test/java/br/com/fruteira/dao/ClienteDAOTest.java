package br.com.fruteira.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.fruteira.domain.Cliente;

import br.com.fruteira.domain.Pessoa;

		public class ClienteDAOTest {
			@Test
			@Ignore
			public void salvar() throws ParseException {
				PessoaDAO pessoaDAO = new PessoaDAO();
				Pessoa pessoa = pessoaDAO.buscar(2L);

				Cliente cliente = new Cliente();
				cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2015"));
				cliente.setLiberado(false);
				cliente.setPessoa(pessoa);

				ClienteDAO clienteDAO = new ClienteDAO();
				clienteDAO.salvar(cliente);

				System.out.println("Cliente salvo com sucesso.");
			}
			@Test
			@Ignore
			public void buscar(){
			Long codigo = 3L;
			
			ClienteDAO clienteDAO  = new ClienteDAO();
			Cliente cliente = clienteDAO.buscar(codigo);
			System.out.println("Código do Cliente: " + cliente.getCodigo());
			System.out.println("Data do cadastro: " + cliente.getDataCadastro());
			System.out.println("Situação: " + cliente.getLiberado());
			System.out.println("Nome do Cliente: " + cliente.getPessoa().getNome());
			System.out.println("telefone do Cliente: " + cliente.getPessoa().getTelefone());
			System.out.println("email do Cliente: " + cliente.getPessoa().getEmail());

			
		
				
				System.out.println("busca de funcionário  com sucesso.");
		}

			@Test
			@Ignore
			public void listar() {
				ClienteDAO clienteDAO  = new ClienteDAO();
				List<Cliente> resultado = clienteDAO.listar();

				for (Cliente cliente : resultado) {
					System.out.println("Código do cliente: " + cliente.getCodigo());
					System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
					System.out.println("data: " + cliente.getDataCadastro());
					System.out.println("situação: " + cliente.getLiberado());
					
					
					System.out.println();
				}
			}
			


	}









