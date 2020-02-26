package fr.uvsq21921208.pglp_3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ManagerTest {

	
	@Test
	public void calculerSalaireTest(){
		Manager m = new Manager();
		m.changerNombreEmployee(5);
		assertEquals(2000, m.calculerSalaire(), 0);
	}
}
