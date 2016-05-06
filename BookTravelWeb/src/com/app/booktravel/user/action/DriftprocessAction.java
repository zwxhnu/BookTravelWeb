package com.app.booktravel.user.action;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.service.DriftprocessService;

public class DriftprocessAction extends SuperAction {
	private DriftprocessService driftprocessservice;

	public DriftprocessService getDriftprocessservice() {
		return driftprocessservice;
	}

	public void setDriftprocessservice(DriftprocessService driftprocessservice) {
		this.driftprocessservice = driftprocessservice;
	}

}
