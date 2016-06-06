package com.app.booktravel.user.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.app.booktravel.user.action.bean.QueryMyTopicsResult;
import com.app.booktravel.user.action.bean.QueryPersonalResult;
import com.app.booktravel.user.action.bean.UserLoginResult;
import com.app.booktravel.user.dao.UserDAO;
import com.app.booktravel.user.model.Book;
import com.app.booktravel.user.model.Driftprocess;
import com.app.booktravel.user.model.Mybook;
import com.app.booktravel.user.model.Topic;
import com.app.booktravel.user.model.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public boolean addUser(User u) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(u);
		return true;
	}

	@Override
	public User findUserByPhone(String phone) {
		// TODO Auto-generated method stub
		List<User> list = (List<User>) getHibernateTemplate().find(
				"from User where tel=?", phone);
		if (list.size() == 0)
			return null;
		return list.get(0);
	}

	@Override
	public boolean deleteUserById() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserLoginResult findUserByPhoneAndPass(String phone, String password) {
		// TODO Auto-generated method stub
		UserLoginResult result = new UserLoginResult();
		List<User> list = (List<User>) getHibernateTemplate().find(
				"from User where tel=? and password=?", phone, password);
		if (list.size() == 0)
			return result;
		result.setUser(list.get(0));
		return result;
	}

	@Override
	public QueryPersonalResult queryPersonalAndProcess(final String phone) {
		// TODO Auto-generated method stub
		final QueryPersonalResult result = new QueryPersonalResult();
		List<User> userlist = (List<User>) getHibernateTemplate().find(
				"from User where tel=?", phone);
		result.setUser(userlist.get(0));
		return result;
	}

	@Override
	public QueryMyTopicsResult QueryMyTopics(int userid) {
		// TODO Auto-generated method stub
		String sql = "from Topic where userid=?";
		QueryMyTopicsResult result = new QueryMyTopicsResult();
		List<Topic> topics = (List<Topic>) getHibernateTemplate().find(sql,
				userid);
		if (topics.size() > 0) {
			result.setTopics(topics);
			return result;
		}
		return null;
	}

	@Override
	public Book QueryBookById(int bookid) {
		// TODO Auto-generated method stub
		String sql = "from Book where bookid=?";
		List<Book> books = (List<Book>) getHibernateTemplate()
				.find(sql, bookid);
		if (books.size() > 0)
			return books.get(0);
		return new Book();
	}

	@Override
	public User QueryUserById(int userid) {
		// TODO Auto-generated method stub
		String sql = "from User where userid=?";
		List<User> users = (List<User>) getHibernateTemplate()
				.find(sql, userid);
		if (users.size() > 0)
			return users.get(0);
		return new User();
	}

	@Override
	public Mybook QueryMyBooks(int userid) {
		// TODO Auto-generated method stub
		String sql = "from Mybook where userid=?";
		List<Mybook> mybooks = (List<Mybook>) getHibernateTemplate().find(sql,
				userid);
		if (mybooks.size() > 0)
			return mybooks.get(0);
		return new Mybook();
	}

	@Override
	public Book QueryBookByIsbn(String isbn) {
		// TODO Auto-generated method stub
		String sql = "from Book where isbn=?";
		List<Book> books = (List<Book>) getHibernateTemplate().find(sql, isbn);
		if (books.size() > 0)
			return books.get(0);
		return new Book();
	}
	
	@Override
	public boolean addTopic(Topic t) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(t);
		return true;
	}
}
