package com.app.bigger.user.service;

import com.app.bigger.user.action.bean.UserLoginResult;
import com.app.bigger.user.model.User;

public interface UserService {
	public boolean addUser(User u);

	public User findUserByPhone(String phone);

	public boolean deleteUserById();

	public UserLoginResult findUserByPhoneAndPass(String phone, String password);
}
