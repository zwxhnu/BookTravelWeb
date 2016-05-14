package com.app.bigger.topic.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
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
	public queryHotTopicResult findHotTopics(final int sum) {
		// TODO Auto-generated method stub
		final queryHotTopicResult queryresult = new queryHotTopicResult();
		final String sql = "from Topic order by hot desc";
		List list = null;
		getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException {
				// TODO Auto-generated method stub
				Query query = session.createQuery(sql);
				query.setFirstResult(0);
				query.setMaxResults(sum);
				queryresult.setTopics(query.list());
				return query;
			}
		});
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
	public FindTopicsByLableResult FindTopicsByLable(final String lable,
			final String num) {
		// TODO Auto-generated method stub
		final FindTopicsByLableResult result = new FindTopicsByLableResult();
		final String qry = "from Topic where lable like ? order by hot desc";
		getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException {
				// TODO Auto-generated method stub
				Query query = session.createQuery(qry);
				query.setParameter(0, "%" + lable + "%");
				query.setFirstResult(0);
				query.setMaxResults(Integer.valueOf(num));
				result.setTopics(query.list());
				return query;
			}
		});
		return result;
	}
}