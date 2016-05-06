package com.app.booktravel.user.model;

import java.sql.Timestamp;

/**
 * Activity entity. @author MyEclipse Persistence Tools
 */

public class Activity implements java.io.Serializable {

	// Fields

	private Integer activityid;
	private Driftpoint driftpoint;
	private String content;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public Activity() {
	}

	/** minimal constructor */
	public Activity(String content) {
		this.content = content;
	}

	/** full constructor */
	public Activity(Driftpoint driftpoint, String content, Timestamp time) {
		this.driftpoint = driftpoint;
		this.content = content;
		this.time = time;
	}

	// Property accessors

	public Integer getActivityid() {
		return this.activityid;
	}

	public void setActivityid(Integer activityid) {
		this.activityid = activityid;
	}

	public Driftpoint getDriftpoint() {
		return this.driftpoint;
	}

	public void setDriftpoint(Driftpoint driftpoint) {
		this.driftpoint = driftpoint;
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