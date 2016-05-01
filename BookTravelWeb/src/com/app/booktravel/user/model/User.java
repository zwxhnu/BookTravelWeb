package com.app.booktravel.user.model;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String userphone;
	private String userpassword;
	private String username;
	private String userlog;
	private String userfun;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String userphone, String userpassword, String username,
			String userlog, String userfun) {
		this.userphone = userphone;
		this.userpassword = userpassword;
		this.username = username;
		this.userlog = userlog;
		this.userfun = userfun;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUserphone() {
		return this.userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserlog() {
		return this.userlog;
	}

	public void setUserlog(String userlog) {
		this.userlog = userlog;
	}

	public String getUserfun() {
		return this.userfun;
	}

	public void setUserfun(String userfun) {
		this.userfun = userfun;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", userphone=" + userphone
				+ ", userpassword=" + userpassword + ", username=" + username
				+ ", userlog=" + userlog + ", userfun=" + userfun + "]";
	}

}