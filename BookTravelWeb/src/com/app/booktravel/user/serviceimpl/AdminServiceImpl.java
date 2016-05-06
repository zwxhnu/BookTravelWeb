package com.app.booktravel.user.serviceimpl;

import com.app.booktravel.user.dao.AdminDAO;
import com.app.booktravel.user.service.AdminService;

public class AdminServiceImpl implements AdminService{
	private AdminDAO admindao;

	public AdminDAO getAdmindao() {
		return admindao;
	}

	public void setAdmindao(AdminDAO admindao) {
		this.admindao = admindao;
	}
	
}
