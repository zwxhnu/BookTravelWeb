package com.app.booktravel.user.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.model.Bookreview;
import com.app.booktravel.user.service.BookreviewService;

public class BookreviewAction extends SuperAction {
	private BookreviewService bookreviewservice;
	
	public void setBookreviewservice(BookreviewService bookreviewservice) {
		this.bookreviewservice = bookreviewservice;
	}
}
