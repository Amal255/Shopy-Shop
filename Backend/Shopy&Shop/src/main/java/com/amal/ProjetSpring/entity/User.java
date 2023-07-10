package com.amal.ProjetSpring.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_user;
	
	@NotBlank
	private String nom;
	
	@NotBlank
	private String prenom;
	
	@NotBlank
	private String mdp;
	
	@NotBlank
	private int role;
	
	@NotBlank
	private int presence;
	
	@NotBlank
	private int absence;
	
	@NotBlank
	private int retard;
	
	@NotBlank
	private int tel;
	

	@Email
	private String email;
	

}
