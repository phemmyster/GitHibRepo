package com.apress.bookstore.service;

import java.util.List;

import com.apress.bookstore.dao.BookDAO;
import com.apress.bookstore.dao.BookDAOImpl;
import com.apress.bookstore.model.Book;
import com.apress.bookstore.model.Category;

public class BookServiceImpl implements BookService{
	private static BookDAO bookDao = new BookDAOImpl();
	
	
	public List<Book> findAll() {
		List<Book> list  = bookDao.findAllBooks();
		return list;
	}

	public List<Category> findAllCategories() {
		List<Category> list  = bookDao.findAllCategories();
		return list;
	}

	public List<Book> searchBooksByKeyword(String keyWord) {
		List<Book> list  = bookDao.searchBooksByKeyword(keyWord);
		return list;
	}

}
