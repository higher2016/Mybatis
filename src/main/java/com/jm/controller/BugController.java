package com.jm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jm.model.Bug;
import com.jm.service.UserServiceI;

@Controller
@RequestMapping("/bug")
public class BugController extends BaseController{

	@Autowired
	private UserServiceI userService;

	@RequestMapping("/bugTest")
	@ResponseBody
	public String bugTest(String id,HttpServletRequest request){
		Bug bug = userService.getBugById(Long.valueOf(id));
		request.setAttribute("bug", bug);
		System.out.println(bug.gettBugId());
		return bug.gettBugId()+"";
	}
}
