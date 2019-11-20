package com.foo.sparkproject.dao.factory;

import com.foo.sparkproject.dao.IAdBlacklistDAO;
import com.foo.sparkproject.dao.IAdClickTrendDAO;
import com.foo.sparkproject.dao.IAdProvinceTop3DAO;
import com.foo.sparkproject.dao.IAdStatDAO;
import com.foo.sparkproject.dao.IAdUserClickCountDAO;
import com.foo.sparkproject.dao.IAreaTop3ProductDAO;
import com.foo.sparkproject.dao.IPageSplitConvertRateDAO;
import com.foo.sparkproject.dao.ISessionAggrStatDAO;
import com.foo.sparkproject.dao.ISessionDetailDAO;
import com.foo.sparkproject.dao.ISessionRandomExtractDAO;
import com.foo.sparkproject.dao.ITaskDAO;
import com.foo.sparkproject.dao.ITop10CategoryDAO;
import com.foo.sparkproject.dao.ITop10SessionDAO;
import com.foo.sparkproject.dao.impl.AdBlacklistDAOImpl;
import com.foo.sparkproject.dao.impl.AdClickTrendDAOImpl;
import com.foo.sparkproject.dao.impl.AdProvinceTop3DAOImpl;
import com.foo.sparkproject.dao.impl.AdStatDAOImpl;
import com.foo.sparkproject.dao.impl.AdUserClickCountDAOImpl;
import com.foo.sparkproject.dao.impl.AreaTop3ProductDAOImpl;
import com.foo.sparkproject.dao.impl.PageSplitConvertRateDAOImpl;
import com.foo.sparkproject.dao.impl.SessionAggrStatDAOImpl;
import com.foo.sparkproject.dao.impl.SessionDetailDAOImpl;
import com.foo.sparkproject.dao.impl.SessionRandomExtractDAOImpl;
import com.foo.sparkproject.dao.impl.TaskDAOImpl;
import com.foo.sparkproject.dao.impl.Top10CategoryDAOImpl;
import com.foo.sparkproject.dao.impl.Top10SessionDAOImpl;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {


	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}

	public static ISessionAggrStatDAO getSessionAggrStatDAO() {
		return new SessionAggrStatDAOImpl();
	}
	
	public static ISessionRandomExtractDAO getSessionRandomExtractDAO() {
		return new SessionRandomExtractDAOImpl();
	}
	
	public static ISessionDetailDAO getSessionDetailDAO() {
		return new SessionDetailDAOImpl();
	}
	
	public static ITop10CategoryDAO getTop10CategoryDAO() {
		return new Top10CategoryDAOImpl();
	}
	
	public static ITop10SessionDAO getTop10SessionDAO() {
		return new Top10SessionDAOImpl();
	}
	
	public static IPageSplitConvertRateDAO getPageSplitConvertRateDAO() {
		return new PageSplitConvertRateDAOImpl();
	}
	
	public static IAreaTop3ProductDAO getAreaTop3ProductDAO() {
		return new AreaTop3ProductDAOImpl();
	}
	
	public static IAdUserClickCountDAO getAdUserClickCountDAO() {
		return new AdUserClickCountDAOImpl();
	}
	
	public static IAdBlacklistDAO getAdBlacklistDAO() {
		return new AdBlacklistDAOImpl();
	}
	
	public static IAdStatDAO getAdStatDAO() {
		return new AdStatDAOImpl();
	}
	
	public static IAdProvinceTop3DAO getAdProvinceTop3DAO() {
		return new AdProvinceTop3DAOImpl();
	}
	
	public static IAdClickTrendDAO getAdClickTrendDAO() {
		return new AdClickTrendDAOImpl();
	}
	
}
