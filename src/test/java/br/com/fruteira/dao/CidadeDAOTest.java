package br.com.fruteira.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.fruteira.domain.Cidade;
import br.com.fruteira.domain.Estado;

public class CidadeDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Long codigoEstado = 1L;		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigoEstado);

		Cidade cidade = new Cidade();		
		cidade.setNome("Ivorá");
		cidade.setEstado(estado);

		CidadeDAO cidadeDAO = new CidadeDAO();		
		cidadeDAO.salvar(cidade);
	}

	@Test
	@Ignore
	public void listar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();

		for (Cidade cidade : resultado) {
			System.out.println("Código da Cidade: " + cidade.getCodigo());
			System.out.println("Nome da Cidade: " + cidade.getNome());
			System.out.println("Código do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
			System.out.println();
		}
	}
	
	@Test
	@Ignore
	public void buscar(){
		Long codigo = 19L;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		
		System.out.println("Código da Cidade: " + cidade.getCodigo());
		System.out.println("Nome da Cidade: " + cidade.getNome());
		System.out.println("Código do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		
		
	}
	
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 3L;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		
		cidadeDAO.excluir(cidade);
		
		System.out.println("Cidade Removida");
		System.out.println("Código da Cidade: " + cidade.getCodigo());
		System.out.println("Nome da Cidade: " + cidade.getNome());
		System.out.println("Código do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
	}
	
	@Test
	@Ignore
	public void editar(){
		Long codigoCidade = 1L;
		Long codigoEstado = 1L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigoEstado);
		
		System.out.println("Código do Estado: " + estado.getCodigo());
		System.out.println("Sigla do Estado: " + estado.getSigla());
		System.out.println("Nome do Estado: " + estado.getNome());
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		
		System.out.println("Cidade A Ser Editada");
		System.out.println("Código da Cidade: " + cidade.getCodigo());
		System.out.println("Nome da Cidade: " + cidade.getNome());
		System.out.println("Código do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		
		cidade.setNome("Porto Alegre");
		cidade.setEstado(estado);
		
		cidadeDAO.editar(cidade);
		
		System.out.println("Cidade Editada");
		System.out.println("Código da Cidade: " + cidade.getCodigo());
		System.out.println("Nome da Cidade: " + cidade.getNome());
		System.out.println("Código do Estado: " + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
	}
}


