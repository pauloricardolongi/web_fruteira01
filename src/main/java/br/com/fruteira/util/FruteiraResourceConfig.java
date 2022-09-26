package br.com.fruteira.util;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

//http://localhost:8080/Fruteira/rest
@ApplicationPath("rest")

public class FruteiraResourceConfig extends ResourceConfig {
	public FruteiraResourceConfig(){
		packages("br.com.fruteira.service");
	}
}
