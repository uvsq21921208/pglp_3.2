package fr.uvsq21921208.pglp_3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EntrepriseTest {
	@Test
	public void calculerSommeSalaireTest() {
		Employe e = new Employe();
		e.incrementerAnnee();
		e.incrementerAnnee();
		
		Vendeur v = new Vendeur(200);
		Entreprise ent = new Entreprise();
		Manager m = new Manager();
		m.changerNombreEmployee(5);
		ent.ajouterSalaire(e);
		ent.ajouterSalaire(v);
		ent.ajouterSalaire(m);
		assertEquals(5240,ent.calculerSommeSalaire(),0);
	}
}
