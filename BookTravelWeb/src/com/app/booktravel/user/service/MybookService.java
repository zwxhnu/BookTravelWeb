package com.app.booktravel.user.service;

import com.app.booktravel.user.model.Mybook;
import com.app.booktravel.user.model.User;

public interface MybookService {
	public boolean deleteOneOfMyBook(Mybook mybook);
	
	public Mybook findMyBookByUserId(int userid);
	
	public User findUserById(int userid);
	
	public boolean addNewMybook(Mybook newmybook);
	
	public boolean addExistedMybook(Mybook mybook);
}
