package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {

		byte b = 8;	
		short sh = 32000;		
		int i = 20000000;		
		long l = 123_000_000_000L;		
		float f = 2.5F;		
		double d = 6.77D;		
		char c = '\u0E06';		
		boolean bool = true;		
		String str = "Hello World";
		
		int test = 057;

		System.out.println(b);
		System.out.println(sh);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);
		System.out.println(str);
		System.out.println(test);
		
		String randomString = "Voici le résultat d'un calcul : \n1+5=6";
		
		System.out.println(randomString);
	}

}
