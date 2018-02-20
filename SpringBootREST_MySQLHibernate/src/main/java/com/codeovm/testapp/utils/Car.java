package com.codeovm.testapp.utils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "model")
	private String model;

	@Column(name = "saleYear")
	private int saleYear;

	public Car() {
	}

	public Car(String model, int saleYear) {
		this.model = model;
		this.saleYear = saleYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSaleYear() {
		return saleYear;
	}

	public void setSaleYear(int saleYear) {
		this.saleYear = saleYear;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", saleYear=" + saleYear + "]";
	}

}
