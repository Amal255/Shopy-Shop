package com.amal.ProjetSpring.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.amal.ProjetSpring.Services.IUserService;
import com.amal.ProjetSpring.entity.User;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	
	@Autowired
	IUserService userservice;
	
	//Ajouter un personnel
		@PostMapping("/AddUser")
		@ResponseBody
		public User AddUser(@RequestBody User per) {
			return userservice.AddUser(per);
		}
		
		//Supprimer un personnel par son id
		@DeleteMapping("/DeleteUser/{id}")
		@ResponseBody
		public void DeleteUser(@PathVariable("id") Long id_User) {
			userservice.DeleteUser(id_User);
		}
		
		//Modifier un personnel
		@PutMapping("/UpdateUser")
		@ResponseBody
		public User updateUser(@RequestBody User per) {
			return userservice.updateUser(per);
		}
		
		//Afficher un personnel
		@GetMapping("/Users")
		@ResponseBody
		public List<User> GetAllUser(){
			List<User>liste=userservice.GetAllUser();
			return liste;
		}
		
		//Afficher un personnel
				@GetMapping("/ListeEtudiant")
				@ResponseBody
				public List<User> GetAllEtudiant(){
					List<User>liste=userservice.GetAllUser();
					List<User>liste2=new ArrayList();
					for (User user: liste) {
						if(user.getRole()==2)
							liste2.add(user);
					}
					return liste2;
				}
		
		
		//login
		@PostMapping("/Login")
		@ResponseBody
		public User Login(@RequestBody User per) {
			return userservice.Login(per);
		}

}
