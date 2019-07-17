package com.lulei.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lulei.ssm.entity.User;
import com.lulei.ssm.result.CodeMsg;
import com.lulei.ssm.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping("/login.do")
	public String  login(User user,Model model) {
		CodeMsg codeMsg = service.login(user);
		if(codeMsg.getCode()==0) {
			return "forward:find.do";	
		}else {
			model.addAttribute("msg", codeMsg.getMsg());
			return "login";
		}
		
	}
}
