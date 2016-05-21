package com.app.booktravel.user.action;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.service.BookreviewService;

public class BookreviewAction extends SuperAction {
	private BookreviewService bookreviewservice;
	
	public void setBookreviewservice(BookreviewService bookreviewservice) {
		this.bookreviewservice = bookreviewservice;
	}

}
