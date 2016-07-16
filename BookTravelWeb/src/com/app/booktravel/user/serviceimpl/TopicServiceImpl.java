package com.app.booktravel.user.serviceimpl;

import org.springframework.transaction.annotation.Transactional;

import com.app.booktravel.user.action.bean.QueryTopicDetailsResult;
import com.app.booktravel.user.action.bean.QueryTopicsResult;
import com.app.booktravel.user.dao.TopicDAO;
import com.app.booktravel.user.model.Comment;
import com.app.booktravel.user.model.Praise;
import com.app.booktravel.user.model.Topic;
import com.app.booktravel.user.service.TopicService;

public class TopicServiceImpl implements TopicService {
	private TopicDAO topicdao;

	public void setTopicdao(TopicDAO topicdao) {
		this.topicdao = topicdao;
	}

	@Override
	public QueryTopicsResult QueryTopics(int start, int offset) {
		// TODO Auto-generated method stub
		return topicdao.QueryTopics(start, offset);
	}

	@Override
	public QueryTopicsResult QueryTopicsByKeyWords(String keyword, int start, int offset) {
		// TODO Auto-generated method stub
		return topicdao.QueryTopicsByKeyWords(keyword, start, offset);
	}

	@Override
	public QueryTopicDetailsResult QueryTopicById(int topicid) {
		// TODO Auto-generated method stub
		return topicdao.QueryTopicById(topicid);
	}

	@Override
	public int CountPraiseNumByTopicId(int topicid) {
		// TODO Auto-generated method stub
		return topicdao.CountPraiseNumByTopicId(topicid);
	}

	@Override
	public int CountCommentNumByTopicId(int topicid) {
		// TODO Auto-generated method stub
		return topicdao.CountCommentNumByTopicId(topicid);
	}

	@Override
	@Transactional(rollbackFor = { Exception.class })
	public boolean addTopic(Topic t) {
		// TODO Auto-generated method stub
		return topicdao.addTopic(t);
	}

	@Override
	public Topic FindTopicById(int topicid) {
		// TODO Auto-generated method stub
		return topicdao.FindTopicById(topicid);
	}

	@Override
	@Transactional(rollbackFor = { Exception.class })
	public boolean deleteTopic(Topic topic) {
		// TODO Auto-generated method stub
		return topicdao.deleteTopic(topic);
	}

	@Override
	@Transactional(rollbackFor = { Exception.class })
	public boolean deleteComment(Comment comment) {
		// TODO Auto-generated method stub
		return topicdao.deleteComment(comment);
	}

	@Override
	@Transactional(rollbackFor = { Exception.class })
	public boolean deletePraise(Praise praise) {
		// TODO Auto-generated method stub
		return topicdao.deletePraise(praise);
	}

}
