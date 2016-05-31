package com.app.booktravel.user.action.bean;

import java.util.List;

import com.app.booktravel.common.action.bean.Result;
import com.app.booktravel.user.model.Book;

public class BookInfoResult extends Result {
	private List<Book> book;
	
	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public int getCode() {
		// TODO Auto-generated method stub
		return super.getCode();
	}

	@Override
	public void setCode(int code) {
		// TODO Auto-generated method stub
		super.setCode(code);
	}
}
