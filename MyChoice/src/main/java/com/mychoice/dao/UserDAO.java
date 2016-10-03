package com.mychoice.dao;

import java.util.List;

import com.mychoice.model.UserModel;



public interface UserDAO {
	void addUserModel(UserModel user);
    public List<UserModel> viewUsers();
    UserModel getUserByName(String name);
}
