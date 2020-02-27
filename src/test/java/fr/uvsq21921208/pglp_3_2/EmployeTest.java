package fr.uvsq21921208.pglp_3_2;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.uvsq21921208.pglp_3_2.Employe;

public class EmployeTest {
     /**
     * Test if the expected salary and calculated salary are equal.
     */
    @Test
    public void calculerSalireTest() {
          Employe e = new Employe();
          e.incrementerAnnee();
          e.incrementerAnnee();
          final double expectedSalary = 1540;
          final double delta = 0;
          assertEquals(e.calculerSalaire(),  expectedSalary, delta);
    }
}
