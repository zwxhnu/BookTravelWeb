package com.app.bigger.topic.action;

import com.app.bigger.common.action.SuperAction;
import com.app.bigger.topic.service.TopiccomService;

public class TopiccomAction extends SuperAction {
	private TopiccomService topiccomservice;

	public TopiccomService getTopiccomservice() {
		return topiccomservice;
	}

	public void setTopiccomservice(TopiccomService topiccomservice) {
		this.topiccomservice = topiccomservice;
	}
}
