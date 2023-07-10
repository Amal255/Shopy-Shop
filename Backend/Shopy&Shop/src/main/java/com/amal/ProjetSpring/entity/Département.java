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
public class Département implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_departement;
	@NotBlank
    private String nom;
	
    @NotBlank
	private String prenom;
	
    @NotBlank
	@Email
	private String email;
	
	@NotBlank
	private String mdp;
	
	//Relation Département et document
	@OneToMany(mappedBy="département")
	 @JsonIgnore
	private List<Document> documents;
	
	//Relation Département et personnel
	//@OneToMany(mappedBy="département")
	//@JsonIgnore
	//private List<User> personnels;

	
	

}
