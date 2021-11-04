package fr.algorithmie;

public class CalculMoyenne {

	/**
	 * Méthode d'exécution de la classe
	 * @param args
	 */
	public static void main(String[] args) {
		// Soit le tableau suivant : 
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Quelle est la moyenne des éléments du tableau ?
		int total = 0;
		
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		float moyenne = total / array.length;
		
		System.out.println("La moyenne des éléments est : " + moyenne);
	}

}
