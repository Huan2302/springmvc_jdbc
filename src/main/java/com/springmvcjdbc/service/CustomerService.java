//package com.springmvcjdbc.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.springmvcjdbc.dao.CustomerDAO;
//
//@Service
//@Transactional
//public class CustomerService {
//
//	@Autowired
//	private CustomerDAO customerDAO;
//
//	public List<Customer> findAll() {
//		return customerDAO.findAll();
//	}
//
//	public Customer findById(int id) {
//		return customerDAO.findById(id);
//	}
//
//	public void save(Customer customer){
//		// validate business
//		customerDAO.save(customer);
//	}
//
//	public void update(Customer customer){
//		// validate business
//		customerDAO.update(customer);
//	}
//
//	public void delete(int id){
//		// validate business
//		customerDAO.delete(id);
//	}
//}
