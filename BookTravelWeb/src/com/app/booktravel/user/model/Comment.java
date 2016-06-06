package com.app.booktravel.user.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Integer commentid;
	private Topic topic;
	private User user;
	private String content;
	private Timestamp time;
	private Integer aimedid;
	private Set praises = new HashSet(0);

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** full constructor */
	public Comment(Topic topic, User user, String content, Timestamp time,
			Integer aimedid, Set praises) {
		this.topic = topic;
		this.user = user;
		this.content = content;
		this.time = time;
		this.aimedid = aimedid;
		this.praises = praises;
	}

	// Property accessors

	public Integer getCommentid() {
		return this.commentid;
	}

	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public Integer getAimedid() {
		return this.aimedid;
	}

	public void setAimedid(Integer aimedid) {
		this.aimedid = aimedid;
	}

	public Set getPraises() {
		return this.praises;
	}

	public void setPraises(Set praises) {
		this.praises = praises;
	}

}