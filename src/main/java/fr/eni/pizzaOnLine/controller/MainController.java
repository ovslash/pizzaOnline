package fr.eni.pizzaOnLine.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.pizzaOnLine.entity.Produit;
import jakarta.websocket.server.PathParam;

@Controller
public class MainController {

	private List<Produit> lstproduits = new ArrayList<Produit>();

	public MainController() {
		Produit produit1 = new Produit(1L, "testNom", "testDesc", 1, "/img/pizza1.jpg");
		Produit produit2 = new Produit(2L, "testNom2", "testDesc2", 2, "/img/pizza2.jpg");
		Produit produit3 = new Produit(3L, "testNom3", "testDesc", 3, "/img/pizza3.jpg");

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
	public String supprimerProduit(@PathParam("id") Long id) {

		System.err.println(id); // OK
		
		//lstproduits.remove(-------------);

		return "redirect:/carte";
	}

}
