package com.app.booktravel.user.action;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.service.ActivityService;

public class ActivityAction extends SuperAction{
	private ActivityService activityservice;

	public void setActivityservice(ActivityService activityservice) {
		this.activityservice = activityservice;
	}
	
}
