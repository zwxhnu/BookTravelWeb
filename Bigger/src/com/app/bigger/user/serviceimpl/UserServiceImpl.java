package com.app.bigger.user.serviceimpl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.app.bigger.user.action.bean.UserLoginResult;
import com.app.bigger.user.dao.UserDAO;
import com.app.bigger.user.model.User;
import com.app.bigger.user.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO userdao;

	public UserDAO getUserdao() {
		return userdao;
	}

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
	public boolean addLable(String userphone, String userlable) {
		// TODO Auto-generated method stub
		return userdao.addLable(userphone, userlable);
	}

	@Override
	public List<User> findUsersByKeyword(String keywords) {
		// TODO Auto-generated method stub
		return userdao.findUsersByKeyword(keywords);
	}
}
