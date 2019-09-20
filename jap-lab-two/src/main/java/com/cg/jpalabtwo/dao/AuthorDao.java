package com.cg.jpalabtwo.dao;

import java.util.List;

import com.cg.jpalabtwo.dto.Author;

public interface AuthorDao {
	public Author save(Author emp);
	public List<Author> findAll();
	public void remove(Integer empId);
	public List<Author> filterSalaryByRange(double min, double max);
}
