package com.excelex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("excelDao")
public class ExcelDaoImpl implements ExcelDao {

	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Object> getBooks(Map<String, Object> searchMap) {
		return null;
	}

	@Override
	public List<Object> getBooksDetail(Map<String, Object> searchMap) {
		return null;
	}
	
	
	
}
