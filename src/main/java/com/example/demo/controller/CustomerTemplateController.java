package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Books;
import com.example.demo.repository.BookDao;



@RestController
public class CustomerTemplateController  {
		
	@Autowired
	BookDao bookDao;
	
	
	
	
	
	@GetMapping("/getBook/{bookid}")
	public List<Books> findoneBook(@RequestParam Integer bookid) {
		return bookDao.getoneBook(bookid);
	}
	
	 
	  
	
	
	
}
