package com.sonysoft.models;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Etudiant sonia = new Etudiant("Sonia");
		Etudiant ines = new Etudiant("Iness");
		Etudiant mohamed = new Etudiant("Mohamed");
		Etudiant ali = new Etudiant("Ali");

		List<Etudiant> etudiants = new ArrayList<>();
		etudiants.add(sonia);
		etudiants.add(ines);
		etudiants.add(mohamed);
		etudiants.add(ali);

		Departement depratement = new Departement("physique");

		College college = new College("Ibn sina", depratement, etudiants);

		System.out.println(college.toString());
		System.out.println("Exclure Mohamed et Ali! collège pour les filles seulement");

		college.getEtudiants().remove(mohamed);
		college.getEtudiants().remove(ali);

		System.out.println(college.toString());

	}

}
