package cn.xdl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.dao.AdminDao;
import cn.xdl.entity.Admin;

@Service
public class AdminService {
	
	@Autowired
	private AdminDao dao;
	
	public List<Admin> getAllAdmin() {
		return dao.getAllAdmin();
	}
	
}
