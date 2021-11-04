package fr.algorithmie;

public class InversionContenu {

	/**
	 * Méthode d'exécution de la classe
	 * @param args
	 */
	public static void main(String[] args) {
		// Soit le tableau suivant : 
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Créer un tableau arrayCopy
		int[] arrayCopy = new int[array.length];
		
		// Copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
		for (int i = array.length -1; i >= 0; i--) {
			arrayCopy[array.length - 1 - i] = array[i];
		}
	
		// Afficher l’ensemble des éléments des 2 tableaux
		for (int i = 0; i < array.length; i++) {
			System.out.println("array : " + array[i] + " / arrayCopy : " + arrayCopy[i]);
		}

	}

}
