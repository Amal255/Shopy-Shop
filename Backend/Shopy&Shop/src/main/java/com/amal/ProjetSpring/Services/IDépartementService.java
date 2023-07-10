package com.amal.ProjetSpring.Services;

import java.util.List;

import com.amal.ProjetSpring.entity.Département;



public interface IDépartementService {

Département AddDépartement (Département dep);
	
	void DeleteDépartement (Long id_département);
	
	List<Département> GetAllDépartement();
	
	Département updateDépartement(Département dep);
}
