package com.adelgadillo.core.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.adelgadillo.core.model.Post;
import com.adelgadillo.core.services.PostService;

@Service("serviceDecorado")
@Scope("singleton")
@Primary
public class PostServiceDecoradoImp  implements PostService {

	@Autowired
	private PostServiceImpl postServiceImpl;
	
	@Override
	public List<Post> validation(List<Post> posts) {
		
		posts  = postServiceImpl.validation(posts);
		for(Post post : posts) {
			if(post.getDescription() == null) {
				throw new NullPointerException("la descripcion esta nula");
			}
			if(post.getDate() == null) {
				throw new NullPointerException("la fecha esta nula");
			}
		}
			
		return posts;
	}

	@Override
	public void addClass(Class clazz) {
		System.out.println(clazz.getName());
	}

	@Override
	public List<Post> validationId(List<Post> posts) {

		for(Post post : posts) {
			if(post.getId() == 0) {
				throw new NullPointerException("el id esta nulo");
			}
		}
		return posts;
	}
}
