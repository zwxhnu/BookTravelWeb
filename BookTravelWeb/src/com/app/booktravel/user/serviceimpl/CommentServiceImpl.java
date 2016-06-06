package com.app.booktravel.user.serviceimpl;

import com.app.booktravel.user.dao.CommentDAO;
import com.app.booktravel.user.service.CommentService;

public class CommentServiceImpl implements CommentService {
	private CommentDAO commentdao;

	public void setCommentdao(CommentDAO commentdao) {
		this.commentdao = commentdao;
	}

}
