package com.app.bigger.user.dao;

import java.util.List;

import com.app.bigger.user.action.bean.UserLoginResult;
import com.app.bigger.user.model.User;

public interface UserDAO {
	public boolean addUser(User u);

	public User findUserByPhone(String phone);

	public boolean deleteUserById();

	public UserLoginResult findUserByPhoneAndPass(String phone, String password);

	public boolean addLable(String userphone, String userlable);

	public List<User> findUsersByKeyword(String keywords);
}
