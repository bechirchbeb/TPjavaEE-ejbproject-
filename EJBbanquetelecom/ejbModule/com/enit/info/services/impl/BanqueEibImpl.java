package com.enit.info.services.impl;


import java.util.List;


import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import com.enit.info.model.Compte;
import com.enit.info.services.IBanqueLocal;
import com.enit.info.services.IBanqueRemote;

@Stateless(name="banqueTel1")
public class BanqueEibImpl implements IBanqueLocal, IBanqueRemote {

	//private static Map<Long, Compte> comptes= new HashMap<Long, Compte>();
	@PersistenceContext(unitName="bochboch")
	private EntityManager em;
	@Override
	public void addCompte(Compte c) {
		// TODO Auto-generated method stub
	//	comptes.put(c.getCode(), c);
		
		em.persist(c);
	}
	@Override
	public List<Compte> consulterComptes() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Compte consulterCompte(Long code) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void verser(Long code, double montant) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void retirer(Long code, double montant) {
		// TODO Auto-generated method stub
		
	}


/*	public List<Compte> consulterComptes() {
		// TODO Auto-generated method stub
	//	Collection<Compte> col=comptes.values();
	//	List<Compte> res= new ArrayList<Compte>(col);
		Query req=em.createQuery("select c from Compte c");
		return req.getResultList();
		//return res;
	}

	@Override
	public Compte consulterCompte(Long code) {
		// TODO Auto-generated method stub
		
		Compte cp=em.find(Compte.class, code);
            return cp;
		//return comptes.get(code);
	}

	@Override
	public void verser(Long code, double montant) {
		// TODO Auto-generated method stub
		//Compte c= comptes.get(code);
		Compte c= consulterCompte(code);
		c.setSolde(c.getSolde()+montant);
		
	}

	@Override
	public void retirer(Long code, double montant) {
		// TODO Auto-generated method stub
	//	Compte c= comptes.get(code);
		Compte c= consulterCompte(code);

		if (montant > c.getSolde()) throw new IllegalArgumentException("Solde Insuffisant");
		else
		c.setSolde(c.getSolde()-montant);
		
	}*/

}
