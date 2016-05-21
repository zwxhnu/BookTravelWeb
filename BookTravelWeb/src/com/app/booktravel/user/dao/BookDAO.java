package com.app.booktravel.user.dao;

import com.app.booktravel.user.model.Book;

public interface BookDAO {
	public Book findMyCollectionBook(String userid);
}
