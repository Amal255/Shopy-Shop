package com.amal.ProjetSpring.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.amal.ProjetSpring.entity.Etudiant;


@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Long>{
	
	//List<Etudiant> findBymatricule(String matricule);
	
}
