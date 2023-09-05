package fr.eni.pizzaOnLine.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.pizzaOnLine.entity.Produit;
import jakarta.websocket.server.PathParam;

@Controller
public class MainController {

	private List<Produit> lstproduits = new ArrayList<Produit>();

	public MainController() {
		Produit produit1 = new Produit(1L, "testNom111", "testDesc111", 1, "/img/pizza1.jpg");
		Produit produit2 = new Produit(2L, "testNom222", "testDesc222", 2, "/img/pizza2.jpg");
		Produit produit3 = new Produit(3L, "testNom333", "testDesc333", 3, "/img/pizza3.jpg");

		lstproduits.add(produit1);
		lstproduits.add(produit2);
		lstproduits.add(produit3);

	}

	@GetMapping("/carte")
	public String afficherCarte(Model model) {

		model.addAttribute("produits", lstproduits);
		return "carte";
	}

	@GetMapping("/carte/ajouter")
	public String enregistrementProduit(Model model) {
		model.addAttribute("produit", new Produit());

		return "ajouter";

	}

	@PostMapping("/carte/ajouter")
	public String enregistrementProduit(@ModelAttribute Produit produit) {
		lstproduits.add(produit);
		return "redirect:/carte";
	}

	@GetMapping("/carte/supprimer")
	public String supprimerProduit(@RequestParam("id") Long id) {

//		System.out.println("suppr");
//		System.err.println(id); // OK

		Produit p = new Produit();
		p.setId(id);
		lstproduits.remove(p);

		return "redirect:/carte";
	}

	@GetMapping("/carte/modifier")
	public String modifierProduit(@RequestParam("id") Long id, Model model) {
		
		Produit p = new Produit();

		for (Produit produit : lstproduits) {
			if (produit.getId() == id) {
				p = produit;
			}
		}

		model.addAttribute("produit", p);
		
		

		return "modifier";
	}
	
	@PostMapping("/carte/modifier")
	public String modifierProduit( Produit produit) {
		
//		System.out.println(produit);
//		System.out.println("-----------------------------");
//		System.out.println(lstproduits);
//		
//		for (Produit produitOrigine : lstproduits) {
//			if (produitOrigine.getId() == produit.getId()) {
//				produitOrigine = produit;
//			}
//		}
		
		
		
		
		
		return "redirect:/carte";
	}
}
