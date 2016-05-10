package com.app.bigger.topic.action.bean;

import java.util.List;

import com.app.bigger.common.action.bean.Result;
import com.app.bigger.topic.model.Topic;

public class FindTopicsByLableResult extends Result {
	private List<Topic> topics;

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	@Override
	public int getCode() {
		// TODO Auto-generated method stub
		return super.getCode();
	}

	@Override
	public void setCode(int code) {
		// TODO Auto-generated method stub
		super.setCode(code);
	}
}
