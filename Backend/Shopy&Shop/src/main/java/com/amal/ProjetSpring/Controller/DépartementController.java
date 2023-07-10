package com.amal.ProjetSpring.Controller;

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


import com.amal.ProjetSpring.Services.IDépartementService;
import com.amal.ProjetSpring.entity.Département;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DépartementController {
	@Autowired
	IDépartementService departementservice;
	
	//Ajouter un département
	@PostMapping("/AddDepartement")
	@ResponseBody
	public Département AddDépartement(@RequestBody Département dep) {
		return departementservice.AddDépartement(dep);
	}
	
	//Supprimer un département par son id
	@DeleteMapping("/DeleteDeparment/{id}")
	@ResponseBody
	public void DeleteDépartement(@PathVariable("id") Long id_departement) {
		departementservice.DeleteDépartement(id_departement);
	}
	
	//Modifier un département
	@PutMapping("/UpdateDepartement")
	@ResponseBody
	public Département UpdateDépartement(@RequestBody Département dep) {
		return departementservice.updateDépartement(dep);
	}
	
	//Afficher un département
	@GetMapping("/Departement")
	@ResponseBody
	public List<Département> GetAllDépartement(){
		List<Département>liste=departementservice.GetAllDépartement();
		return liste;
	}

}
