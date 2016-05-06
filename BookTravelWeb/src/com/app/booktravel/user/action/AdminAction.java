package com.app.booktravel.user.action;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.service.AdminService;

public class AdminAction extends SuperAction {
	private AdminService adminservice;

	public AdminService getAdminservice() {
		return adminservice;
	}

	public void setAdminservice(AdminService adminservice) {
		this.adminservice = adminservice;
	}

}
