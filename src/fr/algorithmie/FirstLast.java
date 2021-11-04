package fr.algorithmie;

public class FirstLast {

	/**
	 * Méthode d'exécution de la classe
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {1, 6, 4, 10, 6, 1};
		// On calcule une valeur booléenne qui contrôle le tableau de la sorte :
			// elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeur
			// elle vaut false dans les autres cas
			// écrire l’algo de valorisation de cette variable avec le minimum de ligne
		int lastIndex = array.length-1;
		
		
		if (array.length >= 1 && array[0] == array[array.length-1]) {
			boolean result = true;
			System.out.println(result);
		} else {
			boolean result = false;
			System.out.println(result);
		}
	}

}
