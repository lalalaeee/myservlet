package com.lulei.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lulei.ssm.entity.Book;
import com.lulei.ssm.service.BookService;

@Controller
public class BookController {
	@Autowired
	BookService service;
	
	@RequestMapping("find.do")
	public String findAll( Model model) {
		List<Book> books = service.findAll();
		System.out.println("sddssd"+books);
		model.addAttribute("books", books);
		return "show";
	}

}
