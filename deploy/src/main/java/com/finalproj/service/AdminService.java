package com.finalproj.service;

import java.util.List;
import com.finalproj.dao.UserDao; 
import com.finalproj.model.Admin;

public class AdminService {
    
    private UserDao adminDao; 
    
    public AdminService() {
        adminDao = new UserDao(); 
    }
    
    public List<Admin> getAllAdmins() {
        try {
            return adminDao.getAllUsers(); 
        } catch (Exception e) {
            System.err.println("Lỗi lấy người dùng: " + e.getMessage());
            return null;
        }
    }
    
    public void addAdmin(Admin admin) {
        try {
            adminDao.addUser(admin); 
        } catch (Exception e) {
            System.err.println("Lỗi thêm người quản lí: " + e.getMessage());
        }
    }
    
    public void updateAdmin(Admin admin) {
        try {
            adminDao.updateUser(admin); 
        } catch (Exception e) {
            System.err.println("Lỗi cập nhật người quản lý: " + e.getMessage());
        }
    }
    
    public void deleteAdmin(String code_admin) {
        try {
            adminDao.deleteUser(code_admin); 
        } catch (Exception e) {
            System.err.println("Lỗi xoá người quản lý: " + e.getMessage());
        }
    }
}


