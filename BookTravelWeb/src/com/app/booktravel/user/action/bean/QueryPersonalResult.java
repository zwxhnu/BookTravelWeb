package com.app.booktravel.user.action.bean;

import java.util.List;

import com.app.booktravel.common.action.bean.Result;
import com.app.booktravel.user.model.Driftprocess;
import com.app.booktravel.user.model.User;

public class QueryPersonalResult extends Result{
	private User user;
	private List<Driftprocess> driftprocesses;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Driftprocess> getDriftprocesses() {
		return driftprocesses;
	}
	public void setDriftprocesses(List<Driftprocess> driftprocesses) {
		this.driftprocesses = driftprocesses;
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
