package com.lulei.ssm.service;

import com.lulei.ssm.entity.User;
import com.lulei.ssm.result.CodeMsg;

public interface UserService {
	
	User findByName(String name);
	
	CodeMsg login(User user);
}
