package fr.uvsq21921208.pglp_3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.uvsq21921208.pglp_3_2.Vendeur;

public class VendeurTest {
	
	


  @Test
  public void CalculerSalireTest() {
	  Vendeur v = new Vendeur(200);
	  assertEquals(v.calculerSalaire(), 1700, 0);
	  
	  
  }
  

}
