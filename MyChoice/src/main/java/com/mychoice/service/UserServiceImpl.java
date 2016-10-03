package com.mychoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mychoice.dao.UserDAO;
import com.mychoice.model.UserModel;

@Service
public class UserServiceImpl implements UserService{

		@Autowired
		UserDAO userDAO;
		public void addUserModel(UserModel user) {
			userDAO.addUserModel(user);
		
		}

		public List<UserModel> viewUsers() {
		List<UserModel> list=userDAO.viewUsers();
			return list;
		}

		@Override
		public UserModel getUserByName(String name) {
			
			return userDAO.getUserByName(name);
		}
		
	}
	


