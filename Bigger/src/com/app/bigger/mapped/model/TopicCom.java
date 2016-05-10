package com.app.bigger.mapped.model;

import com.app.bigger.topic.model.Topic;
import com.app.bigger.topic.model.Topiccom;

/**
 * TopicCom entity. @author MyEclipse Persistence Tools
 */

public class TopicCom implements java.io.Serializable {

	// Fields

	private Integer id;
	private Topic topic;
	private Topiccom topiccom;

	// Constructors

	/** default constructor */
	public TopicCom() {
	}

	/** full constructor */
	public TopicCom(Topic topic, Topiccom topiccom) {
		this.topic = topic;
		this.topiccom = topiccom;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Topiccom getTopiccom() {
		return this.topiccom;
	}

	public void setTopiccom(Topiccom topiccom) {
		this.topiccom = topiccom;
	}
}