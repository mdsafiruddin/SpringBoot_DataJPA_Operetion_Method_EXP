package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class JPARunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;
	

	@Override
	public void run(String... args) throws Exception {
		
		
	 //repo.findByProdCode("cream").forEach(System.out::println);
		repo.findByProdCodeIs("biscuit").forEach(System.out::println);
	}

}
