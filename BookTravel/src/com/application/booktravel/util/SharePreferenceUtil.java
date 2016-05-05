package com.application.booktravel.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SharePreferenceUtil {
	private SharedPreferences sp;
	private SharedPreferences.Editor editor;

	public SharePreferenceUtil(Context context, String file) {
		sp = context.getSharedPreferences(file, context.MODE_PRIVATE);
		editor = sp.edit();
	}

	public void setFun(String userfun) {
		editor.putString("userfun", userfun);
		editor.commit();
	}

	public String getFun() {
		return sp.getString("userfun", "");
	}

	public void setPhone(String userphone) {
		editor.putString("userphone", userphone);
		editor.commit();
	}

	public String getPhone() {
		return sp.getString("userphone", "");
	}

	public void setLog(String userlog) {
		editor.putString("userlog", userlog);
		editor.commit();
	}

	public String getLog() {
		return sp.getString("userlog", "");
	}

	public void setPasswd(String passwd) {
		editor.putString("passwd", passwd);
		editor.commit();
	}

	public String getPasswd() {
		return sp.getString("passwd", "");
	}

	public void setId(String id) {
		editor.putString("id", id);
		editor.commit();
	}

	public String getId() {
		return sp.getString("id", "");
	}

	public String getName() {
		return sp.getString("name", "");
	}

	public void setName(String name) {
		editor.putString("name", name);
		editor.commit();
	}
}
