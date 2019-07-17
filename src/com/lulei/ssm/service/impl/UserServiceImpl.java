package com.lulei.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lulei.ssm.dao.UserMapper;
import com.lulei.ssm.entity.User;
import com.lulei.ssm.result.CodeMsg;
import com.lulei.ssm.service.UserService;

@Service("userservice")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper mapper;
	
	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return mapper.findByName(name);
	}

	@Override
	public CodeMsg login(User user) {
		// TODO Auto-generated method stub
		User u = findByName(user.getName());
		if (u==null) {
			return new CodeMsg(1,"用戶名不存在");
		}else {
			if(u.getPwd().equals(user.getPwd())) {
				return new CodeMsg(0,"登录成功");
			}else{
				return new CodeMsg(2,"密码错误");
			}
		}
	}

}
