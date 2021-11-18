package com.springmvcjdbc.dao;

import com.springmvcjdbc.entities.Books;
import com.springmvcjdbc.entities.BooksMapper;
import com.springmvcjdbc.entities.Category;
import com.springmvcjdbc.entities.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class BooksDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Books> findAll() {
        String sql = "SELECT * FROM Books inner join Category on cat_id = CategoryId ";
        return jdbcTemplate.query(sql, new BooksMapper());
    }
    public void save(String title,int cat,Float price) {
		String sql = "INSERT INTO Books (Title, Price,cat_id) VALUES (?, ?,?)";
		jdbcTemplate.update(sql, title,price,cat);
	}
    public void delete(int id) {
		String sql = "DELETE FROM Books WHERE BookId = " + id;
		jdbcTemplate.update(sql);
	}
}
