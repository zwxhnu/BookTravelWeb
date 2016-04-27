package com.app.bigger.user.action.bean;

import com.app.bigger.common.action.bean.Result;
import com.app.bigger.user.model.User;

public class UserLoginResult extends Result {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int getCode() {
		// TODO Auto-generated method stub
		return super.getCode();
	}

	@Override
	public void setCode(int code) {
		// TODO Auto-generated method stub
		super.setCode(code);
	}

}
