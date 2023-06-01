package com.epicode.application.entities;

import jakarta.persistence.Entity;

@Entity
public class Merchandise extends Product {

	public Merchandise() {

	}

	public Merchandise(String nome, double prezzo) {
		super(nome, prezzo);
	}

	@Override
	public String toString() {
		return "Pizza [id=" + this.getId() + ", nome=" + this.getNome() + ", prezzo=" + this.getPrezzo() + "]";
	}

}
