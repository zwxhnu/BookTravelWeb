package com.app.booktravel.user.serviceimpl;

import com.app.booktravel.user.dao.ActivityDAO;
import com.app.booktravel.user.service.ActivityService;

public class ActivityServiceImpl implements ActivityService {
	private ActivityDAO activitydao;

	public ActivityDAO getActivitydao() {
		return activitydao;
	}

	public void setActivitydao(ActivityDAO activitydao) {
		this.activitydao = activitydao;
	}

}
