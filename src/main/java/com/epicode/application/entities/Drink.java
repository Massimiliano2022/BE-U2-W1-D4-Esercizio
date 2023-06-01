package com.epicode.application.entities;

import jakarta.persistence.Entity;

@Entity
public class Drink extends Product implements FoodItem {

	protected double calorie;

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	@Override
	public double getCalorie() {
		return calorie;
	}

	public Drink() {

	}

	public Drink(String nome, double prezzo, double calorie) {
		super(nome, prezzo);
		setCalorie(calorie);
	}

	@Override
	public String toString() {
		return "Drink [id=" + this.getId() + ", nome=" + this.getNome() + ", prezzo=" + this.getPrezzo() + ",calorie="
				+ calorie + "]";
	}

}
