package com.app.booktravel.user.service;

import com.app.booktravel.user.action.bean.UserLoginResult;
import com.app.booktravel.user.model.User;

public interface UserService {
	public boolean addUser(User u);

	public User findUserByPhone(String phone);

	public boolean deleteUserById();

	public UserLoginResult findUserByPhoneAndPass(String phone, String password);
}
