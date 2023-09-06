package fr.eni.pizzaOnLine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TypeProduit {
	
	@Id
	private Long id;
	private String libelle;
	
	public TypeProduit() {
		// TODO Auto-generated constructor stub
	}

	public TypeProduit(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "TypeProduit [id=" + id + ", libelle=" + libelle + "]";
	}

	
	
	

}
