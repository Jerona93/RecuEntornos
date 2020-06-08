package Funciones;

public class Funcion4 {

	public static String funcion4(int[]califi) {

		int notasSumadas = 0;
		int notasMedia = 0;
		String result = null;
		
		if(califi == null) {
			return null;
		}
			
		for (int c = 0; c < califi.length; c++) {
			notasSumadas = notasSumadas + califi[c];
		}
		
		notasMedia = notasSumadas / califi.length;
		
		if (notasMedia < 5 && notasMedia > 0) {
		result = "insuficiente";
		}
		else if(notasMedia >= 5 && notasMedia < 6) {
		result = "suficiente";
		}
		else if(notasMedia >= 6 && notasMedia < 7) {
		result = "bien";
		}
		else if(notasMedia >= 7 && notasMedia < 9) {
		result = "notable";
		}
		else if(notasMedia >= 9 && notasMedia ==10) {
		result = "sobre";
		}
		
		return result;
	}
}