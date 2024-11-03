package tpexceptions;
public class compte2 {
    private double solde;

    public compte2() {
        this.solde = 0;
    }

    public void verser(double montant) throws MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Le montant à verser ne peut pas être négatif.");
        }
        solde += montant;
        System.out.println("Montant déposé : " + montant);
    }

    public void retirer(double montant) throws MontantNegatifException, SoldeInsuffisantException {
        if (montant < 0) {
            throw new MontantNegatifException("Le montant à retirer ne peut pas être négatif.");
        }
        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant !");
        }
        solde -= montant;
        System.out.println("Montant retiré : " + montant);
    }

    public double getSolde() {
        return solde;
    }
}


