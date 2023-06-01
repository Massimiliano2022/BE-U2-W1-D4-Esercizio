package com.epicode.application.entities;

import java.util.List;

public class Menu {

	private Long id;
	private List<Pizza> listaPizze;
	private List<Drink> listaDrinks;
	private List<Merchandise> listaMerchandise;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Pizza> getListaPizze() {
		return listaPizze;
	}

	public void setListaPizze(List<Pizza> listaPizze) {
		this.listaPizze = listaPizze;
	}

	public List<Drink> getListaDrinks() {
		return listaDrinks;
	}

	public void setListaDrinks(List<Drink> listaDrinks) {
		this.listaDrinks = listaDrinks;
	}

	public List<Merchandise> getListaMerchandise() {
		return listaMerchandise;
	}

	public void setListaMerchandise(List<Merchandise> listaMerchandise) {
		this.listaMerchandise = listaMerchandise;
	}

	public Menu() {

	}

	public Menu(List<Pizza> listaPizze, List<Drink> listaDrinks, List<Merchandise> listaMerchandise) {
		setListaPizze(listaPizze);
		setListaDrinks(listaDrinks);
		setListaMerchandise(listaMerchandise);
	}

}
