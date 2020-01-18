package com.company.controller;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class JDBCTest {
	protected Log log = LogFactory.getLog(this.getClass());


	static {
		try {
			Class.forName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testConnection() {
		try(Connection con= DriverManager.getConnection(
				"jdbc:log4jdbc:mysql://15.164.13.57:3306/schedule","admin","admin")){
			log.info("연결 성공");
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
}