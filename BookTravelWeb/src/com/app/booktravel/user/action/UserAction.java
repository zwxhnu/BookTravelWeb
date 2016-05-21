package com.app.booktravel.user.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.common.action.bean.Result;
import com.app.booktravel.user.action.bean.QueryPersonalResult;
import com.app.booktravel.user.action.bean.UserLoginResult;
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
			if (userservice.findUserByPhone(phone) == null) {
				result.setCode(100);// �ֻ��˺Ų�����
				System.out.println("�ֻ��˺Ų�����");
				return SUCCESS;
			} else if (res.getUser() == null) {
				result.setCode(500);// �������
				System.out.println("�������");
				return SUCCESS;
			} else if (res.getUser() != null) {
				result = res;
				result.setCode(200);// ��¼�ɹ�
				System.out.println("��¼�ɹ�");
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
		String username = request.getParameter("username");
		String phone = request.getParameter("userphone");
		String password = request.getParameter("userpassword");
		User user = new User();
		user.setUsername(username);
		user.setTel(phone);
		user.setPassword(password);
		result = new Result();
		if (userservice.findUserByPhone(phone) != null) {
			System.out.println("�ֻ��˺��Ѵ��ڣ�ע��ʧ��");
			result.setCode(100);
			return SUCCESS;
		} else if (userservice.addUser(user)) {
			System.out.println("ע��ɹ�");
			result.setCode(200);
			return SUCCESS;
		} else {
			System.out.println("ע��ʧ��");
			result.setCode(500);
			return SUCCESS;
		}
	}
	
	public String QueryPersonalCenter() {
		try {
			String userphone = ServletActionContext.getRequest().getParameter("userphone");
			result=new QueryPersonalResult();
			QueryPersonalResult res = userservice.queryPersonalAndProcess(userphone);
			result = res;
			result.setCode(200);//�ɹ�������˿ռ�
			System.out.println("�ɹ�������˿ռ�");
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
		
	}
}
