package com.app.booktravel.user.action;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.service.TopicService;

public class TopicAction extends SuperAction {
	private TopicService topicservice;

	public TopicService getTopicservice() {
		return topicservice;
	}

	public void setTopicservice(TopicService topicservice) {
		this.topicservice = topicservice;
	}

}
