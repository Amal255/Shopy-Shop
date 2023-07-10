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

import com.amal.ProjetSpring.Services.IEtudiantService;
import com.amal.ProjetSpring.entity.Etudiant;



@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EtudiantController {

	@Autowired
	IEtudiantService etudiantservice;
	
	//Affichage de tous les etudiants
	@GetMapping("/Etudiant")
	@ResponseBody
	public List<Etudiant> getAllEtudiant(){
		List<Etudiant> liste=etudiantservice.GetAllEtudiant();
		return liste;
	}
	
	//Ajouter un etudiant
	@PostMapping("/AddEtudiant")
	@ResponseBody
	public Etudiant AddEtudiant (@RequestBody Etudiant e) {
		return etudiantservice.AddEtudiant(e);
		
	}
	
	//Suppression d'un etudiant par son id
	@DeleteMapping("/DeleteEtudiant/{id}")
	@ResponseBody
	public void DeleteEtudiant(@PathVariable("id")Long id_etudiant) {
		etudiantservice.DeleteEtudiant(id_etudiant);
	}
	
	//Modification d'un etudiant
	@PutMapping("/UpdateEtudiant")
	@ResponseBody
	public Etudiant UpdateEtudiant(@RequestBody Etudiant e) {
		return etudiantservice.updateEtudiant(e);
	}
	
	@GetMapping("/Etudiant/{id}")  
	public Etudiant getEtudiant(@PathVariable("id") Long id_etudiant)   
	{  
	return etudiantservice.GetEtudiant(id_etudiant);  
	}  
  
}
