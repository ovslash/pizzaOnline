package fr.eni.pizzaOnLine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {

	@GetMapping("/carte")
	public String afficherCarte() {
		return "carte";
	}
	
	
}
