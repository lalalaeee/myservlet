package com.lulei.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.lulei.ssm.entity.Book;

public interface BookMapper {
	@Select("select * from book")
	List<Book> findAll();

}
