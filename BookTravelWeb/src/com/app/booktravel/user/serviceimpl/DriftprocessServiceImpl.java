package com.app.booktravel.user.serviceimpl;

import com.app.booktravel.user.dao.DriftprocessDAO;
import com.app.booktravel.user.service.DriftprocessService;

public class DriftprocessServiceImpl implements DriftprocessService {
	private DriftprocessDAO driftprocessdao;

	public DriftprocessDAO getDriftprocessdao() {
		return driftprocessdao;
	}

	public void setDriftprocessdao(DriftprocessDAO driftprocessdao) {
		this.driftprocessdao = driftprocessdao;
	}

}
