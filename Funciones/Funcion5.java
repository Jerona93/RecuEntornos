package Funciones;

public class Funcion5 {


public static int funcion5(String signo,int num1,int num2) {

	int resultado = 0;

	if (signo == "+") {
		resultado = num1 + num2;
	} else if (signo == "-") {
		resultado = num1 - num2;
	} else if (signo == "x") {
		resultado = num1 * num2;
	} else {
		resultado = 0;
	}
	return resultado;
	}
}