package com.app.booktravel.common.action;

import com.app.booktravel.common.action.bean.Result;
import com.opensymphony.xwork2.ActionSupport;

public class SuperAction extends ActionSupport {
	protected Result result;

	public SuperAction() {
		result = new Result();
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
