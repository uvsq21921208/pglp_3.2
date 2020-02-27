package fr.uvsq21921208.pglp_3_2;
/**
 * class employee.
 */
public class Employe implements Salaire {
    /**
     * nombreAnnee d'experience.
     */
    private int nombreAnnee;
    /**
     * Constructeur.
     */
    Employe() {
       this.nombreAnnee = 0;
    }
    /**
     * incfrementer le nombre d'annee d'experience.
     */
    public void incrementerAnnee() {
        this.nombreAnnee += 1;
    }
    /**
     * @return salaireDebase salaire.
     */
    public float calculerSalaire() {
        final int fixedPrime = 20;
        return SALAIRE_DE_BASE + (nombreAnnee * fixedPrime);
    }
}
