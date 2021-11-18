package com.springmvcjdbc.controller;

import com.springmvcjdbc.dao.BooksDAO;
import com.springmvcjdbc.dao.CategoryDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BooksController {

	@Autowired
	private CategoryDAO categoryDAO;

	@Autowired
	private BooksDAO booksDAO;

	@GetMapping(value = {"/", "/book-list"})
	public String listBook(Model model) {
		model.addAttribute("listbook", booksDAO.findAll());
		return "customer-list";
	}

	@GetMapping("/book-save")
	public String insertBook(Model model) {
		model.addAttribute("listCat", categoryDAO.findAll());
		return "customer-save";
	}

	@PostMapping("/book-save")
	public String insertCustomer(@RequestParam(value = "title")String name,
								 @RequestParam(value = "price") Float price,
								 @RequestParam(value = "cat") int cat,
								 Model model) {
		booksDAO.save(name,cat,price);
		return "customer-save";
	}

	@GetMapping("/bookDelete/{id}")
	public String doDeleteCustomer(@PathVariable int id, Model model) {
		booksDAO.delete(id);
		model.addAttribute("listbook", booksDAO.findAll());
		return "customer-list";
	}
}
