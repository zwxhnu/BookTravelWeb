package com.app.booktravel.user.action.bean;

import com.app.booktravel.common.action.bean.Result;
import com.app.booktravel.user.model.User;

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

	@Override
	public String toString() {
		return "UserLoginResult [user=" + user + "]";
	}
}
