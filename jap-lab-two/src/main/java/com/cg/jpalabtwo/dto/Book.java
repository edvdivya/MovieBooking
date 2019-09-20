package com.cg.jpalabtwo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Book {
	
	@Id
	@Column(name="isbn")
	private String ISBN;
	@Column(name="title")
	private String title;
	@Column(name="price")
	private Double price;
	
	@ManyToMany
	@JoinTable(name="join_author_book", 
				joinColumns= @JoinColumn(name="isbn", referencedColumnName = "ISBN"),
				inverseJoinColumns= @JoinColumn(name="author_id", referencedColumnName = "authorId"))
	private List<Author> author;

	
	
	
	
	
	
	
	
	
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String iSBN, String title, Double price, List<Author> author) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}
	
	
	
	
}
