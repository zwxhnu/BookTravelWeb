package com.app.booktravel.user.serviceimpl;

import java.util.List;

import com.app.booktravel.user.action.bean.BookInfoResult;
import com.app.booktravel.user.dao.BookDAO;
import com.app.booktravel.user.model.Book;
import com.app.booktravel.user.service.BookService;

public class BookServiceImpl implements BookService {
	private BookDAO bookdao;

	public void setBookdao(BookDAO bookdao) {
		this.bookdao = bookdao;
	}

	@Override
	public BookInfoResult findMyCollectionBook(String userid) {
		// TODO Auto-generated method stub
		return bookdao.findMyCollectionBook(userid);
	}

}
