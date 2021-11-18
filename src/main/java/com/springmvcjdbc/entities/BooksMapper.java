package com.springmvcjdbc.entities;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BooksMapper implements RowMapper<Books> {
    @Override
    public Books mapRow(ResultSet resultSet, int i) throws SQLException {
        Books books = new Books();
        books.setId(resultSet.getInt("BookId"));
        books.setTitle(resultSet.getString("Title"));
        books.setPrice(resultSet.getFloat("Price"));
        Category category = new Category();
        category.setId(resultSet.getInt("CategoryId"));
        category.setName(resultSet.getString("CategoryName"));
        books.setCat(category);
        return books;
    }
}
