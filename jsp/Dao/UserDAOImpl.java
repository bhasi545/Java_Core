package com.Servlet.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.Servlet.Classes.UserDTO;

public class UserDAOImpl implements UserDAO{

	public boolean registerUser(String username, String password, String email, String mobileno) throws SQLException {
		Connection con = null;
		boolean status = true;
		
		return status;
	}

	public UserDTO searchUser(String username) throws SQLException {
		Connection con = null;
		UserDTO userDTO = new UserDTO("Bhasi","bhasi","bhasi@gmail.com","123456789");
		return userDTO;	
	}

	public List<UserDTO> getAllUsers() throws SQLException {
		Connection con = null;
		List<UserDTO> userList = new ArrayList<UserDTO>();
		UserDTO userDTO = new UserDTO("Bhasi","bhasi","bhasi@gmail.com","123456789");
		userList.add(userDTO);
		
		
		return userList;
	}


	
	
}
