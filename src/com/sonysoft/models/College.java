package com.sonysoft.models;

import java.util.List;

public class College {

	private String name;

	private Departement departement;

	private List<Etudiant> etudiants;

	public College() {
		super();
	}

	public College(String name, Departement departement) {
		this.name = name;
		this.departement = departement;
	}

	public College(String name, Departement departement, List<Etudiant> etudiants) {
		this.name = name;
		this.departement = departement;
		this.etudiants = etudiants;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", departement=" + departement + ", etudiants=" + etudiants + "]";
	}

}
