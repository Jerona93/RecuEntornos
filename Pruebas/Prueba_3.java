package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import Funciones.Funcion3;

class Prueba_3 {

	static Funcion3 funcion3 = null;
	static int pruebasRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Se estan preparando las Pruebas");
		funcion3 = new Funcion3();
	}
	
	@BeforeEach
	private void ejecutarPruebas() {
		pruebasRealizadas++;
		System.out.println("Ejecutando el Test" + pruebasRealizadas);
	}
	
	@AfterEach
	private void terminadaPruebas() {
		System.out.println("Se acaba de ejecutae el Test:  " + pruebasRealizadas);
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Ya se han realizado TODAS las PRUEBAS ");
		funcion3 = null;
	}
		@Test
		@DisplayName("CAJA NEGRA Prueba Limite Inferior")
		void Funcion3P1() {
			assertEquals(13, funcion3.funcion3(new int[] {13,8,9,10,5}));
		
	}
		@Test
		@DisplayName("CAJA NEGRA Prueba Limite Superior")
		void Funcion3P2() {
			assertEquals(26, funcion3.funcion3(new int[] {26,28,52,64,75}));
		//Solo cuenta el 26 porque esta en el limite
	}
		@Test
		@DisplayName("CAJA NEGRA Prueba Valor Cero")
		void Funcion3P3() {
			assertEquals(0, funcion3.funcion3(new int[] {0,0,0,0,0}));
		//Al darle valores 0 nos devuelve 0
	}
		@Test
		@DisplayName("CAJA NEGRA Prueba De Comprobacion")
		void Funcion3P4() {
			assertEquals(117, funcion3.funcion3(new int[] {26,23,19,25,24}));
		//Comprobación
	}
		@Test
		@DisplayName("CAJA BLANCA Prueba Condiciones Fuera del Rango")
		void Funcion3P5() {
			assertEquals(16, funcion3.funcion3(new int[] {16,1,4,27,33}));
		//los valores que se salgan del rango no se suman
	}
		@Test
		@DisplayName("CAJA BLANCA Prueba Decisiones Cero")
		void Funcion3P6() {
			assertEquals(0, funcion3.funcion3(new int[] {3,6,33,75,27}));
		//numeros fuera de rango, fuera
	}
		@Test
		@DisplayName("CAJA BLANCA Prueba Condiciones Negativos")
		void Funcion3P7() {
			assertEquals(0, funcion3.funcion3(new int[] {-23,-32,-56,-3,-45}));
			//numeros fuera de rango, fuera
	}
		@Test
		@DisplayName("CAJA BLANCA Prueba Decisiones ")
		void Funcion3P8() {
			assertEquals(95, funcion3.funcion3(new int[] {21,19,24,13,18}));
		//deberia devolver la suma de los numeros dentro de mi rango
		}
}



