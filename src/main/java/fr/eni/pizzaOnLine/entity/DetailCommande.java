package fr.eni.pizzaOnLine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DetailCommande {
	
	private int quantite;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "produit_id")
	private Produit produit;
	
	@ManyToOne
	@JoinColumn(name = "commande_id")
	private Commande commande;
	
	public DetailCommande() {
		// TODO Auto-generated constructor stub
	}

	public DetailCommande(int quantite, Long id, Produit produit, Commande commande) {
		super();
		this.quantite = quantite;
		this.id = id;
		this.produit = produit;
		this.commande = commande;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "DetailCommande [quantite=" + quantite + ", id=" + id + ", produit=" + produit + ", commande=" + commande
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	

}
