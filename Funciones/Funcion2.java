package Funciones;
public class Funcion2 {

public static Boolean funcion2(String palabra1, String palabra2 ) {

		int consonante1 = 0;
		for (int x = 0; x < palabra1.length(); x++) {
			char letra = palabra1.charAt(x);
			if (consonante(letra)) {
				consonante1++;
			}
		}
		int consonante2 = 0;
		for (int x = 0; x < palabra2.length(); x++) {
			char letra = palabra2.charAt(x);
			if (consonante(letra)) {
				consonante2++;
			}
		}
		if (consonante1 > consonante2) {
			return true;
		} else if (consonante1 < consonante2) {
			return false;
		} else {
			return null;
		}
	}


private static boolean consonante(char letra) {
	return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
	}
}