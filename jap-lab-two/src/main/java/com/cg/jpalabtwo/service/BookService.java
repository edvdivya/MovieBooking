package com.cg.jpalabtwo.service;

import java.util.List;

import com.cg.jpalabtwo.dto.Book;

public interface BookService {
	public Book save(Book emp);
	public List<Book> findAll();
	public void remove(Integer empId);
	public List<Book> filterSalaryByRange(double min, double max);
}
