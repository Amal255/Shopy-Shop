package com.amal.ProjetSpring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amal.ProjetSpring.Repository.DocumentRepository;
import com.amal.ProjetSpring.entity.Document;

@Service
public class DocumentServiceImpl implements IDocumentService{

	@Autowired
	DocumentRepository documentRepository;
	
	@Override
	public Document AddDocument(Document doc) {
		// TODO Auto-generated method stub
		return documentRepository.save(doc);
	}

	@Override
	public void DeleteDocument(Long id_document) {
		// TODO Auto-generated method stub
		documentRepository.deleteById(id_document);
	}

	//Jointure 
	@Override
	public List<Document> GetAllDocument() {
		// TODO Auto-generated method stub
		return (List<Document>) documentRepository.findAll();
	}

	@Override
	public Document updateDocument(Document doc) {
		// TODO Auto-generated method stub
		return documentRepository.save(doc);
	}

}
