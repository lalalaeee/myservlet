package com.lulei.ssm.dao;

import org.apache.ibatis.annotations.Select;

import com.lulei.ssm.entity.User;

public interface UserMapper {
	@Select("select * from user where name =#{name}")
	User findByName(String name);
}
