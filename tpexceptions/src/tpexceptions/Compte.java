package tpexceptions;

public class Compte {
    private String numero;
    private float solde;

    public Compte(String numero, float solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public void verser(float mt) {
        solde += mt;
    }

    public void retirer(float mt) throws SoldeInsuffisantException {
        if (solde < mt) {
            throw new SoldeInsuffisantException("Solde insuffisant !");
        } else {
            solde -= mt;
        }
    }

    public float getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "[" + numero + ", " + solde + "]";
    }
}

