package com.app.booktravel.user.action;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.service.BookService;

public class BookAction extends SuperAction {
	private BookService bookservice;

	public BookService getBookservice() {
		return bookservice;
	}

	public void setBookservice(BookService bookservice) {
		this.bookservice = bookservice;
	}

}
