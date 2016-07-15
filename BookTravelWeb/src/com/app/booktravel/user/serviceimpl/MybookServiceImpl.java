package com.app.booktravel.user.serviceimpl;

import org.springframework.transaction.annotation.Transactional;

import com.app.booktravel.user.dao.MybookDAO;
import com.app.booktravel.user.model.Mybook;
import com.app.booktravel.user.model.User;
import com.app.booktravel.user.service.MybookService;

public class MybookServiceImpl implements MybookService {
	private MybookDAO mybookdao;

	public void setMybookdao(MybookDAO mybookdao) {
		this.mybookdao = mybookdao;
	}

	@Override
	@Transactional(rollbackFor = { Exception.class })
	public boolean deleteOneCollectionBook(Mybook mybook) {
		// TODO Auto-generated method stub
		return mybookdao.deleteOneCollectionBook(mybook);
	}

	@Override
	public Mybook findMyBookByUserId(int userid) {
		// TODO Auto-generated method stub
		return mybookdao.findMyBookByUserId(userid);
	}

	@Override
	public User findUserById(int userid) {
		// TODO Auto-generated method stub
		return mybookdao.findUserById(userid);
	}

	@Override
	@Transactional(rollbackFor = { Exception.class })
	public boolean addNewMybook(Mybook newmybook) {
		// TODO Auto-generated method stub
		return mybookdao.addNewMybook(newmybook);
	}

	@Override
	@Transactional(rollbackFor = { Exception.class })
	public boolean addExistedMybook(Mybook mybook) {
		// TODO Auto-generated method stub
		return mybookdao.addExistedMybook(mybook);
	}

}
