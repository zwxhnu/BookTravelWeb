package com.app.bigger.topic.serviceimpl;

import com.app.bigger.topic.dao.TopiccomDAO;
import com.app.bigger.topic.service.TopiccomService;

public class TopiccomServiceImpl implements TopiccomService {
	private TopiccomDAO topiccomdao;

	public TopiccomDAO getTopiccomdao() {
		return topiccomdao;
	}

	public void setTopiccomdao(TopiccomDAO topiccomdao) {
		this.topiccomdao = topiccomdao;
	}
}
