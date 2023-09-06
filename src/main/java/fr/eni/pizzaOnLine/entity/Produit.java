package fr.eni.pizzaOnLine.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	private float prix;
	private String urlImage;

	@ManyToOne
	@JoinColumn(name = "type_produit_id")
	private TypeProduit typeProduit;

	public Produit() {
		// TODO Auto-generated constructor stub
	}

	public Produit(String nom, String description, float prix, String urlImage, TypeProduit typeProduit) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.urlImage = urlImage;
		this.typeProduit = typeProduit;
	}

	public Produit(Long id, String nom, String description, float prix, String urlImage, TypeProduit typeProduit) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.urlImage = urlImage;
		this.typeProduit = typeProduit;
	}

	public Produit(Long id) {
		super();
		this.id = id;

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
	
	

	public TypeProduit getTypeProduit() {
		return typeProduit;
	}

	public void setTypeProduit(TypeProduit typeProduit) {
		this.typeProduit = typeProduit;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + ", urlImage="
				+ urlImage + ", typeProduit=" + typeProduit + "]";
	}

	
}
