package com.amal.ProjetSpring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amal.ProjetSpring.entity.Document;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {

}
