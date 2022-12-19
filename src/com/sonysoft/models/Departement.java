package com.sonysoft.models;

public class Departement {

	private String name;

	public Departement() {
		super();
	}

	public Departement(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Departement [name=" + name + "]";
	}

}
