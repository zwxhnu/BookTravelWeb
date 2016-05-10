package com.app.bigger.topic.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.app.bigger.common.action.SuperAction;
import com.app.bigger.topic.action.bean.FindTopicByIdResult;
import com.app.bigger.topic.action.bean.FindTopicByUseridResult;
import com.app.bigger.topic.action.bean.FindTopicsByLableResult;
import com.app.bigger.topic.action.bean.queryByKeyWordsResult;
import com.app.bigger.topic.action.bean.queryHotTopicResult;
import com.app.bigger.topic.service.TopicService;

public class TopicAction extends SuperAction {
	private TopicService topicservice;

	public TopicService getTopicservice() {
		return topicservice;
	}

	public void setTopicservice(TopicService topicservice) {
		this.topicservice = topicservice;
	}

	public String queryByKeyWords() {
		HttpServletRequest request = ServletActionContext.getRequest();
		result = new queryByKeyWordsResult();
		String keyword = null;
		try {
			keyword = new String(request.getParameter("keyword").getBytes(
					"ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result = topicservice.findTopicsByKeywords(keyword);
		result.setCode(200);
		return SUCCESS;
	}

	public String queryHotTopics() {
		HttpServletRequest request = ServletActionContext.getRequest();
		result = new queryHotTopicResult();
		String sum = request.getParameter("sum");
		result = topicservice.findHotTopics(Integer.valueOf(sum));
		result.setCode(200);
		return SUCCESS;
	}

	public String findTopicById() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("id");
		result = new FindTopicByIdResult();
		result = topicservice.findTopicById(id);
		result.setCode(200);
		return SUCCESS;
	}

	public String findTopicByUserid() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userid = request.getParameter("userid");
		result = new FindTopicByUseridResult();
		result = topicservice.findTopicByUserid(userid);
		result.setCode(200);
		return SUCCESS;
	}

	public String findTopicsByLable() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String lable = null;
		try {
			lable = new String(request.getParameter("lable").getBytes(
					"ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String num = request.getParameter("num");
		result = new FindTopicsByLableResult();
		result = topicservice.FindTopicsByLable(lable, num);
		result.setCode(200);
		return SUCCESS;
	}
}
