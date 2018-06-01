package com.eheio.model;

public class maladie {
	
	private int id;
	private String nom;
	private float valeur_max;
	private float valeur_min;
	private int id_mesure;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getValeur_max() {
		return valeur_max;
	}
	public void setValeur_max(float valeur_max) {
		this.valeur_max = valeur_max;
	}
	public float getValeur_min() {
		return valeur_min;
	}
	public void setValeur_min(float valeur_min) {
		this.valeur_min = valeur_min;
	}
	public int getId_mesure() {
		return id_mesure;
	}
	public void setId_mesure(int id_mesure) {
		this.id_mesure = id_mesure;
	}

}
