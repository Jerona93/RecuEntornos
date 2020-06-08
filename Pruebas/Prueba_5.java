package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import Funciones.Funcion5;

class Prueba_5 {

	static Funcion5 funcion5 = null;
	static int pruebasRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Se estan preparando las Pruebas");
		funcion5 = new Funcion5();
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
		funcion5 = null;
	}
		@Test
		@DisplayName("CAJA NEGRA Prueba Valor Vacio")
		void Funcion5P1() {
			assertEquals(0,funcion5.funcion5(" ",45,67));
		//si no le das valor da 0
	}
		@Test
		@DisplayName("CAJA NEGRA Prueba Sin Signo Valido")
		void Funcion5P2() {
			assertEquals(0,funcion5.funcion5("^",23,11));
		//si no le metes un valor valido, devuelve 0
	}
		@Test
		@DisplayName("CAJA NEGRA Prueba Valor Aleatorio")
		void Funcion5P3() {
			assertEquals(280549,funcion5.funcion5("-",6239125,5958576 ));
			//le damos numeros aleatorios y hace la operacion
	}
		@Test
		@DisplayName("CAJA NEGRA Prueba Suma con Signo Valido")
		void Funcion5P4() {
			assertEquals(37, funcion5.funcion5("+", 23, 14));
		
	}
		@Test
		@DisplayName("CAJA BLANCA Prueba Condiciones Multiplicacion")
		void Funcion5P5() {
			assertEquals(3400, funcion5.funcion5("x",34,100));
		//multiplicacion
	}
		@Test
		@DisplayName("CAJA BLANCA Prueba Condiciones Vacio")
		void Funcion5P6() {
			assertEquals(0, funcion5.funcion5("",54,65));
		//si no le pones operador, nos devuelve 0
	}
		@Test
		@DisplayName("CAJA BLANCA Prueba Condiciones Signo")
		void Funcion5P7() {
			assertEquals(0, funcion5.funcion5("@",21, 54));
		//Al meter un operador no valido devuelve 0
	}
		@Test
		@DisplayName("CAJA BLANCA Prueba Decision Negativo")
		void Funcion5P8() {
			assertEquals(-21, funcion5.funcion5("-",23, 44));
		//resultado en negativo
	}
		
}


