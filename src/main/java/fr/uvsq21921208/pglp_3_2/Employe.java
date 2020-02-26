package fr.uvsq21921208.pglp_3_2;

public class Employe implements Salaire{
    private int nombreAnnee;
    Employe(){
    	this.nombreAnnee = 0;
    }
    public void incrementerAnnee() {
    	this.nombreAnnee += 1;
    }
	public float calculerSalaire() {
		return salaireDeBase + ( nombreAnnee * 20);
	}
	

}
