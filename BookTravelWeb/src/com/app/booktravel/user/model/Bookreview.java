package com.app.booktravel.user.model;

import java.sql.Timestamp;

/**
 * Bookreview entity. @author MyEclipse Persistence Tools
 */

public class Bookreview implements java.io.Serializable {

	// Fields

	private Integer bookreviewid;
	private User user;
	private Book book;
	private String content;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public Bookreview() {
	}

	/** full constructor */
	public Bookreview(User user, Book book, String content, Timestamp time) {
		this.user = user;
		this.book = book;
		this.content = content;
		this.time = time;
	}

	// Property accessors

	public Integer getBookreviewid() {
		return this.bookreviewid;
	}

	public void setBookreviewid(Integer bookreviewid) {
		this.bookreviewid = bookreviewid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}