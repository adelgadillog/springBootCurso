package com.adelgadillo.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adelgadillo.core.components.PostComponent;
import com.adelgadillo.core.model.Conexion;
import com.adelgadillo.core.model.Usuario;
import com.adelgadillo.core.services.PostService;

@SpringBootApplication

public class CursoSpringApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier("postComponent")
	public PostComponent postComponent;
	@Autowired
	@Qualifier("beanAleja")
	private Conexion conexion;
	@Autowired
	@Qualifier("beanAlejo")
	private Usuario usuario;

	@Autowired
	public PostService postService;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		postComponent.getPosts().forEach(p -> {
			System.out.println(p.getDescription());
		});
		
		postService.validationId(postComponent.getPosts()).forEach((post) ->
		{
			System.out.println(post.getTitle());
		});
		
		
		
	}

}
