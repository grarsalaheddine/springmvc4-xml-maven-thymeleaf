package com.eheio.model;

public class mesure {

	private int id;
	private String nom_mesure;
	private float mesure;
	private int id_patient;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom_mesure() {
		return nom_mesure;
	}
	public void setNom_mesure(String nom_mesure) {
		this.nom_mesure = nom_mesure;
	}
	public float getMesure() {
		return mesure;
	}
	public void setMesure(float mesure) {
		this.mesure = mesure;
	}
	public int getId_patient() {
		return id_patient;
	}
	public void setId_patient(int id_patient) {
		this.id_patient = id_patient;
	}
}
