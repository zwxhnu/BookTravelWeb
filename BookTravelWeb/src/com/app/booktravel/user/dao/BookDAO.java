package com.app.booktravel.user.dao;

import java.util.List;

import com.app.booktravel.user.action.bean.BookInfoResult;
import com.app.booktravel.user.model.Book;

public interface BookDAO {
	public BookInfoResult findMyCollectionBook(String userid);
}
