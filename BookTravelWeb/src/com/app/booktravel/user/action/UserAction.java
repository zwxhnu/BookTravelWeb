package com.app.booktravel.user.action;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.common.action.bean.Result;
import com.app.booktravel.user.action.bean.QueryMyBooksResult;
import com.app.booktravel.user.action.bean.QueryMyTopicsResult;
import com.app.booktravel.user.action.bean.QueryPersonalResult;
import com.app.booktravel.user.action.bean.UserLoginResult;
import com.app.booktravel.user.model.Book;
import com.app.booktravel.user.model.Mybook;
import com.app.booktravel.user.model.Topic;
import com.app.booktravel.user.model.User;
import com.app.booktravel.user.service.UserService;

public class UserAction extends SuperAction {
	private UserService userservice;

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public String Login() {
		try {
			String phone = ServletActionContext.getRequest().getParameter(
					"userphone");
			String password = ServletActionContext.getRequest().getParameter(
					"password");
			UserLoginResult res = userservice.findUserByPhoneAndPass(phone,
					password);
			System.out.println(phone + "---" + password);
			if (userservice.findUserByPhone(phone) == null) {
				result.setCode(100);// 手机账号不存在
				System.out.println("手机账号不存在");
				return SUCCESS;
			} else if (res.getUser() == null) {
				result.setCode(500);// 密码错误
				System.out.println("密码错误");
				return SUCCESS;
			} else if (res.getUser() != null) {
				result = res;
				result.setCode(200);// 登录成功
				System.out.println("登录成功");
				return SUCCESS;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String Register() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = null;
		try {
			username = new String(request.getParameter("username").getBytes(
					"ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String phone = request.getParameter("userphone");
		String password = request.getParameter("userpassword");
		User user = new User();
		user.setUsername(username);
		user.setTel(phone);
		user.setPassword(password);
		result = new Result();
		if (userservice.findUserByPhone(phone) != null) {
			System.out.println("手机账号已存在！注册失败");
			result.setCode(100);
			return SUCCESS;
		} else if (userservice.addUser(user)) {
			System.out.println(username + "注册成功");
			result.setCode(200);
			return SUCCESS;
		} else {
			System.out.println("注册失败");
			result.setCode(500);
			return SUCCESS;
		}
	}

	public String queryPersonalCenter() {
		try {
			String userphone = ServletActionContext.getRequest().getParameter(
					"userphone");
			result = new QueryPersonalResult();
			QueryPersonalResult res = userservice
					.queryPersonalAndProcess(userphone);
			result = res;
			result.setCode(200);// 成功进入个人空间
			System.out.println("成功进入个人空间");
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String queryMyTopics() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String phone = request.getParameter("userphone");
		User user = userservice.findUserByPhone(phone);
		System.out.println(user);
		if (user == null) {
			System.out.println("查询失败");
			result.setCode(100);
			return SUCCESS;
		}
		result = new QueryMyTopicsResult();
		QueryMyTopicsResult res = userservice.QueryMyTopics(user.getUserid());
		if (res != null) {
			System.out.println("查询成功");
			List<Book> books = new ArrayList<Book>();
			List<User> users = new ArrayList<User>();
			List<Topic> topics = res.getTopics();
			for (Topic topic : topics) {
				books.add(userservice.QueryBookById(topic.getBook()));
				users.add(userservice.QueryUserById(topic.getUser()));
			}
			res.setBooks(books);
			res.setUsers(users);

			result = res;
			result.setCode(200);
			return SUCCESS;
		} else {
			System.out.println("查询失败");
			result.setCode(100);
			return SUCCESS;

		}
	}

	public String queryMyBooks() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String phone = request.getParameter("userphone");
		User user = userservice.findUserByPhone(phone);
		Mybook mybook = userservice.QueryMyBooks(user.getUserid());
		QueryMyBooksResult res = new QueryMyBooksResult();
		result = new QueryMyBooksResult();
		if (mybook != null) {
			System.out.println("查询成功");
			String collection = mybook.getCollection();
			String reading = mybook.getReading();
			String readed = mybook.getReaded();
			String toevaluate = mybook.getToevaluate();
			if (collection != null) {
				String[] collections = collection.split("、");
				List<Book> books = new ArrayList<Book>();
				for (String string : collections) {
					Book book = userservice.QueryBookByIsbn(string);
					books.add(book);
				}
				res.setCollections(books);
			}
			if (reading != null) {
				String[] readings = reading.split("、");
				List<Book> books = new ArrayList<Book>();
				for (String string : readings) {
					Book book = userservice.QueryBookByIsbn(string);
					books.add(book);
				}
				res.setReadings(books);
			}
			if (readed != null) {
				String[] readeds = readed.split("、");
				List<Book> books = new ArrayList<Book>();
				for (String string : readeds) {
					Book book = userservice.QueryBookByIsbn(string);
					books.add(book);
				}
				res.setReadeds(books);
			}
			if (toevaluate != null) {
				String[] toevaluates = toevaluate.split("、");
				List<Book> books = new ArrayList<Book>();
				for (String string : toevaluates) {
					Book book = userservice.QueryBookByIsbn(string);
					books.add(book);
				}
				res.setToevaluates(books);
			}
			result = res;
			result.setCode(200);
			return SUCCESS;
		} else {
			System.out.println("查询失败");
			result.setCode(100);
			return SUCCESS;

		}
	}
	
	public String PublishTopic() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String subject = null;
		String content = null;
		try {
			subject = new String(request.getParameter("subject").getBytes(
					"ISO8859-1"), "UTF-8");
			content = new String(request.getParameter("content").getBytes(
					"ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String phone = request.getParameter("userphone");
		String bookid = request.getParameter("bookid");
		Topic topic = new Topic();
		topic.setUser(userservice.findUserByPhone(phone));
		topic.setBook(userservice.QueryBookById(Integer.valueOf(bookid)));
		topic.setSubject(subject);
		topic.setContent(content);
		Date date = new Date();       
		Timestamp currenttime = new Timestamp(date.getTime());
		topic.setTime(currenttime);
		result = new Result();
		if (userservice.addTopic(topic)) {
			System.out.println("发表话题成功");
			result.setCode(200);
			return SUCCESS;
		} else {
			System.out.println("发表话题失败");
			result.setCode(500);
			return SUCCESS;
		}
	}
}
