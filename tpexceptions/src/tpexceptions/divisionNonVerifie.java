package tpexceptions;

public class divisionNonVerifie {
    public static void main(String[] args) {
        
        int numerateur = 10;
        int diviseur = 0;

        try {
           
            int resultat = numerateur / diviseur;
            System.out.println("Résultat de la division : " + resultat);
        } catch (ArithmeticException e) {
           
            System.out.println("Erreur : Impossible de diviser par zéro !");
        } finally {
            
            System.out.println("Le programme s'est terminé correctement.");
        }
    }
}
