package com.cg.jpalabtwo.service;

import java.util.List;

import com.cg.jpalabtwo.dto.Author;


public interface AuthorService {
	public Author save(Author emp);
	public List<Author> findAll();
	public void remove(Integer empId);
	public List<Author> filterSalaryByRange(double min, double max);
}

