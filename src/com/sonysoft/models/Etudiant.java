package com.sonysoft.models;

public class Etudiant {

	private String name;

	public Etudiant() {
		super();
	}

	public Etudiant(String name) {
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
		return "Etudiant [name=" + name + "]";
	}

}
