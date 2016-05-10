package com.app.bigger.topic.dao;

import com.app.bigger.topic.action.bean.FindTopicByIdResult;
import com.app.bigger.topic.action.bean.FindTopicByUseridResult;
import com.app.bigger.topic.action.bean.FindTopicsByLableResult;
import com.app.bigger.topic.action.bean.queryByKeyWordsResult;
import com.app.bigger.topic.action.bean.queryHotTopicResult;

public interface TopicDAO {
	public queryByKeyWordsResult findTopicsByKeywords(String keyword);

	public queryHotTopicResult findHotTopics(int sum);

	public FindTopicByIdResult findTopicById(String id);

	public FindTopicByUseridResult findTopicByUserid(String userid);

	public FindTopicsByLableResult FindTopicsByLable(String lable, String num);
}
