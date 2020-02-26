package fr.uvsq21921208.pglp_3_2;

import java.util.ArrayList;

public class Entreprise {
 private ArrayList<Salaire> salaires;
 public Entreprise() {
	 salaires = new ArrayList<Salaire>();
 }
 
 public float calculerSommeSalaire() {
	 float somme = 0;
	 for (Salaire salaire : salaires) {
		 somme += salaire.calculerSalaire();
	 }
	 return somme;
 }
 public void ajouterSalaire(Salaire salaire) {
	 this.salaires.add(salaire);
}
}
