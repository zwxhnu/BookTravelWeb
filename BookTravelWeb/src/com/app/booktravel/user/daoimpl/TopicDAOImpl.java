package com.app.booktravel.user.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.app.booktravel.user.action.bean.QueryMyTopicsResult;
import com.app.booktravel.user.action.bean.QueryTopicDetailsResult;
import com.app.booktravel.user.action.bean.QueryTopicsResult;
import com.app.booktravel.user.action.bean.UserLoginResult;
import com.app.booktravel.user.dao.TopicDAO;
import com.app.booktravel.user.model.Book;
import com.app.booktravel.user.model.Comment;
import com.app.booktravel.user.model.Praise;
import com.app.booktravel.user.model.Topic;
import com.app.booktravel.user.model.User;

public class TopicDAOImpl extends HibernateDaoSupport implements TopicDAO {

	@Override
	public QueryTopicsResult QueryTopics(final int start, final int offset) {
		// TODO Auto-generated method stub
		final String sql = "from Topic";
		QueryTopicsResult res = new QueryTopicsResult();
		List list = (List) getHibernateTemplate().execute(
				new HibernateCallback<Object>() {
					@Override
					public Object doInHibernate(Session session)
							throws HibernateException {
						// TODO Auto-generated method stub
						Query query = session.createQuery(sql);
						query.setFirstResult(start);
						query.setMaxResults(offset);
						List result = query.list();
						return result;
					}
				});
		if (list.size() > 0) {
			res.setTopics(list);
			return res;
		}
		return null;
	}

	@Override
	public QueryTopicsResult QueryTopicsByKeyWords(String keyword, final int start, final int offset) {
		// TODO Auto-generated method stub
		final String sql = "from Topic where subject like '%"+keyword+"%' or content like '%"+keyword+"%'";
		QueryTopicsResult res = new QueryTopicsResult();
		List list = (List) getHibernateTemplate().execute(
				new HibernateCallback<Object>() {
					@Override
					public Object doInHibernate(Session session)
							throws HibernateException {
						// TODO Auto-generated method stub
						Query query = session.createQuery(sql);
						query.setFirstResult(start);
						query.setMaxResults(offset);
						List result = query.list();
						return result;
					}
				});
		if (list.size() > 0) {
			res.setTopics(list);
			return res;
		}
		return null;
	}

	@Override
	public QueryTopicDetailsResult QueryTopicById(int topicid) {
		// TODO Auto-generated method stub
		QueryTopicDetailsResult result = new QueryTopicDetailsResult();
		String sql = "from Topic where topicid=?";
		List<Topic> topics = (List<Topic>) getHibernateTemplate()
				.find(sql, topicid);
		if (topics.size() == 0)
			return result;
		result.setTopic(topics.get(0));
		return result;
	}

	@Override
	public int CountPraiseNumByTopicId(int topicid) {
		// TODO Auto-generated method stub
		String sql = "select count(*) from Praise where topicid=?";
		List praisenum = (List) getHibernateTemplate()
				.find(sql, topicid);
			return Integer.parseInt(praisenum.get(0).toString());
	}

	@Override
	public int CountCommentNumByTopicId(int topicid) {
		// TODO Auto-generated method stub
		String sql = "select count(*) from Comment where topicid=?";
		List commentnum = (List) getHibernateTemplate()
				.find(sql, topicid);
			return Integer.parseInt(commentnum.get(0).toString());
	}

	@Override
	public boolean addTopic(Topic t) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(t);
		return true;
	}

	@Override
	public Topic FindTopicById(int topicid) {
		// TODO Auto-generated method stub
		String sql = "from Topic where topicid=?";
		List<Topic> list = (List<Topic>) getHibernateTemplate()
				.find(sql, topicid);
		if (list.size() == 0)
			return null;
		return list.get(0);
	}

	@Override
	public boolean deleteTopic(Topic topic) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(topic);
		return true;
	}

	@Override
	public boolean deleteComment(Comment comment) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(comment);
		return false;
	}

	@Override
	public boolean deletePraise(Praise praise) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(praise);
		return false;
	}
}
