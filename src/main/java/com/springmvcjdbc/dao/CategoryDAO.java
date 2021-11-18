package com.springmvcjdbc.dao;

import java.util.List;

import com.springmvcjdbc.entities.Category;
import com.springmvcjdbc.entities.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CategoryDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Category> findAll() {
		String sql = "SELECT * FROM Category";
		return jdbcTemplate.query(sql, new CategoryMapper());
	}

	public static void main(String[] args) {
		List<Category> list = new CategoryDAO().findAll();
		for (Category item  : list){
			System.out.println(item);
		}
	}

}
