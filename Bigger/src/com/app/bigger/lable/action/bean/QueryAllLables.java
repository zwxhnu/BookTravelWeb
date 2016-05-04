package com.app.bigger.lable.action.bean;

import java.util.List;

import com.app.bigger.common.action.bean.Result;
import com.app.bigger.lable.model.Lable;

public class QueryAllLables extends Result {
	private List<Lable> lables;

	public List<Lable> getLables() {
		return lables;
	}

	public void setLables(List<Lable> lables) {
		this.lables = lables;
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
