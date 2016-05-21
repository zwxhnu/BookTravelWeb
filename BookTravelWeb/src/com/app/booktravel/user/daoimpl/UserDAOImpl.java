package com.app.booktravel.user.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.app.booktravel.user.action.bean.QueryPersonalResult;
import com.app.booktravel.user.action.bean.UserLoginResult;
import com.app.booktravel.user.dao.UserDAO;
import com.app.booktravel.user.model.Driftprocess;
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
}
