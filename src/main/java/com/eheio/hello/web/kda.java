package com.eheio.hello.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "kda")
public class kda {
@Id
@Column(name="id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(name="refs")
private int refs;
@Column(name="kda")
private int kda;
@Column(name="kdaa")
private int kdaa;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRefs() {
	return refs;
}
public void setRefs(int refs) {
	this.refs = refs;
}
public int getKda() {
	return kda;
}
public void setKda(int kda) {
	this.kda = kda;
}
public int getKdaa() {
	return kdaa;
}
public void setKdaa(int kdaa) {
	this.kdaa = kdaa;
}
}
