package com.amal.ProjetSpring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amal.ProjetSpring.Services.IDocumentService;
import com.amal.ProjetSpring.entity.Document;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DocumentController {

	@Autowired
	IDocumentService documentservice;
	
	//Ajouter un document
	@PostMapping("/AddDocument")
	@ResponseBody
	public Document AddDocument(@RequestBody Document doc) {
		return documentservice.AddDocument(doc);
	}
	
	//Supprimer un document par son id
	@DeleteMapping("/DeleteDocument/{id}")
	@ResponseBody
	public void DeleteDocument(@PathVariable("id") Long id_document) {
		documentservice.DeleteDocument(id_document);
	}
	
	//Modifier un document
	@PutMapping("/UpdateDocument")
	@ResponseBody
	public Document UpdateDocument(@RequestBody Document doc) {
		return documentservice.updateDocument(doc);
	}
	
	//Afficher un document
	@GetMapping("/Document")
	@ResponseBody
	public List<Document> GetAllDocument(){
		List<Document>liste=documentservice.GetAllDocument();
		return liste;
	}
}
