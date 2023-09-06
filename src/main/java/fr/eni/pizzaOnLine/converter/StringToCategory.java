package fr.eni.pizzaOnLine.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import fr.eni.pizzaOnLine.entity.TypeProduit;
import fr.eni.pizzaOnLine.service.ProduitService;

public class StringToCategory implements Converter<String, TypeProduit> {

	@Autowired
	private ProduitService produitService;
	
	@Override
	public TypeProduit convert(String source) {
		long id = Long.parseLong(source);
		return produitService.findOneProduit(id);
	}

}
