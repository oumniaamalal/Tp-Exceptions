package tpexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class saisieUtilisateur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nombre = 0;

        System.out.print("Entrez un nombre : ");

        try {
            nombre = scanner.nextFloat(); 
        } catch (InputMismatchException e) {
            
            System.out.println("Erreur : Vous devez entrer un nombre valide.");
        } finally {
            System.out.println("Tentative de saisie terminée.");
        }

      
        if (scanner.hasNextFloat()) {
            System.out.println("Vous avez entré : " + nombre);
        }

        scanner.close(); 
    }
}

