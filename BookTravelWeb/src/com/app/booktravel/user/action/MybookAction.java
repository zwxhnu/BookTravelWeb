package com.app.booktravel.user.action;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.service.MybookService;

public class MybookAction extends SuperAction {
	private MybookService mybookservice;

	public MybookService getMybookservice() {
		return mybookservice;
	}

	public void setMybookservice(MybookService mybookservice) {
		this.mybookservice = mybookservice;
	}

}
