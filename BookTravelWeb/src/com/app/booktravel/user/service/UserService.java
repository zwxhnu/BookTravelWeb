package com.app.booktravel.user.service;

import com.app.booktravel.user.action.bean.QueryMyTopicsResult;
import com.app.booktravel.user.action.bean.QueryPersonalResult;
import com.app.booktravel.user.action.bean.UserLoginResult;
import com.app.booktravel.user.model.Book;
import com.app.booktravel.user.model.Bookreview;
import com.app.booktravel.user.model.Mybook;
import com.app.booktravel.user.model.Topic;
import com.app.booktravel.user.model.User;

public interface UserService {
	public boolean addUser(User u);

	public User findUserByPhone(String phone);

	public boolean deleteUserById();

	public UserLoginResult findUserByPhoneAndPass(String phone, String password);

	public QueryPersonalResult queryPersonalAndProcess(String phone);

	public QueryMyTopicsResult QueryMyTopics(int userid);

	public Book QueryBookById(int bookid);

	public User QueryUserById(int userid);

	public Mybook QueryMyBooks(int userid);

	public Book QueryBookByIsbn(String isbn);
	
	public boolean addTopic(Topic t);
	
	public boolean addBookreview(Bookreview r);
}
