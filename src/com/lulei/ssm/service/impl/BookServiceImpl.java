package com.lulei.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lulei.ssm.dao.BookMapper;
import com.lulei.ssm.entity.Book;
import com.lulei.ssm.service.BookService;

@Service("bookservice")
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookMapper mapper;
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();

	
	}

}
