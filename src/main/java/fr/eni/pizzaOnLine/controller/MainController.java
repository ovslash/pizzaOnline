package fr.eni.pizzaOnLine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.pizzaOnLine.entity.Produit;
import fr.eni.pizzaOnLine.service.ProduitService;

@Controller
public class MainController {

	@Autowired
	ProduitService produitService;

	// private List<Produit> lstproduits = new ArrayList<Produit>();



	@GetMapping("/carte")
	public String afficherCarte(Model model) {
		model.addAttribute("produits", produitService.consulterProduits());
		return "carte";
	}

	@GetMapping("/carte/ajouter")
	public String enregistrementProduit(Model model) {
		model.addAttribute("produit", new Produit());
		return "ajouter";

	}

	@PostMapping("/carte/ajouter")
	public String enregistrementProduit(@ModelAttribute Produit produit) {
		produitService.sauvegarderProduit(produit);
		return "redirect:/carte";
	}

	@GetMapping("/carte/supprimer")
	public String supprimerProduit(@RequestParam("id") Long id) {

		produitService.supprimerProduit(id);

		return "redirect:/carte";
	}

	@GetMapping("/carte/modifier")
	public String modifierProduit(@RequestParam("id") Long id, Model model) {

		Produit p = produitService.findById(id);

		model.addAttribute("produit", p);
		return "modifier";
	}

	@PostMapping("/carte/modifier")
	public String modifierProduit(@ModelAttribute Produit produit) {

		System.err.println(produit);
		
		produitService.modifierProduit(produit);
		return "redirect:/carte";
	}
}
