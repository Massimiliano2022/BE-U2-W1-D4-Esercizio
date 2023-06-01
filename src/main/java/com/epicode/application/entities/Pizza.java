package com.epicode.application.entities;

import jakarta.persistence.Entity;

@Entity
public class Pizza extends Product implements FoodItem {

	protected double calorie;

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	@Override
	public double getCalorie() {
		return calorie;
	}

	public Pizza() {

	}

	public Pizza(String nome, double prezzo, double calorie) {
		super(nome, prezzo);
		setCalorie(calorie);
	}

	@Override
	public String toString() {
		return "Pizza [id=" + this.getId() + ", nome=" + this.getNome() + ", prezzo=" + this.getPrezzo() + ",calorie="
				+ calorie + "]";
	}

}
