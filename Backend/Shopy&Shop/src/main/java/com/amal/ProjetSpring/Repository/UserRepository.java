package com.amal.ProjetSpring.Repository;

import org.springframework.data.repository.CrudRepository;

import com.amal.ProjetSpring.entity.User;



public interface UserRepository extends CrudRepository<User, Long>{

	

	User findByEmail(String email);

}
