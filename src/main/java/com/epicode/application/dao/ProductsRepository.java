package com.epicode.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.application.entities.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {

}
