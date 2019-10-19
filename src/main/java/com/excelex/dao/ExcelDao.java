package com.excelex.dao;

import java.util.List;
import java.util.Map;

public interface ExcelDao {
	
	public List<Object> getBooks(Map<String, Object> searchMap);
	public List<Object> getBooksDetail(Map<String, Object> searchMap);

}
