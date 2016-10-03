package com.mychoice.service;


import java.util.List;

import com.mychoice.model.UserModel;

public interface UserService {

		void addUserModel(UserModel user);
		List<UserModel> viewUsers();
		UserModel getUserByName(String name);
}
