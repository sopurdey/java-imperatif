package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
		int[] entiersUnADix = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Affichez le premier élément du tableau
		System.out.println(entiersUnADix[0]);
		
		// Affichez la longueur du tableau en utilisant la propriété length
		System.out.println(entiersUnADix.length);
		// Affichez le dernier élément du tableau en utilisant la propriété length
		System.out.println(entiersUnADix[9]);
		// Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.
		entiersUnADix[4] = 8;
		System.out.println(entiersUnADix[4]);

	}

}
