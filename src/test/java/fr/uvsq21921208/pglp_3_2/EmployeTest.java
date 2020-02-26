package fr.uvsq21921208.pglp_3_2;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeTest {


	  @Test
	  public void CalculerSalireTest() {
		  Employe e = new Employe();
		  e.incrementerAnnee();
		  e.incrementerAnnee();
		  assertEquals(e.calculerSalaire(),1540 , 0);
		   
	  }
	  
	
}
