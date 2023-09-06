package fr.eni.pizzaOnLine.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import fr.eni.pizzaOnLine.converter.StringToCategory;

public class ConverterConfig implements WebMvcConfigurer {

	@Autowired
	private StringToCategory stringToCategory;
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(stringToCategory);
	}
}
