package com.app.booktravel.user.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Driftpoint entity. @author MyEclipse Persistence Tools
 */

public class Driftpoint implements java.io.Serializable {

	// Fields

	private Integer driftpointid;
	private String name;
	private String address;
	private String image;
	private String introduction;
	private Set activities = new HashSet(0);
	private Set books = new HashSet(0);

	// Constructors

	/** default constructor */
	public Driftpoint() {
	}

	/** full constructor */
	public Driftpoint(String name, String address, String image,
			String introduction, Set activities, Set books) {
		this.name = name;
		this.address = address;
		this.image = image;
		this.introduction = introduction;
		this.activities = activities;
		this.books = books;
	}

	// Property accessors

	public Integer getDriftpointid() {
		return this.driftpointid;
	}

	public void setDriftpointid(Integer driftpointid) {
		this.driftpointid = driftpointid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Set getActivities() {
		return this.activities;
	}

	public void setActivities(Set activities) {
		this.activities = activities;
	}

	public Set getBooks() {
		return this.books;
	}

	public void setBooks(Set books) {
		this.books = books;
	}

}