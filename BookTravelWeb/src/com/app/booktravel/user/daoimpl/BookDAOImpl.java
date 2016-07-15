package com.app.booktravel.user.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.orm.hibernate5.HibernateCallback;

import com.app.booktravel.user.action.bean.BookInfoResult;
import com.app.booktravel.user.dao.BookDAO;
import com.app.booktravel.user.model.Book;
import com.app.booktravel.user.model.User;
import com.app.booktravel.user.service.BookService;

public class BookDAOImpl extends HibernateDaoSupport implements BookDAO{

	@Override
	public BookInfoResult findMyCollectionBook(String userid) {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(userid);
		BookInfoResult result = new BookInfoResult();
		List<Book> colbooklist = (List<Book>) getHibernateTemplate().find(
				"select * from book where bookid in (select book.bookid from mybook,book where mybook.userid=? and mybook.collection=book.bookid)", id);
		if (colbooklist.size() == 0)
			return null;
		result.setBook(colbooklist);
		return result;
	}
	
}