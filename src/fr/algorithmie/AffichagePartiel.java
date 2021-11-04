package fr.algorithmie;

public class AffichagePartiel {

	/**
	 * Méthode d'exécution de la classe
	 * @param args
	 */
	public static void main(String[] args) {
		// Soit le tableau suivant : 
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		System.out.println("Test 1");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		}
		
		// Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		System.out.println("Test 2");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}

		// Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs
		System.out.println("Test 3");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println("Index : " + i + " / Valeur : " + array[i]);
			}	
		}

		// Combiner une boucle et un test de manière à n’afficher que les entiers impairs
		System.out.println("Test 4");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}
		

	}

}