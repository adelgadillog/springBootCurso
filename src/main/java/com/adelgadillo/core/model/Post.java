package com.adelgadillo.core.model;

import java.util.Date;

public class Post {
	private int id;
	private String description;
	private String title;
	private String urlImg = "http://localhost:8080/img/300px-Tecnologias_del_internet.png";
	private Date date= new Date();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Post(int id, String description, String title, String urlImg, Date date) {
		super();
		this.id = id;
		this.description = description;
		this.title = title;
		this.urlImg = urlImg;
		this.date = date;
	}
	
	public Post() {
		
	}
	
	
}
