package fr.uvsq21921208.pglp_3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.uvsq21921208.pglp_3_2.Manager;

public class ManagerTest {
     /**
     * Test if the expected salary and calculated salary are equal.
     */
    @Test
    public void calculerSalireTest() {
          Manager m = new Manager();
          final int nombreEmployee = 5;
          m.changerNombreEmployee(nombreEmployee);
          final double expectedSalary = 2000;
          final double delta = 0;
          assertEquals(m.calculerSalaire(),  expectedSalary, delta);
    }
}
