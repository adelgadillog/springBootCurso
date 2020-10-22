package com.adelgadillo.core.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.adelgadillo.core.model.Conexion;
import com.adelgadillo.core.model.Usuario;

@Component
public class CreandoConexion {

	@Bean(name = "beanAlejo")
	public Usuario getUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNombre("ALejo");
		usuario.setApellido("garcia");
		return usuario;
		
	}
	
	@Bean(name = "teo")
	public void getTeo() {
		System.out.println("Hola soy teo");
	}
	 @Bean(name = "beanAleja")
	 public Conexion getConexion() {
		 Conexion conexion = new Conexion();
		 conexion.setDb("esta es una prueba de aleja");
		 conexion.setUrl("localhost");
		 return conexion;
	 }
}
