package com.app.bigger.topic.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Topiccom entity. @author MyEclipse Persistence Tools
 */

public class Topiccom implements java.io.Serializable {

	// Fields

	private Integer topiccomid;
	private Integer userid;
	private String content;
	private Integer replycomid;
	private Date time;
	private Set topicComs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Topiccom() {
	}

	/** full constructor */
	public Topiccom(Integer userid, String content, Integer replycomid,
			Date time, Set topicComs) {
		this.userid = userid;
		this.content = content;
		this.replycomid = replycomid;
		this.time = time;
		this.topicComs = topicComs;
	}

	// Property accessors

	public Integer getTopiccomid() {
		return this.topiccomid;
	}

	public void setTopiccomid(Integer topiccomid) {
		this.topiccomid = topiccomid;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getReplycomid() {
		return this.replycomid;
	}

	public void setReplycomid(Integer replycomid) {
		this.replycomid = replycomid;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Set getTopicComs() {
		return this.topicComs;
	}

	public void setTopicComs(Set topicComs) {
		this.topicComs = topicComs;
	}

	@Override
	public String toString() {
		return "Topiccom [topiccomid=" + topiccomid + ", userid=" + userid
				+ ", content=" + content + ", replycomid=" + replycomid
				+ ", time=" + time + ", topicComs=" + topicComs + "]";
	}
}