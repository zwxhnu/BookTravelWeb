package com.app.booktravel.user.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.orm.hibernate5.HibernateCallback;

import com.app.booktravel.user.dao.MybookDAO;
import com.app.booktravel.user.model.Mybook;
import com.app.booktravel.user.model.User;
import com.app.booktravel.user.service.MybookService;

public class MybookDAOImpl extends HibernateDaoSupport implements MybookDAO {

	@Override
	public boolean deleteOneOfMyBook(Mybook mybook) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(mybook);
		return true;
	}

	@Override
	public Mybook findMyBookByUserId(int userid) {
		// TODO Auto-generated method stub
		List<Mybook> list = (List<Mybook>) getHibernateTemplate().find(
				"from Mybook where userid=?", userid);
		if (list.size() == 0)
			return null;
		return list.get(0);
	}

	@Override
	public User findUserById(int userid) {
		// TODO Auto-generated method stub
		List<User> list = (List<User>) getHibernateTemplate().find(
				"from User where userid=?", userid);
		if (list.size() == 0)
			return null;
		return list.get(0);
	}

	@Override
	public boolean addNewMybook(Mybook newmybook) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(newmybook);
		return true;
	}

	@Override
	public boolean addExistedMybook(Mybook mybook) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(mybook);
		return true;
	}
}
