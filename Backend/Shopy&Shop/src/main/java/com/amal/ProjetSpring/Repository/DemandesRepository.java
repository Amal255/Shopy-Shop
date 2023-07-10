package com.amal.ProjetSpring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amal.ProjetSpring.entity.Demandes;

@Repository
public interface DemandesRepository extends CrudRepository<Demandes,Long>{

}
