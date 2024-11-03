package tpexceptions;

import java.util.Scanner;

import java.util.InputMismatchException;


public class testMontantNegatif {
    public static void main(String[] args) {
        compte2 compte = new compte2();
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Entrez le montant à verser : ");
            double montantVerser = scanner.nextDouble();
            compte.verser(montantVerser);
        } catch (MontantNegatifException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Vous devez entrer un nombre valide pour le montant à verser.");
            scanner.next(); 
        }

        try {
         
            System.out.print("Entrez le montant à retirer : ");
            double montantRetirer = scanner.nextDouble();
            compte.retirer(montantRetirer);
        } catch (MontantNegatifException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Vous devez entrer un nombre valide pour le montant à retirer.");
        } finally {
            System.out.println("Solde actuel : " + compte.getSolde());
            scanner.close();
        }
    }
}

