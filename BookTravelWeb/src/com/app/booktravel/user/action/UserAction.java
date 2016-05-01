package com.app.booktravel.user.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.common.action.bean.Result;
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
		String username = request.getParameter("username");
		String phone = request.getParameter("userphone");
		String password = request.getParameter("userpassword");
		User user = new User();
		user.setUsername(username);
		user.setUserphone(phone);
		user.setUserpassword(password);
		result = new Result();
		if (userservice.findUserByPhone(phone) != null) {
			System.out.println("手机账号已存在！注册失败");
			result.setCode(100);
			return SUCCESS;
		} else if (userservice.addUser(user)) {
			System.out.println("注册成功");
			result.setCode(200);
			return SUCCESS;
		} else {
			System.out.println("注册失败");
			result.setCode(500);
			return SUCCESS;
		}
	}
}
