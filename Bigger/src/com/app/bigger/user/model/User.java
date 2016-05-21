package com.app.bigger.user.model;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -6731920786198905045L;
	private Integer userid;
	private String userphone;
	private String username;
	private String userpassword;
	private String userlable;
	private String userlogo;
	private String usersign;
	private Integer userdynamic;
	private Integer userfans;
	private Integer userattention;
	private Integer userhot;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String userphone, String username, String userpassword,
			String userlable, String userlogo, String usersign,
			Integer userdynamic, Integer userfans, Integer userattention,
			Integer userhot) {
		this.userphone = userphone;
		this.username = username;
		this.userpassword = userpassword;
		this.userlable = userlable;
		this.userlogo = userlogo;
		this.usersign = usersign;
		this.userdynamic = userdynamic;
		this.userfans = userfans;
		this.userattention = userattention;
		this.userhot = userhot;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUserlable() {
		return this.userlable;
	}

	public void setUserlable(String userlable) {
		this.userlable = userlable;
	}

	public String getUserlogo() {
		return this.userlogo;
	}

	public void setUserlogo(String userlogo) {
		this.userlogo = userlogo;
	}

	public String getUsersign() {
		return this.usersign;
	}

	public void setUsersign(String usersign) {
		this.usersign = usersign;
	}

	public Integer getUserdynamic() {
		return this.userdynamic;
	}

	public void setUserdynamic(Integer userdynamic) {
		this.userdynamic = userdynamic;
	}

	public Integer getUserfans() {
		return this.userfans;
	}

	public void setUserfans(Integer userfans) {
		this.userfans = userfans;
	}

	public Integer getUserattention() {
		return this.userattention;
	}

	public void setUserattention(Integer userattention) {
		this.userattention = userattention;
	}

	public Integer getUserhot() {
		return this.userhot;
	}

	public void setUserhot(Integer userhot) {
		this.userhot = userhot;
	}

}