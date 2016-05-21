package com.app.booktravel.user.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */

public class Book implements java.io.Serializable {

	// Fields

	private Integer bookid;
	private Driftpoint driftpoint;
	private String isbn;
	private String cover;
	private String introduction;
	private Float score;
	private Boolean state;
	private Integer recommend;
	private Integer owner;
	private String title;
	private Set topics = new HashSet(0);
	private Set driftprocesses = new HashSet(0);
	private Set bookreviews = new HashSet(0);

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** full constructor */
	public Book(Driftpoint driftpoint, String isbn, String cover,
			String introduction, Float score, Boolean state, Integer recommend,
			Integer owner, String title, Set topics, Set driftprocesses, Set bookreviews) {
		this.driftpoint = driftpoint;
		this.isbn = isbn;
		this.cover = cover;
		this.introduction = introduction;
		this.score = score;
		this.state = state;
		this.recommend = recommend;
		this.owner = owner;
		this.title = title;
		this.topics = topics;
		this.driftprocesses = driftprocesses;
		this.bookreviews = bookreviews;
	}

	// Property accessors

	public Integer getBookid() {
		return this.bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public Driftpoint getDriftpoint() {
		return this.driftpoint;
	}

	public void setDriftpoint(Driftpoint driftpoint) {
		this.driftpoint = driftpoint;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCover() {
		return this.cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Float getScore() {
		return this.score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public Integer getRecommend() {
		return this.recommend;
	}

	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}

	public Integer getOwner() {
		return this.owner;
	}

	public void setOwner(Integer owner) {
		this.owner = owner;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public Set getTopics() {
		return this.topics;
	}

	public void setTopics(Set topics) {
		this.topics = topics;
	}

	public Set getDriftprocesses() {
		return this.driftprocesses;
	}

	public void setDriftprocesses(Set driftprocesses) {
		this.driftprocesses = driftprocesses;
	}

	public Set getBookreviews() {
		return this.bookreviews;
	}

	public void setBookreviews(Set bookreviews) {
		this.bookreviews = bookreviews;
	}

}