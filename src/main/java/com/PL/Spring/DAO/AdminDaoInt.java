package com.PL.Spring.DAO;

import java.util.List;
import java.util.Map;

import com.PL.Spring.Entities.Admin;


public interface AdminDaoInt {

	void addAdmin(Admin admin);
	void editAdmin(Admin admin);
	void deleteAdmin(Long userId);
	Admin findAdmin(Long userId);
	Admin findAdminByName(String username);
	List<Admin> finAdminByProps(Map<String,Object> props);
	List<Admin> getAllAdmins();
	
	
}
