package fr.algorithmie;

public class RechercheMin {

	/**
	 * Méthode d'exécution de la classe
	 * @param args
	 */
	public static void main(String[] args) {
		// Soit le tableau suivant : 
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Rechercher le plus petit élément du tableau
		int min = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Le plus petit élément est : " + min);	
	}

}
