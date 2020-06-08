package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertNull;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Funciones.Funcion2;

class Prueba_2 {

	static Funcion2 funcion2 = null;
	static int pruebasRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Se estan preparando las Pruebas");
		funcion2 = new Funcion2();
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
		funcion2 = null;
	}
		@Test
		@DisplayName("CAJA NEGRA Valor Nulo")
		void Funcion2P1() {
			assertEquals(null,funcion2.funcion2("nariz","bolas")); 
		// las dos tienen las mismas consonantes
	}
		@Test
		@DisplayName("CAJA NEGRA Equivalente 1aMayor")
		void Funcion2P2() {
			assertEquals(true,funcion2.funcion2("navarro","romero"));
		//la primera tiene mas que la 2
	}
		@Test
		@DisplayName("CAJA NEGRA Equivalente 2aMayor")
		void Funcion2P3() {
			assertEquals(false,funcion2.funcion2("jesus","romeroNavarro"));
		//la segunda tiene mas por eso false
	}
		@Test
		@DisplayName("CAJA NEGRA Prueba Valor Vacio")
		void Funcion2P4() {
			assertEquals(null,funcion2.funcion2("",""));
		//si no le pones nada, null
	}
		@Test
		@DisplayName("CAJA BLANCA Camino 1")
		void Funcion2P5() {
			assertEquals(null, funcion2.funcion2("betis","betis"));
		//el mismo numero consonantes
	}
		@Test
		@DisplayName("CAJA BLANCA Camino 2")
		void Funcion2P6() {
			assertEquals(false, funcion2.funcion2("romero","navarro"));
		//la segunda mas que la primera
	}
		@Test
		@DisplayName("CAJA BLANCA Camino 3")
		void Funcion2P7() {
			assertEquals(true, funcion2.funcion2("arbol","buho"));
		//dice si la primera tiene mas consonantes que la segunda
	}
		@Test
		@DisplayName("CAJA BLANCA Condicion")
		void Funcion2P8() {
			assertEquals(true,funcion2.funcion2("conspira", "sol"));
		//nos da la primera palabra por tener mas consonantes

	}

}
