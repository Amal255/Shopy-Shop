package com.amal.ProjetSpring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amal.ProjetSpring.Repository.EtudiantRepository;
import com.amal.ProjetSpring.entity.Etudiant;





@Service
public class EtudiantServiceImpl implements IEtudiantService{

	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Override
	public Etudiant AddEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return etudiantRepository.save(e);
	}

	@Override
	public void DeleteEtudiant(Long id_etudiant) {
		// TODO Auto-generated method stub
		etudiantRepository.deleteById(id_etudiant);
	}

	@Override
	public List<Etudiant> GetAllEtudiant() {
		// TODO Auto-generated method stub
		return (List<Etudiant>) etudiantRepository.findAll();
	}

	@Override
	public Etudiant updateEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return etudiantRepository.save(e);
	}

	@Override
	public Etudiant GetEtudiant(Long id_etudiant) {
		// TODO Auto-generated method stub
		Etudiant e = etudiantRepository.findById(id_etudiant).get();
		return e;
	}

	
	//@Override
	//public List<Etudiant> GetEtudiantByMatricule(String matricule) {
		// TODO Auto-generated method stub
		//return (List<Etudiant>) etudiantRepository.findBymatricule(matricule);
	//}

	


	
}
