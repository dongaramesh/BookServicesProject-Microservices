package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	public String addBook(Book book) {
		Book book1=bookRepository.save(book);
		if(book1 != null) {
			return "Registered book successfully";
		}
		return "Something went wrong";
	}
	
	public String deleteBook(Book book) {
		try {
			bookRepository.delete(book);
		}catch(Exception e) {
		
			return e.getMessage();
		}
		
		return "Deleted successfully";
	}
	
	
	public List<Book> getAll(){
		List<Book> books=bookRepository.findAll();
		return books;
	}
	
	public String removeBookById(int id) {
		bookRepository.deleteById(id);
		return "deleted successfully";
	}
}
