package com.amal.ProjetSpring.Services;

import java.util.List;

import com.amal.ProjetSpring.entity.User;



public interface IUserService {
	
User AddUser (User per);
	
	void DeleteUser (Long id_user);
	
	List<User> GetAllUser();
	
	User updateUser(User per);

	User Login(User per);
}
