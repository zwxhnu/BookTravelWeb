package com.app.booktravel.user.serviceimpl;

import org.springframework.transaction.annotation.Transactional;

import com.app.booktravel.user.action.bean.QueryMyTopicsResult;
import com.app.booktravel.user.action.bean.QueryPersonalResult;
import com.app.booktravel.user.action.bean.UserLoginResult;
import com.app.booktravel.user.dao.TopicDAO;
import com.app.booktravel.user.dao.UserDAO;
import com.app.booktravel.user.model.Book;
import com.app.booktravel.user.model.Bookreview;
import com.app.booktravel.user.model.Mybook;
import com.app.booktravel.user.model.Topic;
import com.app.booktravel.user.model.User;
import com.app.booktravel.user.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO userdao;

	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}

	@Override
	@Transactional(rollbackFor = { Exception.class })
	public boolean addUser(User u) {
		// TODO Auto-generated method stub
		return userdao.addUser(u);
	}

	@Override
	public User findUserByPhone(String phone) {
		// TODO Auto-generated method stub
		return userdao.findUserByPhone(phone);
	}

	@Override
	public boolean deleteUserById() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserLoginResult findUserByPhoneAndPass(String phone, String password) {
		// TODO Auto-generated method stub
		return userdao.findUserByPhoneAndPass(phone, password);
	}

	@Override
	public QueryPersonalResult queryPersonalAndProcess(String phone) {
		// TODO Auto-generated method stub
		return userdao.queryPersonalAndProcess(phone);
	}

	@Override
	public QueryMyTopicsResult QueryMyTopics(int userid) {
		// TODO Auto-generated method stub
		return userdao.QueryMyTopics(userid);
	}

	@Override
	public Book QueryBookById(int bookid) {
		// TODO Auto-generated method stub
		return userdao.QueryBookById(bookid);
	}

	@Override
	public User QueryUserById(int userid) {
		// TODO Auto-generated method stub
		return userdao.QueryUserById(userid);
	}

	@Override
	public Mybook QueryMyBooks(int userid) {
		// TODO Auto-generated method stub
		return userdao.QueryMyBooks(userid);
	}

	@Override
	public Book QueryBookByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return userdao.QueryBookByIsbn(isbn);
	}
	
	@Override
	@Transactional(rollbackFor = { Exception.class })
	public boolean addTopic(Topic t) {
		// TODO Auto-generated method stub
		return userdao.addTopic(t);
	}

	@Override
	@Transactional(rollbackFor = { Exception.class })
	public boolean addBookreview(Bookreview r) {
		// TODO Auto-generated method stub
		return userdao.addBookreview(r);
	}

}
