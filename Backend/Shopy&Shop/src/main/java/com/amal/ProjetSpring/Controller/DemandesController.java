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

import com.amal.ProjetSpring.Services.IDemandesService;
import com.amal.ProjetSpring.entity.Demandes;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DemandesController {

	@Autowired
	IDemandesService demandeservice;
	
	//Ajouter une demande
	@PostMapping("/AddDemandes")
	@ResponseBody
	public Demandes AddDemande(@RequestBody Demandes d) {
		return demandeservice.AddDemande(d);
	}
	
	//Supprimer une demande par son id
	@DeleteMapping("/DeleteDemande/{id}")
	@ResponseBody
	public void DeleteDemande(@PathVariable("id") Long id_demande) {
		demandeservice.DeleteDemande(id_demande);
	}
	
	//Modifier une demande
	@PutMapping("/UpdateDemande")
	@ResponseBody
	public Demandes UpdateDemande(@RequestBody Demandes d) {
		return demandeservice.updateDemande(d);
	}
	
	//Afficher une demande
	@GetMapping("/Demande")
	@ResponseBody
	public List<Demandes> GetAllDemande(){
		List<Demandes>liste=demandeservice.GetAllDemande();
		return liste;
	}
}

