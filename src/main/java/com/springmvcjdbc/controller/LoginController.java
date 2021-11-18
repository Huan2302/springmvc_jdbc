package com.springmvcjdbc.controller;

import com.springmvcjdbc.dao.BooksDAO;
import com.springmvcjdbc.dao.CategoryDAO;
import com.springmvcjdbc.dao.LoginDao;
import com.springmvcjdbc.entities.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LoginController {


    @Autowired
    private CategoryDAO categoryDAO;

    @Autowired
    private BooksDAO booksDAO;
    @Autowired
    private LoginDao loginDao;
    @GetMapping(value = {"/login"})
    public String listBook() {
        List<Login> list = loginDao.findAll();
        return "login";
    }
    @PostMapping(value = {"/login"})
    public String listBook(@RequestParam(value = "name")String name,
                           @RequestParam(value = "pass")String pass,
                           Model model) {
        System.out.println(name);
        List<Login> list = loginDao.findAll();
        for (Login item : list){
            if (name.equals(item.getUsername()) && pass.equals(item.getPassword())){
                model.addAttribute("listbook", booksDAO.findAll());
                return "customer-list";}
        }
        model.addAttribute("msg","username and password invalid");
        return "login";
    }
}
