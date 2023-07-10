package com.amal.ProjetSpring.Services;

import java.util.List;

import com.amal.ProjetSpring.entity.Document;


public interface IDocumentService {

Document AddDocument (Document doc);
	
	void DeleteDocument (Long id_document);
	
	List<Document> GetAllDocument();
	
	Document updateDocument(Document doc);
}
