package com.app.booktravel.user.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.app.booktravel.common.action.SuperAction;
import com.app.booktravel.user.action.bean.QueryMyTopicsResult;
import com.app.booktravel.user.action.bean.QueryTopicDetailsResult;
import com.app.booktravel.user.action.bean.QueryTopicsResult;
import com.app.booktravel.user.model.Book;
import com.app.booktravel.user.model.Comment;
import com.app.booktravel.user.model.Topic;
import com.app.booktravel.user.model.User;
import com.app.booktravel.user.service.TopicService;

public class TopicAction extends SuperAction {
	private TopicService topicservice;

	public void setTopicservice(TopicService topicservice) {
		this.topicservice = topicservice;
	}

	public String queryTopics() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String start = request.getParameter("start");
		String offset = request.getParameter("offset");
		QueryTopicsResult res = topicservice.QueryTopics(
				Integer.valueOf(start), Integer.valueOf(offset));
		result = new QueryTopicsResult();
		if (res != null) {
			System.out.println("查询成功");
			List<Integer> praisenum = new ArrayList<Integer>();
			List<Integer> commentnum= new ArrayList<Integer>();
			List<Topic> topics = res.getTopics();
			for (Topic topic : topics) {
				praisenum.add(topicservice.CountPraiseNumByTopicId(topic.getTopicid()));
				commentnum.add(topicservice.CountCommentNumByTopicId(topic.getTopicid()));
			}
			res.setPraiseNum(praisenum);
			res.setCommentNum(commentnum);
			
			result = res;
			result.setCode(200);
			return SUCCESS;
		} else {
			result.setCode(100);
			return SUCCESS;
		}
	}
	
	public String queryTopicsByKeyWords() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String keyword = request.getParameter("keyword");
		String start = request.getParameter("start");
		String offset = request.getParameter("offset");
		QueryTopicsResult res = topicservice.QueryTopicsByKeyWords(
				keyword, Integer.valueOf(start), Integer.valueOf(offset));
		result = new QueryTopicsResult();
		if (res != null) {
			System.out.println("查询成功");
			List<Integer> praisenum = new ArrayList<Integer>();
			List<Integer> commentnum= new ArrayList<Integer>();
			List<Topic> topics = res.getTopics();
			for (Topic topic : topics) {
				praisenum.add(topicservice.CountPraiseNumByTopicId(topic.getTopicid()));
				commentnum.add(topicservice.CountCommentNumByTopicId(topic.getTopicid()));
			}
			res.setPraiseNum(praisenum);
			res.setCommentNum(commentnum);
			
			result = res;
			result.setCode(200);
			return SUCCESS;
		} else {
			System.out.println("查询失败");
			result.setCode(100);
			return SUCCESS;
		}
	}
	
	public String queryTopicDetails() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String topicid = request.getParameter("topicid");
		QueryTopicDetailsResult res = topicservice.QueryTopicById(Integer.valueOf(topicid));
		if (res.getTopic() == null) {
			System.out.println("查询失败");
			result.setCode(100);
			return SUCCESS;
		}
		else {
			System.out.println("查询成功");
			result = res;
			result.setCode(200);
			return SUCCESS;
		}
	}
}
