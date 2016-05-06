package com.app.booktravel.user.serviceimpl;

import com.app.booktravel.user.dao.BookDAO;
import com.app.booktravel.user.service.BookService;

public class BookServiceImpl implements BookService {
	private BookDAO bookdao;

	public BookDAO getBookdao() {
		return bookdao;
	}

	public void setBookdao(BookDAO bookdao) {
		this.bookdao = bookdao;
	}

}
