package com.app.booktravel.user.action;

import org.apache.struts2.ServletActionContext;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.model.Mybook;
import com.app.booktravel.user.model.User;
import com.app.booktravel.user.service.BookService;
import com.app.booktravel.user.service.MybookService;

public class MybookAction extends SuperAction {
	private MybookService mybookservice;

	public void setMybookservice(MybookService mybookservice) {
		this.mybookservice = mybookservice;
	}

	public String DeleteOneCollectionBook() {
		String userid = ServletActionContext.getRequest().getParameter(
				"userid");
		String isbn = ServletActionContext.getRequest().getParameter(
				"isbn");
		System.out.println("userid:"+userid);
		System.out.println("isbn:"+isbn);
		Mybook mybook = mybookservice.findMyBookByUserId(Integer.valueOf(userid));
		
		if(mybook == null) System.out.println("没有找到mybook");
		else System.out.println("返回mybook:"+mybook.getMybookid());
		
		String collection=mybook.getCollection();
		String newcollection=collection;
		int index = collection.indexOf(isbn);
		if(collection.indexOf("、")!=-1) {//收藏不只一本图书
		if(index==-1){
			System.out.println("未收藏该图书");
		}
		else if(index==0){
			newcollection=collection.substring(isbn.length()+1);
			System.out.println(newcollection);
		}
		else {
		String s1=collection.substring(0, index-1);
		String s2=collection.substring(index+isbn.length(), collection.length());
		newcollection=s1+s2;
		System.out.println(newcollection);
		}
		}
		else //收藏只有一本图书
		{
			if(index==-1){
				System.out.println("未收藏该图书");
			}
			else if(index==0){
			newcollection="";
			System.out.println(newcollection);
			}
		}
		
		mybook.setCollection(newcollection);

		boolean res = mybookservice.deleteOneCollectionBook(mybook);
		if(res){
			result.setCode(200);//删除成功
		}else{
			result.setCode(100);//删除失败
		}
		
		return SUCCESS;
	}
	
	public String AddMyBook() {
		String userid = ServletActionContext.getRequest().getParameter(
				"userid");
		String mybooktype = ServletActionContext.getRequest().getParameter(
				"mybooktype");
		String isbn = ServletActionContext.getRequest().getParameter(
				"isbn");
		Mybook mybook = mybookservice.findMyBookByUserId(Integer.valueOf(userid));
		if(mybook!=null) {//如果数据库中已有记录
			if(mybooktype.equals("collection")) {
				String collection=mybook.getCollection();
				String newcollection=isbn;
				if(collection!=null) newcollection=collection+"、"+isbn;
				mybook.setCollection(newcollection);
			}
			else if(mybooktype.equals("reading")) {
				String reading=mybook.getReading();
				String newreading=isbn;
				if(reading!=null) newreading=reading+"、"+isbn;
				System.out.println("newreading:"+newreading);
				mybook.setReading(newreading);
			}
			else if(mybooktype.equals("readed")) {
				String readed=mybook.getReaded();
				String newreaded=isbn;
				if(readed!=null) newreaded=readed+"、"+isbn;
				mybook.setReaded(newreaded);
			}
			else if(mybooktype.equals("toevaluate")) {
				String toevaluate=mybook.getToevaluate();
				String newtoevaluate=isbn;
				if(toevaluate!=null) newtoevaluate=toevaluate+"、"+isbn;
				mybook.setToevaluate(newtoevaluate);
			}
			boolean res = mybookservice.addExistedMybook(mybook);
			if(res){
				result.setCode(200);//添加成功
			}else{
				result.setCode(100);//添加失败
			}
			
			return SUCCESS;
		}
		else {//如果该用户未有记录
			Mybook newmybook = new Mybook();
			User user = mybookservice.findUserById(Integer.valueOf(userid));
			newmybook.setUser(user);
			if(mybooktype.equals("collection")) {
				newmybook.setCollection(isbn);
			}
			else if(mybooktype.equals("reading")) {
				newmybook.setReading(isbn);
			}
			else if(mybooktype.equals("readed")) {
				newmybook.setReaded(isbn);
			}
			else if(mybooktype.equals("toevaluate")) {
				newmybook.setToevaluate(isbn);
			}
			if(mybookservice.addNewMybook(newmybook)) {
				result.setCode(200);
				return SUCCESS;
			}
			else {
				result.setCode(100);
				return SUCCESS;
			}
		}
	}
	
}
