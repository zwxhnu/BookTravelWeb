package com.app.booktravel.user.service;

import java.util.List;

import com.app.booktravel.user.action.bean.BookInfoResult;
import com.app.booktravel.user.model.Book;

public interface BookService {
	public BookInfoResult findMyCollectionBook(String userid);
}
