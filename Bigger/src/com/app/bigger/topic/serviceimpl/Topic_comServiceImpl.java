package com.app.bigger.topic.serviceimpl;

import com.app.bigger.topic.dao.Topic_comDAO;
import com.app.bigger.topic.service.Topic_comService;

public class Topic_comServiceImpl implements Topic_comService {
	private Topic_comDAO topic_comdao;

	public Topic_comDAO getTopic_comdao() {
		return topic_comdao;
	}

	public void setTopic_comdao(Topic_comDAO topic_comdao) {
		this.topic_comdao = topic_comdao;
	}
}
