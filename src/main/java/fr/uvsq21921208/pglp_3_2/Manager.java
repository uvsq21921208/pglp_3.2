package fr.uvsq21921208.pglp_3_2;

public class Manager implements Salaire{
private int nombreEmployee;

    public Manager() {
    	nombreEmployee = 0;
    }
	public float calculerSalaire() {
		// TODO Auto-generated method stub
		return salaireDeBase + (100 * nombreEmployee);
	}
	
	public void changerNombreEmployee(int nombreEmployee) {
		if (nombreEmployee > 0) {
			this.nombreEmployee = nombreEmployee;
		}
	}

}
