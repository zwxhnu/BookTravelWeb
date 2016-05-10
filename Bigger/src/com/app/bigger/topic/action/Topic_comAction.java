package com.app.bigger.topic.action;

import com.app.bigger.common.action.SuperAction;
import com.app.bigger.topic.service.Topic_comService;

public class Topic_comAction extends SuperAction {
	private Topic_comService topic_comservice;

	public Topic_comService getTopic_comservice() {
		return topic_comservice;
	}

	public void setTopic_comservice(Topic_comService topic_comservice) {
		this.topic_comservice = topic_comservice;
	}

}
