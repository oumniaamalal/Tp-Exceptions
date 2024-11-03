package tpexceptions;
import java.util.Scanner;

public class conversinVerifie {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Veuillez saisir un nombre : ");
	        String saisie = scanner.nextLine();

	        convertirEnEntier(saisie);
	        scanner.close();
	    }	

	
	    public static void convertirEnEntier(String nombre) {
	        try {
	       
	            int resultat = Integer.parseInt(nombre);
	            System.out.println("Conversion réussie, le nombre est : " + resultat);
	        } catch (NumberFormatException e) {
	          
	            System.out.println("Erreur : La saisie '" + nombre + "' n'est pas un nombre valide.");
	        } finally {
	  
	            System.out.println("Bloc finally : Conversion terminée.");
	        }
	    }
	}

