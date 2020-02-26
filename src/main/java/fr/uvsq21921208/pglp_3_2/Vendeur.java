package fr.uvsq21921208.pglp_3_2;

public class Vendeur implements Salaire{
	private int commission;
	
	public Vendeur(int commission) {
        this.commission =  commission;
	}
	public float calculerSalaire() {
		// TODO Auto-generated method stub
		return salaireDeBase + commission;
	}

}
