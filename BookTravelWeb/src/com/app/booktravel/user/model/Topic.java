package com.app.booktravel.user.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Topic entity. @author MyEclipse Persistence Tools
 */

public class Topic implements java.io.Serializable {

	// Fields

	private Integer topicid;
	private User user;
	private Book book;
	private String subject;
	private String content;
	private Timestamp time;
	private Set comments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Topic() {
	}

	/** full constructor */
	public Topic(User user, Book book, String subject, String content,
			Timestamp time, Set comments) {
		this.user = user;
		this.book = book;
		this.subject = subject;
		this.content = content;
		this.time = time;
		this.comments = comments;
	}

	// Property accessors

	public Integer getTopicid() {
		return this.topicid;
	}

	public void setTopicid(Integer topicid) {
		this.topicid = topicid;
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

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}