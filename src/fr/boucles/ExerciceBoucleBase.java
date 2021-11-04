package fr.boucles;

public class ExerciceBoucleBase {

	/**
	 * Méthode d'exécution de la classe
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Afficher les chiffres de 1 à 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// Afficher 20 fois mon nom et prénom
		for (int i = 0; i <20; i++) {
			System.out.println("Alison Purdey");
		}
		
		// Afficher les éléments pairs de 2 à 100
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// Afficher les éléments impairs de 1 à 99
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}	
		}
		
	}

}
