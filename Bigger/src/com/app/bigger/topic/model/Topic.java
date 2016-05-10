package com.app.bigger.topic.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Topic entity. @author MyEclipse Persistence Tools
 */

public class Topic implements java.io.Serializable {

	// Fields

	private Integer topicid;
	private Integer userid;
	private Date time;
	private String title;
	private String lable;
	private String content;
	private String picture;
	private Integer laud;
	private Integer comment;
	private Integer join;
	private Integer hot;
	private Set topicComs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Topic() {
	}

	/** full constructor */
	public Topic(Integer userid, Date time, String title, String lable,
			String content, String picture, Integer laud, Integer comment,
			Integer join, Integer hot, Set topicComs) {
		this.userid = userid;
		this.time = time;
		this.title = title;
		this.lable = lable;
		this.content = content;
		this.picture = picture;
		this.laud = laud;
		this.comment = comment;
		this.join = join;
		this.hot = hot;
		this.topicComs = topicComs;
	}

	// Property accessors

	public Integer getTopicid() {
		return this.topicid;
	}

	public void setTopicid(Integer topicid) {
		this.topicid = topicid;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLable() {
		return this.lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getLaud() {
		return this.laud;
	}

	public void setLaud(Integer laud) {
		this.laud = laud;
	}

	public Integer getComment() {
		return this.comment;
	}

	public void setComment(Integer comment) {
		this.comment = comment;
	}

	public Integer getJoin() {
		return this.join;
	}

	public void setJoin(Integer join) {
		this.join = join;
	}

	public Integer getHot() {
		return this.hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Set getTopicComs() {
		return this.topicComs;
	}

	public void setTopicComs(Set topicComs) {
		this.topicComs = topicComs;
	}

	@Override
	public String toString() {
		return "Topic [topicid=" + topicid + ", userid=" + userid + ", time="
				+ time + ", title=" + title + ", lable=" + lable + ", content="
				+ content + ", picture=" + picture + ", laud=" + laud
				+ ", comment=" + comment + ", join=" + join + ", hot=" + hot
				+ ", topicComs=" + topicComs + "]";
	}
}