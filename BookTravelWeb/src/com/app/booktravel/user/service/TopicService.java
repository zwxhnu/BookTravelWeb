package com.app.booktravel.user.service;


import com.app.booktravel.user.action.bean.QueryTopicDetailsResult;
import com.app.booktravel.user.action.bean.QueryTopicsResult;
import com.app.booktravel.user.model.Comment;
import com.app.booktravel.user.model.Praise;
import com.app.booktravel.user.model.Topic;

public interface TopicService {
	public QueryTopicsResult QueryTopics(int start, int offset);
	
	public QueryTopicsResult QueryTopicsByKeyWords(String keyword, int start, int offset);
	
	public QueryTopicDetailsResult QueryTopicById(int topicid);
	
	public int CountPraiseNumByTopicId(int topicid);
	
	public int CountCommentNumByTopicId(int topicid);
	
	public boolean addTopic(Topic t);
	
	public Topic FindTopicById(int topicid);
	
	public boolean deleteTopic(Topic topic);
	
	public boolean deleteComment(Comment comment);
	
	public boolean deletePraise(Praise praise);
}
