package com.amal.ProjetSpring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amal.ProjetSpring.Repository.DépartementRepository;
import com.amal.ProjetSpring.entity.Département;

@Service
public class DépartementServiceImpl implements IDépartementService{

	@Autowired
	DépartementRepository départementRepository;
	
	@Override
	public Département AddDépartement(Département dep) {
		// TODO Auto-generated method stub
		return départementRepository.save(dep);
	}

	@Override
	public void DeleteDépartement(Long id_département) {
		// TODO Auto-generated method stub
		départementRepository.deleteById(id_département);
	}

	@Override
	public List<Département> GetAllDépartement() {
		// TODO Auto-generated method stub
		return (List<Département>) départementRepository.findAll();
	}

	@Override
	public Département updateDépartement(Département dep) {
		// TODO Auto-generated method stub
		return départementRepository.save(dep);
	}

	
}
