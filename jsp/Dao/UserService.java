package com.Servlet.Classes;

import java.sql.SQLException;
import java.util.List;

import com.Servlet.Classes.UserDAO;
import com.Servlet.Classes.UserDAOImpl;
import com.Servlet.Classes.UserDTO;

public class UserService {

	public boolean registerUser(String username, String password, String email, String mobileno) {
		
		UserDAO userdao = new UserDAOImpl();
		boolean status = false;
		try {
			status = userdao.registerUser(username, password, email, mobileno);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	public UserDTO searchUser(String username) {
		UserDAO userdao = new UserDAOImpl();
		boolean status = false;
		UserDTO userDTO = null;
		try {
			userDTO = userdao.searchUser(username);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userDTO;
	
	}
	
	public List<UserDTO>  getAllUsers(){
		UserDAO userdao = new UserDAOImpl();
		List<UserDTO> userList = null;
		try {
			userList = userdao.getAllUsers();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
			
	}
	
	
}
