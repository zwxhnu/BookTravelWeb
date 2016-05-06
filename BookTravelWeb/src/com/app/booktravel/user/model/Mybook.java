package com.app.booktravel.user.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Mybook entity. @author MyEclipse Persistence Tools
 */

public class Mybook implements java.io.Serializable {

	// Fields

	private Integer mybookid;
	private User user;
	private String collection;
	private String reading;
	private String readed;
	private String toevaluate;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Mybook() {
	}

	/** full constructor */
	public Mybook(User user, String collection, String reading, String readed,
			String toevaluate, Set users) {
		this.user = user;
		this.collection = collection;
		this.reading = reading;
		this.readed = readed;
		this.toevaluate = toevaluate;
		this.users = users;
	}

	// Property accessors

	public Integer getMybookid() {
		return this.mybookid;
	}

	public void setMybookid(Integer mybookid) {
		this.mybookid = mybookid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCollection() {
		return this.collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getReading() {
		return this.reading;
	}

	public void setReading(String reading) {
		this.reading = reading;
	}

	public String getReaded() {
		return this.readed;
	}

	public void setReaded(String readed) {
		this.readed = readed;
	}

	public String getToevaluate() {
		return this.toevaluate;
	}

	public void setToevaluate(String toevaluate) {
		this.toevaluate = toevaluate;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}