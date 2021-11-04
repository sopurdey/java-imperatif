package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	/**
	 * Méthode d'exécution de la classe
	 * @param args
	 */
	public static void main(String[] args) {
		// Demander à l'utiisateur un nombre entre 1 et 10
		System.out.println("Saisissez un nombre entre 1 et 10");
		Scanner scanner = new Scanner(System.in) ;
		int nb = scanner.nextInt() ;
		
		// Si nombre pas entre 1 et 10, demander un autre
		if (nb <= 1 || nb >= 10) {
			System.out.println("Le nombre n'est pas entre 1 et 10, merci d'en saisir un autre");
			nb = scanner.nextInt() ;
			while (nb <= 1 || nb >= 10) {
				System.out.println("Le nombre n'est pas entre 1 et 10, merci d'en saisir un autre");
				nb = scanner.nextInt() ;
			}
			// Afficher le nombre si entre 1 et 10
			for (int i = 1; i <= 10; i++) {
				System.out.println(nb + " * " + i + " = " + nb * i);
			} 
		} else {
			// Afficher le nombre si entre 1 et 10
						for (int i = 1; i <= 10; i++) {
							System.out.println(nb + " * " + i + " = " + nb * i);
						}
		}
	}

}

