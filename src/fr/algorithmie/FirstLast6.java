package fr.algorithmie;

public class FirstLast6 {

	/**
	 * Méthode d'exécution de la classe
	 * @param args
	 */
	public static void main(String[] args) {
		// On déclare un tableau d’entiers
		int[] array = {1, 6, 4, 10, 0};
		
		// On calcule une valeur booléenne qui contrôle le tableau de la sorte :
			// elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
			// elle vaut false dans les autres cas
			// écrire l’algo de valorisation de cette variable avec le minimum de lignes
		
		if (array.length >= 1) {
			if (array[0] == 6 || array[array.length-1] == 6) {
				boolean result = true;
				System.out.println(result);
			} else {
				boolean result = false;
				System.out.println(result);
			}
			
		}

	}

}
