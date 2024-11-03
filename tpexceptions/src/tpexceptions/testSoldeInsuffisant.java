package tpexceptions;

public class testSoldeInsuffisant {

	    public static void main(String[] args) {
	        Compte cp = new Compte("234566Bkjd", 2000);

	        try {
	            cp.retirer(3500); 
	        } catch (SoldeInsuffisantException e) {
	            System.out.println("Erreur : " + e.getMessage());
	        }
	    }
	}


