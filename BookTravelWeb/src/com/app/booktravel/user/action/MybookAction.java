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

	public String DeleteOneOfMyBook() {
		String userid = ServletActionContext.getRequest().getParameter(
				"userid");
		String mybooktype = ServletActionContext.getRequest().getParameter(
				"mybooktype");
		String isbn = ServletActionContext.getRequest().getParameter(
				"isbn");
		System.out.println("userid:"+userid);
		System.out.println("isbn:"+isbn);
		Mybook mybook = mybookservice.findMyBookByUserId(Integer.valueOf(userid));
		
		if(mybook == null) System.out.println("没有找到mybook");
		else System.out.println("返回mybook:"+mybook.getMybookid());
		
		if(mybooktype.equals("collection")) {
			String collection=mybook.getCollection();
			if(collection==null||collection=="") {
				result.setCode(500);//没有收藏图书，无法删除
				return SUCCESS;
			}
			String newcollection=collection;
			if(delete(newcollection,collection,isbn)!=null)
			newcollection=delete(newcollection,collection,isbn);
			else {
				result.setCode(500);//没有该图书，无法删除
				return SUCCESS;
			}
			mybook.setCollection(newcollection);
		}
		else if(mybooktype.equals("reading")) {
			String reading=mybook.getReading();
			if(reading==null||reading=="") {
				result.setCode(500);//没有该图书，无法删除
				return SUCCESS;
			}
			String newreading=reading;
			if(delete(newreading,reading,isbn)!=null)
			newreading=delete(newreading,reading,isbn);
			else {
				result.setCode(500);//没有该图书，无法删除
				return SUCCESS;
			}
			mybook.setReading(newreading);
		}
		else if(mybooktype.equals("readed")) {
			String readed=mybook.getReaded();
			if(readed==null||readed=="") {
				result.setCode(500);//没有该图书，无法删除
				return SUCCESS;
			}
			String newreaded=readed;
			if(delete(newreaded,readed,isbn)!=null)
			newreaded=delete(newreaded,readed,isbn);
			else {
				result.setCode(500);//没有该图书，无法删除
				return SUCCESS;
			}
			mybook.setReaded(newreaded);
		}
		else if(mybooktype.equals("toevaluate")) {
			String toevaluate=mybook.getToevaluate();
			if(toevaluate==null||toevaluate=="") {
				result.setCode(500);//没有该图书，无法删除
				return SUCCESS;
			}
			String newtoevaluate=toevaluate;
			if(delete(newtoevaluate,toevaluate,isbn)!=null)
			newtoevaluate=delete(newtoevaluate,toevaluate,isbn);
			else {
				result.setCode(500);//没有该图书，无法删除
				return SUCCESS;
			}
			mybook.setToevaluate(newtoevaluate);
		}

		boolean res = mybookservice.deleteOneOfMyBook(mybook);
		if(res){
			result.setCode(200);//删除成功
		}else{
			result.setCode(100);//删除失败
		}
		
		return SUCCESS;
	}
	
	private String delete(String newstr, String str,String isbn) {
		int index = str.indexOf(isbn);
		if(str.indexOf("、")!=-1) {//收藏不只一本图书
		if(index==-1){
			System.out.println("没有该图书");
			return null;
		}
		else if(index==0){
			newstr=str.substring(isbn.length()+1);
			System.out.println(newstr);
		}
		else {
		String s1=str.substring(0, index-1);
		String s2=str.substring(index+isbn.length(), str.length());
		newstr=s1+s2;
		System.out.println(newstr);
		}
		}
		else //收藏只有一本图书
		{
			if(index==-1){
				System.out.println("没有该图书");
				return null;
			}
			else if(index==0){
			newstr="";
			System.out.println(newstr);
			}
		}
		return newstr;
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
