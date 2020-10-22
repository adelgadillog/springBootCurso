package com.adelgadillo.core.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.adelgadillo.core.model.Post;

@Component("postComponent")
public class PostComponent {

	public List<Post> getPosts() {
		ArrayList<Post> post = new ArrayList<>();
		post.add(new Post(1,
				"Desarrollo web 1 es un término que define la creación de sitios web para Internet o una intranet.",
				"Desarrollo Web 1 ", "http://localhost:8080/img/300px-Tecnologias_del_internet.png", new Date()));
		post.add(new Post(2,
				"Desarrollo web 2 es un término que define la creación de sitios web para Internet o una intranet.",
				"Desarrollo Web 2", "http://localhost:8080/img/300px-Tecnologias_del_internet.png", new Date()));
		post.add(new Post(3,
				"Desarrollo web 3 es un término que define la creación de sitios web para Internet o una intranet.",
				"Desarrollo Web 3 ", "http://localhost:8080/img/300px-Tecnologias_del_internet.png", new Date()));
		post.add(new Post(4,
				"Desarrollo web 4 es un término que define la creación de sitios web para Internet o una intranet.",
				"Desarrollo Web 4", "http://localhost:8080/img/300px-Tecnologias_del_internet.png", new Date()));
		
		return post;
	}
}
