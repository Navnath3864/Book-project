package com.api.book.bootrestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.entity.Book;

import com.api.book.bootrestbook.service.BookServicesImpl;

@RestController
// @Controller -> @responseBody is required in class
public class BookController {

	@Autowired
	private BookServicesImpl bookServicesImpl;

	// @GetMapping("/books")
//	@RequestMapping(value = "/books", method = RequestMethod.GET)
//	@ResponseBody

	/*
	 * public Book getBook() { System.out.println("done!!!!!!!!!!!!"); Book book =
	 * new Book(); book.setId(1); book.setBooktitle("abc"); book.setAuthor("xyz");
	 * return book; }
	 */

	@GetMapping("/books")
	public List<Book> getAllBook() {
		return this.bookServicesImpl.getAllBooks();
	}

	@GetMapping("/books/{id}")

	public Book getBook(@PathVariable ("id") int id) {
		return bookServicesImpl.getBookById(id);
	}
}
