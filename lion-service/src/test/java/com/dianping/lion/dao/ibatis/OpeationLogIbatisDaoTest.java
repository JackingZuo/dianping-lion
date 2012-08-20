/**
 * Project: com.dianping.lion.lion-console-0.0.1
 * 
 * File Created at 2012-7-9
 * $Id$
 * 
 * Copyright 2010 dianping.com.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dianping Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with dianping.com.
 */
package com.dianping.lion.dao.ibatis;

import java.util.List;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dianping.lion.dao.OperationLogDao;
import com.dianping.lion.entity.OperationLog;
import com.dianping.lion.entity.OperationLogSearch;
import com.dianping.lion.support.AbstractDaoTestSupport;

public class OpeationLogIbatisDaoTest extends AbstractDaoTestSupport {
	
	@Autowired
	private OperationLogDao operationLogDao;

	@Test
	@Ignore
	public void testGetLogs() {
		List<OperationLog> opeationLogs = operationLogDao.getLogs();
		Assert.assertNotNull(opeationLogs);
	}
	
	@Test
	@Ignore
	public void testGetLogList() {
		OperationLogSearch operationLogSearch = new OperationLogSearch();
		List<OperationLog> opeationLogs = operationLogDao.getLogList(operationLogSearch);
		Assert.assertNotNull(opeationLogs);

		operationLogSearch.setContent("%xxxxttt%");
		operationLogSearch.setProject(234235);
		opeationLogs = operationLogDao.getLogList(operationLogSearch);
		Assert.assertTrue(opeationLogs.size() == 0);
		
		operationLogSearch.setContent("");
		operationLogSearch.setProject(-1);
		operationLogSearch.setFrom("2012-07-16");
		operationLogSearch.setTo("2012-07-18");
		opeationLogs = operationLogDao.getLogList(operationLogSearch);
		Assert.assertTrue(opeationLogs.size() != 0);
	}

}