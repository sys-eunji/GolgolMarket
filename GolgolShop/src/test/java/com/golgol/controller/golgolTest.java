package com.golgol.controller;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class golgolTest {
	@Autowired
	private SqlSession sqlSession; 

	@Test
	void test() {
		assertNotNull(this.sqlSession);
	}

}
