package fr.eni.pizzaOnLine.service;

import java.util.List;

import fr.eni.pizzaOnLine.entity.Produit;
import fr.eni.pizzaOnLine.entity.TypeProduit;

public interface ProduitService {

	List<Produit> consulterProduits();
	void sauvegarderProduit(Produit produit);
	void supprimerProduit(Long id);
	void modifierProduit(Produit produit);
	Produit findById(Long id);
	
	List<TypeProduit> findAllTypeProduit();
	TypeProduit findOneProduit(Long id);
	
}
