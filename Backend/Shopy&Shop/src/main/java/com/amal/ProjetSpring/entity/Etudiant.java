package com.amal.ProjetSpring.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_etudiant;
	
	
	private String nom;
	
	
	private String prenom;
	
    private String reclamation;
	
	
	private String typedocument;
	
	@Email
	private String email;
	
	
	private String mdp;
	
	
	
	

	
}

	
	




	
	






