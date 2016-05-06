package com.app.booktravel.user.serviceimpl;

import com.app.booktravel.user.dao.TopicDAO;
import com.app.booktravel.user.service.TopicService;

public class TopicServiceImpl implements TopicService {
	private TopicDAO topicdao;

	public TopicDAO getTopicdao() {
		return topicdao;
	}

	public void setTopicdao(TopicDAO topicdao) {
		this.topicdao = topicdao;
	}

}
