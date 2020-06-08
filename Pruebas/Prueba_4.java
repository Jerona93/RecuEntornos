package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


import Funciones.Funcion4;

class Prueba_4 {

	static Funcion4 funcion4 = null;
	static int pruebasRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Se estan preparando las Pruebas");
		funcion4 = new Funcion4();
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
		funcion4 = null;
	}
		@Test
		@DisplayName("CAJA NEGRA Valor Nulo")
		void Funcion4P1() {
				assertEquals(null,funcion4.funcion4(null));
		//Si le das null, sale null
	}
		@DisplayName("CAJA NEGRA Muchos Valores")
		@Test
		void Funcion4P2() {
			assertNotEquals("suficiente",funcion4.funcion4(new int[]{3,2,2,2,8})); 
		//notas del segundo trimestre y saca la media
	}
		@Test
		@DisplayName("CAJA NEGRA Limite Inferior")
		void Funcion4P4() {
			assertEquals("insuficiente",funcion4.funcion4(new int[] {0,1,2,3}));
		//Los valores deben estar entre 0 y 4
	}
		@Test
		@DisplayName("CAJA NEGRA Un Solo Valor")
		void Funcion4P3() {
			assertNotEquals("Suficiente",funcion4.funcion4(new int[]{5})); 
		
	}
		
		@Test
		@DisplayName("CAJA BLANCA Decisiones Negativos")
		void Funcion4P5() {
			assertEquals(null, funcion4.funcion4(new int[] {-3,-8,-4,-8,-1,-5}));
		//Si le damos valores negativos sale null
	}
		@Test
		@DisplayName("CAJA BLANCA Decisiones Media Bien")
		void Funcion4P6() {
			assertEquals("bien",funcion4.funcion4(new int[] {6,6,7,6,6,7}));
		// si le damos todos los  valores de notable, sale notable
	}
		@Test
		@DisplayName("CAJA BLANCA Condiciones Insuficiente)")
		void Funcion4P7() {
			assertEquals("insuficiente",funcion4.funcion4(new int[] {2,3,1,5,4,3}));
		//comprobamos que funciona y condicion de media
	}
		@Test
		@DisplayName("CAJA BLANCA Decisiones Notas")
		void Funcion4P8() {
			assertEquals("insuficiente",funcion4.funcion4(new int[] {3,2,2,2,8}));
		//media notas 2T
	}

}



