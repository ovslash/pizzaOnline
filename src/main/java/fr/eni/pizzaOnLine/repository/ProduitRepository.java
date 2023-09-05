package fr.eni.pizzaOnLine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.pizzaOnLine.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

	
}
