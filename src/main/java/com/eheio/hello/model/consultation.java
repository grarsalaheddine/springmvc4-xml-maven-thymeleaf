package com.eheio.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "consultation")
public class consultation {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "observation" )
	private String observation;
	@Column(name = "date_observation")
	private Date date_observation;
	@OneToMany(mappedBy="patient", cascade = CascadeType.ALL)
	private utilisateur patient;
	@OneToMany(mappedBy="medecin", cascade = CascadeType.ALL)
	private int id_medecin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public Date getDate_observation() {
		return date_observation;
	}
	public void setDate_observation(Date date_observation) {
		this.date_observation = date_observation;
	}
	public utilisateur getpatient() {
		return patient;
	}
	public void setpatient(utilisateur patient) {
		this.patient = patient;
	}
	public int getId_medecin() {
		return id_medecin;
	}
	public void setId_medecin(int id_medecin) {
		this.id_medecin = id_medecin;
	}
}
