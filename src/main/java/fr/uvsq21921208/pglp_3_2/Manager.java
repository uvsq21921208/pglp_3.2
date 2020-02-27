package fr.uvsq21921208.pglp_3_2;
/**
 * class manager.
 */
public class Manager implements Salaire {
 /**
 * Nombre d'employee.
 */
private int nombreEmployee;
/**
 * prime fixe.
 */
private static final int FIXED_PRIME = 100;
    /**
    * constructeur.
    */
    public Manager() {
      nombreEmployee = 0;
    }
    /**
    * @return salaire
    */
    public float calculerSalaire() {
      return SALAIRE_DE_BASE + (FIXED_PRIME * nombreEmployee);
    }
    /**
    * @param nombreEmployeeParam nombre d'employee
    */
    public void changerNombreEmployee(final int nombreEmployeeParam) {
        if (nombreEmployee > 0) {
          this.nombreEmployee = nombreEmployeeParam;
        }
   }

}
