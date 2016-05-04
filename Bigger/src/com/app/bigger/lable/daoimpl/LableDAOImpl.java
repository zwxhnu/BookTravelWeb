package com.app.bigger.lable.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.app.bigger.lable.action.bean.QueryAllLables;
import com.app.bigger.lable.dao.LableDAO;
import com.app.bigger.lable.model.Lable;

public class LableDAOImpl extends HibernateDaoSupport implements LableDAO {

	@Override
	public QueryAllLables getAllLables() {
		// TODO Auto-generated method stub
		QueryAllLables lables = new QueryAllLables();
		List<Lable> list = (List<Lable>) getHibernateTemplate().find(
				"from Lable");
		if (list.size() == 0)
			return null;
		lables.setLables(list);
		return lables;
	}
}
