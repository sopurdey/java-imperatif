package fr.algorithmie;

public class Rotation {

	/**
	 * Méthode d'exécution de la classe
	 * @param args
	 */
	public static void main(String[] args) {
		// On déclare un tableau d’entiers
		int[] array = {0, 1, 2, 3, 4, 5};
		// Effectuez une rotation à droite des éléments.
		// Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}
		
		int rotatedArray[] = new int[array.length];
		int n = 1;
		
		for(int i = 0; i < n; i++){
			
			int last = array[array.length-1];
			
			for (int j = array.length -1;  j > 0; j--) {
				rotatedArray[j] = array[j-1];
			}
			
			rotatedArray[0] = last;
		}
		
		for (int i = 0; i < rotatedArray.length; i++) {
			System.out.println(rotatedArray[i]);
		}
	
	}

}
