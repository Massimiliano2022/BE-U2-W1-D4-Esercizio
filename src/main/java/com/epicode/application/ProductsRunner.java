package com.epicode.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.application.dao.ProductsService;

@Component
public class ProductsRunner implements CommandLineRunner {

	@Autowired
	ProductsService productsService;

	@Override
	public void run(String... args) throws Exception {

		// Pizza pizzaMargherita = new Pizza("Margherita", 4.99, 1104);
		// Drink coke = new Drink("Mole Cola", 1.50, 299);
		// Merchandise m = new Merchandise("t-shirt", 19.99);

		// productsService.create(pizzaMargherita);
		// productsService.create(coke);
		// productsService.create(m);

		System.out.println(productsService.findById(1L));

	}

}
