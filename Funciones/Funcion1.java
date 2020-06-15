package Funciones;
//funcion 1
public class Funcion1 {
	public static Boolean funcion1(String palabra1) {

		int edad = 26;
		int contador = 0;

		Boolean resultado = null;

		for (int x = 0; x < palabra1.length(); x++) {
			if ((palabra1.charAt(x) == 'a') || ((palabra1.charAt(x) == 'e')) || ((palabra1.charAt(x) == 'i'))
					|| ((palabra1.charAt(x) == 'o')) || ((palabra1.charAt(x) == 'u'))) {
				contador++;

				if (contador >= edad) {
					resultado = true;
				} else { // SUSTITUIDO//
					resultado = false; 
				}
			}
		}

		return resultado;

	}
}
