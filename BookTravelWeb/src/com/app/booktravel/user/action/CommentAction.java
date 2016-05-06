package com.app.booktravel.user.action;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.service.CommentService;

public class CommentAction extends SuperAction {
	private CommentService commentservice;

	public CommentService getCommentservice() {
		return commentservice;
	}

	public void setCommentservice(CommentService commentservice) {
		this.commentservice = commentservice;
	}

}
