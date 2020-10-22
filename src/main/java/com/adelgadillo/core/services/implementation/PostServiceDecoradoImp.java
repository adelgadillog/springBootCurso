package com.adelgadillo.core.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adelgadillo.core.model.Post;
import com.adelgadillo.core.services.PostService;

@Service("serviceDecorado")
public class PostServiceDecoradoImp  implements PostService {

	@Autowired
	private PostServiceImpl postServiceImpl;
	
	@Override
	public List<Post> validation(List<Post> posts) {
		
		posts  = postServiceImpl.validation(posts);
		return null;
	}

}
