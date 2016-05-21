package com.app.booktravel.user.action;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.service.DriftpointService;

public class DriftpointAction extends SuperAction {
	private DriftpointService driftpointservice;

	public void setDriftpointservice(DriftpointService driftpointservice) {
		this.driftpointservice = driftpointservice;
	}

}
