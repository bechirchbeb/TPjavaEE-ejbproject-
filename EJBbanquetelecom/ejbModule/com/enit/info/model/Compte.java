package com.enit.info.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
//@Table(name="COMPTES")
public class Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Compte() { //constructeur par defaut 
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(Long code, double solde, Date dateCreation) { //constructeur parametre 
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	private Long code;
	private double solde;
	private Date dateCreation;
	@Id
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	//@Column(name="")
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result
				+ ((dateCreation == null) ? 0 : dateCreation.hashCode());
		long temp;
		temp = Double.doubleToLongBits(solde);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (dateCreation == null) {
			if (other.dateCreation != null)
				return false;
		} else if (!dateCreation.equals(other.dateCreation))
			return false;
		if (Double.doubleToLongBits(solde) != Double
				.doubleToLongBits(other.solde))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + ", dateCreation="
				+ dateCreation + "]";
	}
	
	
	
}
