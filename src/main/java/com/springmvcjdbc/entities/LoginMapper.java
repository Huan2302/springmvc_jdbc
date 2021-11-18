package com.springmvcjdbc.entities;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginMapper implements RowMapper<Login> {
    @Override
    public Login mapRow(ResultSet resultSet, int i) throws SQLException {
        Login login = new Login();
        login.setId(resultSet.getInt("UserId"));
        login.setUsername(resultSet.getString("UserName"));
        login.setPassword(resultSet.getString("password"));
        return login;
    }
}
