package com.app.booktravel.user.model;

import java.sql.Timestamp;

/**
 * Driftprocess entity. @author MyEclipse Persistence Tools
 */

public class Driftprocess implements java.io.Serializable {

	// Fields

	private Integer driftprocessid;
	private User user;
	private Book book;
	private Timestamp time;
	private String place;
	private Boolean flag;

	// Constructors

	/** default constructor */
	public Driftprocess() {
	}

	/** minimal constructor */
	public Driftprocess(Timestamp time, String place, Boolean flag) {
		this.time = time;
		this.place = place;
		this.flag = flag;
	}

	/** full constructor */
	public Driftprocess(User user, Book book, Timestamp time, String place,
			Boolean flag) {
		this.user = user;
		this.book = book;
		this.time = time;
		this.place = place;
		this.flag = flag;
	}

	// Property accessors

	public Integer getDriftprocessid() {
		return this.driftprocessid;
	}

	public void setDriftprocessid(Integer driftprocessid) {
		this.driftprocessid = driftprocessid;
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

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Boolean getFlag() {
		return this.flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

}