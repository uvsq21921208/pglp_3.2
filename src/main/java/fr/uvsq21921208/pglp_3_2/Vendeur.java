package fr.uvsq21921208.pglp_3_2;
/**
 * class Vendeur.
 */
public class Vendeur implements Salaire {
        /**
         * comission.
         */
        private int commission;
        /**
         *
         * @param commissionParametre commission
        */
        public Vendeur(final int commissionParametre) {
        this.commission =  commissionParametre;
        }
        /**
        * @return salaire.
        */
        public float calculerSalaire() {

           return SALAIRE_DE_BASE + commission;
        }

}
