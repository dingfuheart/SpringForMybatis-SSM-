package com.mybatis.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mybatis.model.User;
import com.mybatis.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger logger=Logger.getLogger(UserController.class);
	@Resource
	private UserService userService;
	int ID;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
	    int userId = Integer.parseInt(request.getParameter("id"));
	    User user = this.userService.getUserById(userId);
	    logger.debug(user.getUsername());
	    model.addAttribute("user", user);
	    return "showUser";
	  }
	
	@RequestMapping("/deleteUser")
	public @ResponseBody Map<String,Object> deleteUser(HttpServletRequest request,HttpServletResponse response) throws IOException{
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("msg", "error");
		boolean flag=this.userService.isDeleteUser(ID);
		if (flag) {
			map.put("msg", "success");
		}
		return map;
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	
	
	
}
