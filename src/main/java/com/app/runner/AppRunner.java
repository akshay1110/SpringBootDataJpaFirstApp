package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class AppRunner implements CommandLineRunner{

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println("object Name: "+repo.getClass().getName());
		Product p=repo.save(new Product("A",2.3));
	     	System.out.println("product first saved" +p.getProdId());
	     	repo.save(new Product("B",3.4));
	     	repo.save(new Product("C",4.4));
	}

}
