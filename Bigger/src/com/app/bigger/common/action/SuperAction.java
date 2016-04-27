package com.app.bigger.common.action;

import com.app.bigger.common.action.bean.Result;
import com.opensymphony.xwork2.ActionSupport;

public class SuperAction extends ActionSupport {
	protected Result result;

	void SuperAction() {
		result = new Result();
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
