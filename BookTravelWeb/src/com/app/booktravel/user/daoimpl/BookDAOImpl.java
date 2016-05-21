package com.app.booktravel.user.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.app.booktravel.user.dao.BookDAO;
import com.app.booktravel.user.model.Book;
import com.app.booktravel.user.model.User;
import com.app.booktravel.user.service.BookService;

public class BookDAOImpl extends HibernateDaoSupport implements BookDAO{

	@Override
	public Book findMyCollectionBook(String userid) {
		// TODO Auto-generated method stub
		List<Book> list = (List<Book>) getHibernateTemplate().find(
				"select * from book where bookid in (select book.bookid from mybook,book where mybook.userid=? and mybook.collection=book.bookid)", userid);
		if (list.size() == 0)
			return null;
		return list.get(0);
	}
}