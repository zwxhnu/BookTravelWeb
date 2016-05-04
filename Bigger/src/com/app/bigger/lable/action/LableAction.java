package com.app.bigger.lable.action;

import com.app.bigger.common.action.SuperAction;
import com.app.bigger.lable.action.bean.QueryAllLables;
import com.app.bigger.lable.service.LableService;

public class LableAction extends SuperAction {
	private LableService lableservice;

	public void setLableservice(LableService lableservice) {
		this.lableservice = lableservice;
	}

	public String Queryall() {
		result = new QueryAllLables();
		QueryAllLables query = lableservice.getAllLables();
		if (query == null) {
			result.setCode(500);
			return SUCCESS;
		} else {
			result = query;
			result.setCode(200);
			return SUCCESS;
		}
	}
}
