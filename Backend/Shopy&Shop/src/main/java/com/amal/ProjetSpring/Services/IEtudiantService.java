package com.amal.ProjetSpring.Services;

import java.util.List;

import com.amal.ProjetSpring.entity.Etudiant;





public interface IEtudiantService {

Etudiant AddEtudiant (Etudiant e);
	
	void DeleteEtudiant (Long id_etudiant);
	
	List<Etudiant> GetAllEtudiant();
	
	Etudiant updateEtudiant(Etudiant e);
	
	Etudiant GetEtudiant(Long id_etudiant);
	
	// List<Etudiant> GetEtudiantByMatricule(String matricule);
	
}
