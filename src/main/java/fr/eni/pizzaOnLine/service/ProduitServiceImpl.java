package fr.eni.pizzaOnLine.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.entity.Produit;

@Service
public class ProduitServiceImpl implements ProduitService {

	private List<Produit> lstproduits = new ArrayList<Produit>();

	public ProduitServiceImpl() {
		Produit produit1 = new Produit(1L, "testNom111", "testDesc111", 1, "/img/pizza1.jpg");
		Produit produit2 = new Produit(2L, "testNom222", "testDesc222", 2, "/img/pizza2.jpg");
		Produit produit3 = new Produit(3L, "testNom333", "testDesc333", 3, "/img/pizza3.jpg");

		lstproduits.add(produit1);
		lstproduits.add(produit2);
		lstproduits.add(produit3);
	}

	@Override
	public List<Produit> consulterProduits() {
		// TODO Auto-generated method stub
		return lstproduits;
	}

	@Override
	public void sauvegarderProduit(Produit produit) {
		lstproduits.add(produit);

	}

	@Override
	public void supprimerProduit(Long id) {
		// TODO Auto-generated method stub

		Produit p = new Produit();
		p.setId(id);
		lstproduits.remove(p);

	}

	@Override
	public void modifierProduit(Produit produit) {
		// TODO Auto-generated method stub
		for (Produit produitOrigine : lstproduits) {
			if (produitOrigine.equals(produit)) {

				lstproduits.remove(produitOrigine);
				lstproduits.add(produit);
				break;
			}
		}

	}

	@Override
	public Produit findById(Long id) {
		Produit produit = new Produit(id);
		for (Produit produitOrigine : lstproduits) {
			if (produitOrigine.equals(produit)) {

				return produitOrigine;
			}
		}
		return null;
	}

}
