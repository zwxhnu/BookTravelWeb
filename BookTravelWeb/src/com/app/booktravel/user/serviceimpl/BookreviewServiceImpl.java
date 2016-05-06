package com.app.booktravel.user.serviceimpl;

import com.app.booktravel.user.dao.BookreviewDAO;
import com.app.booktravel.user.service.BookreviewService;

public class BookreviewServiceImpl implements BookreviewService {
	private BookreviewDAO bookreviewdao;

	public BookreviewDAO getBookreviewdao() {
		return bookreviewdao;
	}

	public void setBookreviewdao(BookreviewDAO bookreviewdao) {
		this.bookreviewdao = bookreviewdao;
	}

}
