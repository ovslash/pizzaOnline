package fr.eni.pizzaOnLine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.entity.Commande;
import fr.eni.pizzaOnLine.repository.CommandeRepository;

@Service("commandeService")
public class CommandeServiceImpl implements CommandeService {
	
	@Autowired
	private CommandeRepository commandeRepository;
	
	public CommandeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sauvegarderCommande(Commande commande) {
		commandeRepository.save(commande);
		
	}
	

}
