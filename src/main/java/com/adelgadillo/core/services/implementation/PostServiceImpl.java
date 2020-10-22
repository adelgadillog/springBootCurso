package com.adelgadillo.core.services.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adelgadillo.core.model.Post;
import com.adelgadillo.core.services.PostService;

@Service
public class PostServiceImpl implements PostService{

	@Override
	public List<Post> validation(List<Post> posts) {
		for(Post post: posts) {
			if(post.getTitle() == null) {
				throw	new NullPointerException("El titulo esta vacio");
			}
		}
		return posts;
	}

}
