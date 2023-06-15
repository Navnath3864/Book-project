package com.api.book.bootrestbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.entity.Book;
@Component
public class BookServicesImpl {
	
	private static List<Book> list = new ArrayList<>();

	static {
		list.add(new Book(12, "java by Nav", "Navnath"));
		list.add(new Book(13, "All about java", "abcd"));
		list.add(new Book(14, "concept og java", "wxyz"));
	}

	// get all books
	public List<Book> getAllBooks() {
		System.out.println("all book are returned!!!!!!!!!!!");
		return list;
	}

	// get single book by id

	public Book getBookById(int id) {
		Book book = null;
		book = list.stream().filter(e -> e.getId() == id).findFirst().get();
		System.out.println("book returned by id!!!!!!!!!!!!");
		return book;
	}
}
