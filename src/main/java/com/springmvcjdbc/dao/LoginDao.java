package com.springmvcjdbc.dao;

import com.springmvcjdbc.entities.Category;
import com.springmvcjdbc.entities.CategoryMapper;
import com.springmvcjdbc.entities.Login;
import com.springmvcjdbc.entities.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class LoginDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Login> findAll() {
        String sql = "SELECT * FROM Users";
        return jdbcTemplate.query(sql, new LoginMapper());
    }
}
