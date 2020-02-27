package fr.uvsq21921208.pglp_3_2;

import java.util.ArrayList;
/**
 * class Entreprise.
 */
public class Entreprise {
/**
* liste des salaires.
*/
 private ArrayList<Salaire> salaires;
/**
 *Constructeur.
 */
 public Entreprise() {
   salaires = new ArrayList<Salaire>();
}
/**
 *
 * @return salaire.
 */
public float calculerSommeSalaire() {
   float somme = 0;
   for (Salaire salaire : salaires) {
       somme += salaire.calculerSalaire();
   }
   return somme;
}
/**
 *
 * @param salaireParam salaire.
 */
public void ajouterSalaire(final Salaire salaireParam) {
   this.salaires.add(salaireParam);
}
}
