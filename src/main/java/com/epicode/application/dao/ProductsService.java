package com.epicode.application.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.application.entities.Product;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository productsRepo;

	public void create(Product p) {
		productsRepo.save(p);
	}

	public List<Product> find() {
		return productsRepo.findAll();
	}

	public Product findById(Long id) {
		return productsRepo.findById(id).orElseThrow(() -> new NullPointerException());
	}

	public void findByIdAndUpdate(Long id, Product p) {

		Product found = this.findById(id);
		found.setId(id);
		found.setNome(p.getNome());
		found.setPrezzo(p.getPrezzo());
		productsRepo.save(found);
	}

	public void findByIdAndDelete(Long id) {
		Product found = this.findById(id);
		productsRepo.delete(found);
	}

	public long count() {
		return productsRepo.count();
	}

}
