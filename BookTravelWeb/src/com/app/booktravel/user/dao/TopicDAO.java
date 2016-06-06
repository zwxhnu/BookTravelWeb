package com.app.booktravel.user.dao;

import com.app.booktravel.user.action.bean.QueryMyTopicsResult;
import com.app.booktravel.user.action.bean.QueryTopicDetailsResult;
import com.app.booktravel.user.action.bean.QueryTopicsResult;
import com.app.booktravel.user.model.Topic;

public interface TopicDAO {
	public QueryTopicsResult QueryTopics(int start, int offset);
	
	public QueryTopicsResult QueryTopicsByKeyWords(String keyword, int start, int offset);
	
	public QueryTopicDetailsResult QueryTopicById(int topicid);
	
	public int CountPraiseNumByTopicId(int topicid);
	
	public int CountCommentNumByTopicId(int topicid);
	
	public boolean addTopic(Topic t);
}
