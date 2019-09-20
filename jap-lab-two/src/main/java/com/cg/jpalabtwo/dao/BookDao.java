package com.cg.jpalabtwo.dao;

import java.util.List;

import com.cg.jpalabtwo.dto.Book;

public interface BookDao {
	public Book save(Book emp);
	public List<Book> findAll();
	public void remove(Integer empId);
	public List<Book> filterSalaryByRange(double min, double max);
}
