package fr.eni.pizzaOnLine.service;

import java.util.List;

import fr.eni.pizzaOnLine.entity.Produit;

public interface ProduitService {

	List<Produit> consulterProduits();

	void sauvegarderProduit(Produit produit);
	
	void supprimerProduit(Long id);
	
	void modifierProduit(Produit produit);

	Produit findById(Long id);
	
}
