package br.com.fruteira.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;


import br.com.fruteira.domain.Usuario;
import br.com.fruteira.util.HibernateUtil;

public class UsuarioDAO extends GenericDAO<Usuario>{
	@SuppressWarnings("unchecked")
	public List<Usuario> listarOrdenado() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Usuario.class);
			consulta.createAlias("pessoa", "p");
			consulta.addOrder(Order.asc("p.nome"));
			List<Usuario> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}

}
