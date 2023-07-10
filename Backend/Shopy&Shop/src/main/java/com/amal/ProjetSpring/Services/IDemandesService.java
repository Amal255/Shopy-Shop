package com.amal.ProjetSpring.Services;

import java.util.List;

import com.amal.ProjetSpring.entity.Demandes;


public interface IDemandesService {
	
	Demandes AddDemande (Demandes d);
	
	void DeleteDemande (Long id_demande);
	
	List<Demandes> GetAllDemande();
	
	Demandes updateDemande(Demandes d);
	
	
	

}
