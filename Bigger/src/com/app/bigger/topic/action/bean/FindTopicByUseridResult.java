package com.app.bigger.topic.action.bean;

import com.app.bigger.common.action.bean.Result;
import com.app.bigger.topic.model.Topic;

public class FindTopicByUseridResult extends Result {
	private Topic topic;

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
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
