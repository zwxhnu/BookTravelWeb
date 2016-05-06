package com.app.booktravel.user.serviceimpl;

import com.app.booktravel.user.dao.DriftpointDAO;
import com.app.booktravel.user.service.DriftpointService;

public class DriftpointServiceImpl implements DriftpointService {
	private DriftpointDAO driftpointdao;

	public DriftpointDAO getDriftpointdao() {
		return driftpointdao;
	}

	public void setDriftpointdao(DriftpointDAO driftpointdao) {
		this.driftpointdao = driftpointdao;
	}

}
