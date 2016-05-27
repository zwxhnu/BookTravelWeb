package com.app.bigger.user.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.app.bigger.common.action.SuperAction;
import com.app.bigger.common.action.bean.Result;
import com.app.bigger.user.action.bean.UserLoginResult;
import com.app.bigger.user.model.User;
import com.app.bigger.user.service.UserService;

public class UserLoginAction extends SuperAction {
	private UserService userservice;

	public UserLoginAction() {
		result = new UserLoginResult();
	}

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public String Login() throws Exception {
		// TODO Auto-generated method stub
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

	public String Register() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = new String(request.getParameter("username").getBytes(
				"ISO8859-1"), "UTF-8");
		String phone = request.getParameter("userphone");
		String password = request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setUserphone(phone);
		user.setUserpassword(password);
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

	public String addLable() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String phone = null;
		String lable = null;
		try {
			phone = request.getParameter("userphone");

			lable = new String(request.getParameter("userlable").getBytes(
					"ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(lable);
		result = new Result();
		if (userservice.findUserByPhone(phone) == null) {
			result.setCode(100);
			System.out.println("��ӱ�ǩʧ��" + phone + "---" + lable);
			return SUCCESS;
		} else if (userservice.addLable(phone, lable)) {
			result.setCode(200);
			System.out.println("��ӱ�ǩ�ɹ�");
			return SUCCESS;
		} else {
			result.setCode(500);
			System.out.println("��ӱ�ǩʧ��");
			return SUCCESS;
		}
	}

	public String findByPhone() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String phone = request.getParameter("userphone");
		User u = userservice.findUserByPhone(phone);
		if (u == null) {
			result.setCode(100);
			System.out.println("��ѯʧ��");
			return SUCCESS;
		} else {
			result = new UserLoginResult(u);
			result.setCode(200);
			return SUCCESS;
		}
	}
}
