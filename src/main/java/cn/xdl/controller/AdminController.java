package cn.xdl.controller;

import java.util.List;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xdl.entity.Admin;
import cn.xdl.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService admin;
	
	@RequestMapping("/hello")
	public String toHello(HttpServletRequest request) {
		List<Admin> ad = admin.getAllAdmin();
		request.setAttribute("ad", ad);
		return "index";
	} 
	
	
	
}
