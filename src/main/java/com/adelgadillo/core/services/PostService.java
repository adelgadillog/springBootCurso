package com.adelgadillo.core.services;

import java.util.List;

import com.adelgadillo.core.model.Post;

public interface PostService {

	public List<Post> validation(List<Post> posts );

	void addClass(Class clazz);

	public Iterable<Post> validationId(List<Post> posts);
	
	
}
