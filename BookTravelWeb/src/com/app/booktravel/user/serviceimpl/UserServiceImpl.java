package com.app.booktravel.user.serviceimpl;

import org.springframework.transaction.annotation.Transactional;

import com.app.booktravel.user.action.bean.UserLoginResult;
import com.app.booktravel.user.dao.UserDAO;
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

}
