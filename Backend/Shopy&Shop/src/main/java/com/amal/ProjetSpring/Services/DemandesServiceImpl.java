package com.amal.ProjetSpring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amal.ProjetSpring.Repository.DemandesRepository;
import com.amal.ProjetSpring.entity.Demandes;


@Service
public class DemandesServiceImpl implements IDemandesService {

	@Autowired
	DemandesRepository demandesRepository;
	
	@Override
	public Demandes AddDemande(Demandes d) {
		return demandesRepository.save(d);
	}

	@Override
	public void DeleteDemande(Long id_demande) {
		// TODO Auto-generated method stub
		demandesRepository.deleteById(id_demande);
	}

	@Override
	public List<Demandes> GetAllDemande() {
		// TODO Auto-generated method stub
		return (List<Demandes>) demandesRepository.findAll();
	}

	@Override
	public Demandes updateDemande(Demandes d) {
		// TODO Auto-generated method stub
		return demandesRepository.save(d);
	}
	
	

}
