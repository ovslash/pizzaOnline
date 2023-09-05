package fr.eni.pizzaOnLine.entity;

import java.util.Objects;

public class Produit {

	private Long id;
	private String nom;
	private String description;
	private float prix;
	private String urlImage;
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}

	public Produit(String nom, String description, float prix, String urlImage) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.urlImage = urlImage;
	}

	public Produit(Long id, String nom, String description, float prix, String urlImage) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.urlImage = urlImage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getUrlImage() {
		return urlImage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		return Objects.equals(id, other.id);
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + ", urlImage="
				+ urlImage + "]";
	}
	
	

}
