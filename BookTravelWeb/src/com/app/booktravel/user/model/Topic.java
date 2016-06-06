package com.app.booktravel.user.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.apache.struts2.json.annotations.JSON;

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
	private Set praises = new HashSet(0);
	private Set comments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Topic() {
	}

	/** full constructor */
	public Topic(User user, Book book, String subject, String content,
			Timestamp time, Set praises, Set comments) {
		this.user = user;
		this.book = book;
		this.subject = subject;
		this.content = content;
		this.time = time;
		this.praises = praises;
		this.comments = comments;
	}

	// Property accessors

	public Integer getTopicid() {
		return this.topicid;
	}

	public void setTopicid(Integer topicid) {
		this.topicid = topicid;
	}

	public int getUser() {
		return this.user.getUserid();
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getBook() {
		return this.book.getBookid();
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
	
	@JSON(serialize = false)
	public Set getPraises() {
		return this.praises;
	}

	public void setPraises(Set praises) {
		this.praises = praises;
	}
	
	@JSON(serialize = false)
	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}