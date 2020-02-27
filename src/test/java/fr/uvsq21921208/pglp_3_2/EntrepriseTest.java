package fr.uvsq21921208.pglp_3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.uvsq21921208.pglp_3_2.Employe;
import fr.uvsq21921208.pglp_3_2.Entreprise;
import fr.uvsq21921208.pglp_3_2.Manager;
import fr.uvsq21921208.pglp_3_2.Vendeur;

public class EntrepriseTest {
     /**
     * Test if the expected salary and calculated salary are equal.
     */
    @Test
    public void calculerSommeSalaireTest() {
        final double expectedSalary = 5240;
        Employe e = new Employe();
        e.incrementerAnnee();
        e.incrementerAnnee();
        final int commission = 200;
        Vendeur v = new Vendeur(commission);
        Entreprise ent = new Entreprise();
        Manager m = new Manager();
        final int nombreEmployee = 5;
        m.changerNombreEmployee(nombreEmployee);
        ent.ajouterSalaire(e);
        ent.ajouterSalaire(v);
        ent.ajouterSalaire(m);
        assertEquals(expectedSalary, ent.calculerSommeSalaire(), 0);
    }
}
