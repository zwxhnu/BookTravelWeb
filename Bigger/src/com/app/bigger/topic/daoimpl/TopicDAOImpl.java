package com.app.bigger.topic.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.app.bigger.topic.action.bean.FindTopicByIdResult;
import com.app.bigger.topic.action.bean.FindTopicByUseridResult;
import com.app.bigger.topic.action.bean.FindTopicsByLableResult;
import com.app.bigger.topic.action.bean.queryByKeyWordsResult;
import com.app.bigger.topic.action.bean.queryHotTopicResult;
import com.app.bigger.topic.dao.TopicDAO;
import com.app.bigger.topic.model.Topic;
import com.app.bigger.topic.model.Topiccom;
import com.app.bigger.user.model.User;

public class TopicDAOImpl extends HibernateDaoSupport implements TopicDAO {
	@Override
	public queryByKeyWordsResult findTopicsByKeywords(String keyword) {
		// TODO Auto-generated method stub
		queryByKeyWordsResult queryresult = new queryByKeyWordsResult();
		String query = "from Topic where title like ? or lable like ? or content like ?";
		List<Topic> topics = (List) getHibernateTemplate().find(query,
				"%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%");
		String querysql = "from User where username like ?";
		List<User> users = (List) getHibernateTemplate().find(querysql,
				"%" + keyword + "%");
		queryresult.setTopics(topics);
		queryresult.setUsers(users);
		return queryresult;
	}

	@Override
	public queryHotTopicResult findHotTopics(int sum) {
		// TODO Auto-generated method stub
		queryHotTopicResult queryresult = new queryHotTopicResult();
		String sql = "from Topic order by hot desc limit 0," + sum;
		List<Topic> list = (List<Topic>) getHibernateTemplate().find(sql);
		queryresult.setTopics(list);
		return queryresult;
	}

	@Override
	public FindTopicByIdResult findTopicById(String id) {
		// TODO Auto-generated method stub
		FindTopicByIdResult result = new FindTopicByIdResult();
		String qrytopic = "from Topic where topicid=" + id;
		List<Topic> topics = (List<Topic>) getHibernateTemplate()
				.find(qrytopic);
		if (topics.size() > 0)
			result.setTopic(topics.get(0));
		return result;
	}

	@Override
	public FindTopicByUseridResult findTopicByUserid(String userid) {
		// TODO Auto-generated method stub
		FindTopicByUseridResult res = new FindTopicByUseridResult();
		String qry = "from Topic where userid=" + userid;
		List<Topic> topic = (List<Topic>) getHibernateTemplate().find(qry);
		if (topic.size() > 0) {
			res.setTopic(topic.get(0));
			return res;
		}
		return res;
	}

	@Override
	public FindTopicsByLableResult FindTopicsByLable(String lable, String num) {
		// TODO Auto-generated method stub
		FindTopicsByLableResult result = new FindTopicsByLableResult();
		String qry = "from Topic where lable like ? order by hot desc limit 0,"
				+ num;
		List<Topic> topics = (List<Topic>) getHibernateTemplate().find(qry,
				"%" + lable + "%");
		if (topics.size() > 0) {
			result.setTopics(topics);
		}
		return result;
	}
}