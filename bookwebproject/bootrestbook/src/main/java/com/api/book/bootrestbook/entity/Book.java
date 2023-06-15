package com.api.book.bootrestbook.entity;

public class Book {
	private int id;
	private String booktitle;
	private String author;

	public Book(int id, String booktitle, String author) {
		super();
		this.id = id;
		this.booktitle = booktitle;
		this.author = author;
	}

	public Book() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", booktitle=" + booktitle + ", author=" + author + "]";
	}

}
