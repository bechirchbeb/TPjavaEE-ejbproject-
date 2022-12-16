package com.enit.info.services;

import java.util.List;

import jakarta.ejb.Remote;

import com.enit.info.model.Compte;

@Remote
public interface IBanqueRemote {


	public void addCompte(Compte c);
	public List<Compte> consulterComptes();
	public Compte consulterCompte(Long code); 
	public void verser(Long code,double montant); 
	public void retirer(Long code,double montant); 
	
}
