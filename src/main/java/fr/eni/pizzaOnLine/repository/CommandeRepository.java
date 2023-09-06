package fr.eni.pizzaOnLine.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import fr.eni.pizzaOnLine.entity.Commande;

public interface CommandeRepository extends JpaRepositoryImplementation<Commande, Long>{

}
