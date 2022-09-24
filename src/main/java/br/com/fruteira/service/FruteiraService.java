package br.com.fruteira.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

// http://localhost:8080/Fruteira/rest/fruteira

@Path("fruteira")
public class FruteiraService {
	@GET
	public String exibir(){
		return "Curso fruteira";
	}
}
