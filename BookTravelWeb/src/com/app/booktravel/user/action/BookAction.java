package com.app.booktravel.user.action;

import org.apache.struts2.ServletActionContext;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.action.bean.BookInfoResult;
import com.app.booktravel.user.action.bean.QueryPersonalResult;
import com.app.booktravel.user.service.BookService;

public class BookAction extends SuperAction {
	private BookService bookservice;

	public void setBookservice(BookService bookservice) {
		this.bookservice = bookservice;
	}
	
	public String QueryMybook() {
		try {
			String userid = ServletActionContext.getRequest().getParameter(
					"userid");
			String type = ServletActionContext.getRequest().getParameter(
					"mybooktype");//表示是选择收藏、正在漂流、漂流结束还是待评的书籍
			result = new BookInfoResult();
			if(type.equals("collection")) {
				BookInfoResult res = bookservice.findMyCollectionBook(userid);
				result = res;
			}	
			result.setCode(200);
			System.out.println("成功显示我的书籍");
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}

}
