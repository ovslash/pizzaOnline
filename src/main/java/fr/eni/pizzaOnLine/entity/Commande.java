package fr.eni.pizzaOnLine.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDateTime dateHeureLivraison;
	private LocalDateTime dateHeurePreparation;
	
	@ManyToOne
	@JoinColumn(name = "etat_id")
	private Etat etat;
	
	@OneToMany
	@JoinColumn(name = "commande_id")
	private List<DetailCommande> detailCommande;
	
	public Commande() {
		// TODO Auto-generated constructor stub
		detailCommande = new ArrayList<DetailCommande>();
	}

	public Commande(Long id, LocalDateTime dateHeureLivraison, LocalDateTime dateHeurePreparation, Etat etat,
			List<DetailCommande> detailCommande) {
		super();
		this.id = id;
		this.dateHeureLivraison = dateHeureLivraison;
		this.dateHeurePreparation = dateHeurePreparation;
		this.etat = etat;
		this.detailCommande = detailCommande;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDateHeureLivraison() {
		return dateHeureLivraison;
	}

	public void setDateHeureLivraison(LocalDateTime dateHeureLivraison) {
		this.dateHeureLivraison = dateHeureLivraison;
	}

	public LocalDateTime getDateHeurePreparation() {
		return dateHeurePreparation;
	}

	public void setDateHeurePreparation(LocalDateTime dateHeurePreparation) {
		this.dateHeurePreparation = dateHeurePreparation;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public List<DetailCommande> getDetailCommande() {
		return detailCommande;
	}

	public void setDetailCommande(List<DetailCommande> detailCommande) {
		this.detailCommande = detailCommande;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", dateHeureLivraison=" + dateHeureLivraison + ", dateHeurePreparation="
				+ dateHeurePreparation + ", etat=" + etat + ", detailCommande=" + detailCommande + "]";
	}
	
	

}
