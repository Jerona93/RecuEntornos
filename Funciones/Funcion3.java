package Funciones;
public class Funcion3 {
	public static int funcion3(int[] num) {

		int Edad = 26;
		int mitadEdad = (Edad/2);
		int resultado = 0;
		
		for (int x = 0; x < num.length; x++) {

			if (num[x] >= mitadEdad && num[x] <= Edad) {
				resultado +=num[x];
			}

		}
		return resultado;
	}
}