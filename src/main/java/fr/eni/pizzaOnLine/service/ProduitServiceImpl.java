package fr.eni.pizzaOnLine.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.entity.Produit;
import fr.eni.pizzaOnLine.entity.TypeProduit;
import fr.eni.pizzaOnLine.repository.ProduitRepository;
import fr.eni.pizzaOnLine.repository.TypeProduitRepository;

@Service("produitService")
public class ProduitServiceImpl implements ProduitService {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Autowired
	private TypeProduitRepository typeProduitRepository;

	
	

	public ProduitServiceImpl() {

	}

	@Override
	public List<Produit> consulterProduits() {
		
		return produitRepository.findAll();
	}

	
	@Override
	public void sauvegarderProduit(Produit produit) {
		
		produitRepository.save(produit);

	}

	@Override
	public void supprimerProduit(Long id) {
		
		produitRepository.deleteById(id);

	}

	@Override
	public void modifierProduit(Produit produit) {
		System.out.println(produit);
		produitRepository.save(produit);

	}

	@Override
	public Produit findById(Long id) {
		
		return produitRepository.findById(id).get();
	}

	@Override
	public List<TypeProduit> findAllTypeProduit() {
		
		return typeProduitRepository.findAll();
	}

	@Override
	public TypeProduit findOneProduit(Long id) {
		
		return typeProduitRepository.findById(id).get();
	}

}
