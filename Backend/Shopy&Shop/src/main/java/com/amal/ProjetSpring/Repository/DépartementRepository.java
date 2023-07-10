package com.amal.ProjetSpring.Repository;

import org.springframework.stereotype.Repository;

import com.amal.ProjetSpring.entity.Département;


import org.springframework.data.repository.CrudRepository;


@Repository
public interface DépartementRepository extends CrudRepository<Département, Long>{

}
