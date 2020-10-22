package com.adelgadillo.core.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.adelgadillo.core.components.PostComponent;
import com.adelgadillo.core.configuration.Page;
import com.adelgadillo.core.model.Post;

@Controller
@RequestMapping("/home")
public class BasicController {
	
	@Autowired
	private PostComponent _postComponent;
	@GetMapping(path = {"/posts","/"})
	public String post(Model model) {
		model.addAttribute("posts",this._postComponent.getPosts());
		return "index";
	}
	
	@GetMapping(path = {"/newPost"})
	public ModelAndView newPost(Model model) {
		return new ModelAndView(Page.NEW_POST).addObject("post",new Post());
	}
	
	@PostMapping("/addNewPost")
	public String addNewPost(Post post,Model model) {
		List<Post> posts = this._postComponent.getPosts();
		posts.add(post);
		model.addAttribute("posts",posts);
		return Page.HOME;
	}
	
	@GetMapping(path = {"/post","/post/{id}"})
	public ModelAndView getPost(@PathVariable(required = true,name="id") int id) {
		ModelAndView post = new ModelAndView(Page.POST);
		List<Post> filterPost = this._postComponent.getPosts().stream().filter((p) -> {
			return p.getId() == id;
		}).collect(Collectors.toList());

		post.addObject("post", filterPost.get(0));
		return post;
	}
	
	@GetMapping(path = {"/public"})
	public ModelAndView post() {
		ModelAndView modelAndView = new ModelAndView(Page.HOME);
		modelAndView.addObject("posts",this._postComponent.getPosts());
		return modelAndView;
	}
	
	@GetMapping(path = {"/holamundo"})
	public String holaMundo() {
		
		return "holaMundo";
	}
}
