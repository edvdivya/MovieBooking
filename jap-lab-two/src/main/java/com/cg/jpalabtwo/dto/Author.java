package com.cg.jpalabtwo.dto;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Author {
	@Id
	@Column(name="author_id")
	private Integer authorId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="middle_name")
	private String middleName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="phone_no")
	private BigInteger phoneNo;
	
	@JoinTable(name="join_author_book", 
			joinColumns= @JoinColumn(name="author_id", referencedColumnName = "authorId"),
			inverseJoinColumns= @JoinColumn(name="isbn", referencedColumnName = "ISBN"))
	private List<Book> book;

	
	
	
	
	
	
	
	
	
	
	
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Author(Integer authorId, String firstName, String middleName, String lastName, BigInteger phoneNo,
			List<Book> book) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.book = book;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigInteger getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(BigInteger phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	
	
	

}
