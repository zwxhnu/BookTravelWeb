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
					"mybooktype");//��ʾ��ѡ���ղء�����Ư����Ư���������Ǵ������鼮
			result = new BookInfoResult();
			if(type.equals("collection")) {
				BookInfoResult res = bookservice.findMyCollectionBook(userid);
				result = res;
			}	
			result.setCode(200);
			System.out.println("�ɹ���ʾ�ҵ��鼮");
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}

}
