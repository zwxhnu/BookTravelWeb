package com.app.bigger.topic.action.bean;

import java.util.List;

import com.app.bigger.common.action.bean.Result;
import com.app.bigger.topic.model.Topic;
import com.app.bigger.user.model.User;

public class queryByKeyWordsResult extends Result {
	private List<Topic> topics;
	private List<User> users;

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
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
