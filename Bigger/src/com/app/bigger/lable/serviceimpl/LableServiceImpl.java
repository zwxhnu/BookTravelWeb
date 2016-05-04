package com.app.bigger.lable.serviceimpl;

import com.app.bigger.lable.action.bean.QueryAllLables;
import com.app.bigger.lable.dao.LableDAO;
import com.app.bigger.lable.service.LableService;

public class LableServiceImpl implements LableService {
	private LableDAO labledao;

	public void setLabledao(LableDAO labledao) {
		this.labledao = labledao;
	}

	@Override
	public QueryAllLables getAllLables() {
		// TODO Auto-generated method stub
		return labledao.getAllLables();
	}

}
