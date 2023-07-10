package com.amal.ProjetSpring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amal.ProjetSpring.Repository.UserRepository;
import com.amal.ProjetSpring.entity.User;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User AddUser(User per) {
		// TODO Auto-generated method stub
		 return userRepository.save(per);
	}

	@Override
	public void DeleteUser(Long id_user) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id_user);
	}

	@Override
	public List<User> GetAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User updateUser(User per) {
		// TODO Auto-generated method stub
		return userRepository.save(per);
	}
	
	@Override
	public User Login(User per) {
		User user;
		// TODO Auto-generated method stub
	    try{ user=userRepository.findByEmail(per.getEmail());}
	    catch(Exception e) {return null;}
	     if(user.getMdp().equals(per.getMdp()))
	   return user ;
	   else 
		   return null;
		  
	}

}
