package com.app.bigger.topic.serviceimpl;

import com.app.bigger.topic.action.bean.FindTopicByIdResult;
import com.app.bigger.topic.action.bean.FindTopicByUseridResult;
import com.app.bigger.topic.action.bean.FindTopicsByLableResult;
import com.app.bigger.topic.action.bean.queryByKeyWordsResult;
import com.app.bigger.topic.action.bean.queryHotTopicResult;
import com.app.bigger.topic.dao.TopicDAO;
import com.app.bigger.topic.service.TopicService;

public class TopicServiceImpl implements TopicService {
	private TopicDAO topicdao;

	public TopicDAO getTopicdao() {
		return topicdao;
	}

	public void setTopicdao(TopicDAO topicdao) {
		this.topicdao = topicdao;
	}

	@Override
	public queryByKeyWordsResult findTopicsByKeywords(String keyword) {
		// TODO Auto-generated method stub
		return topicdao.findTopicsByKeywords(keyword);
	}

	@Override
	public queryHotTopicResult findHotTopics(int sum) {
		// TODO Auto-generated method stub
		return topicdao.findHotTopics(sum);
	}

	@Override
	public FindTopicByIdResult findTopicById(String id) {
		// TODO Auto-generated method stub
		return topicdao.findTopicById(id);
	}

	@Override
	public FindTopicByUseridResult findTopicByUserid(String userid) {
		// TODO Auto-generated method stub
		return topicdao.findTopicByUserid(userid);
	}

	@Override
	public FindTopicsByLableResult FindTopicsByLable(String lable, String num) {
		// TODO Auto-generated method stub
		return topicdao.FindTopicsByLable(lable, num);
	}
}
