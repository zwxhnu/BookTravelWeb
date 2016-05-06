package com.app.booktravel.user.serviceimpl;

import com.app.booktravel.user.dao.MybookDAO;
import com.app.booktravel.user.service.MybookService;

public class MybookServiceImpl implements MybookService {
	private MybookDAO mybookdao;

	public MybookDAO getMybookdao() {
		return mybookdao;
	}

	public void setMybookdao(MybookDAO mybookdao) {
		this.mybookdao = mybookdao;
	}

}
