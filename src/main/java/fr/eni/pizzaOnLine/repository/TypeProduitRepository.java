package fr.eni.pizzaOnLine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.pizzaOnLine.entity.TypeProduit;

public interface TypeProduitRepository extends JpaRepository<TypeProduit, Long> {

	
}
