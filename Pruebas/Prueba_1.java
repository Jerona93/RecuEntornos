package Pruebas;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertNull;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Funciones.Funcion1;

class Prueba_1 {

	static Funcion1 funcion1 = null;
	static int pruebasRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Se estan preparando las Pruebas");
		funcion1 = new Funcion1();
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
		funcion1 = null;
	
	}@Test
	@DisplayName("CAJA NEGRA Equivalentes")
	void Funcion1Prueba1() {
			assertEquals(false, funcion1.funcion1("jesus romero navarro")); 
			// si es menor que nuestra edad sale false
			
	}
		@Test
		@DisplayName("CAJA NEGRA VALORES NULOS")
		void Funcion1Prueba2() {
			assertEquals(null, funcion1.funcion1("2156879")); 
		//si no introducimos strings y metemos numeros saldra NULL;
	
	} 	
		@Test
		@DisplayName("CAJA NEGRA Sin VALOR")
		void Funcion1Prueba3() {
			assertEquals(null,funcion1.funcion1(""));
		//si lo dejamos vacio nos da null
	}
		@Test
		@DisplayName("CAJA NEGRA Limite abajo ")
		void Funcion1Prueba4() {
		assertEquals(true,funcion1.funcion1("hola esto es para probar chocolate de suecia de mi primo antonio"));
	}
		@Test
		@DisplayName("CAJA NEGRA Limite abajo -1 ")
		void Funcion1Prueba5() {
		assertEquals(false,funcion1.funcion1("hola esto es para probar chocolate de suecia de mi primo anuel"));
		//Saldrá q es false ya q no entra
	}
		@Test
		@DisplayName("CAJA BLANCA Condiciones TRUE")
		void Funcion1Prueba6() {
			assertEquals(true,funcion1.funcion1("hola estamos en guadalajara por una reunion de calabazas traidas del estados unidos de america"));
		//Al tener un String mas grande a mi edad se cumple la condicion y nos da  TRUE
	}
		@Test
		@DisplayName("CAJA BLANCA Condiciones FALSE")
		void Funcion1Prueba7() {
			assertEquals(false,funcion1.funcion1("hola esto está bien"));
		//Al tener un String menor a mi eddad se cumple la condicion y sale FALSE
	}
		@Test
		@DisplayName("CAJA BLANCA Decisiones TRUE")
		void Funcion1Prueba8() {
			assertEquals(true,funcion1.funcion1("estan mas aburridos que mi prima rigoberta la que vive al norte de la isla del tesoro"));
	
	}
		@Test
		@DisplayName("CAJA BLANCA Decisiones FALSE")
		
		void Funcion1Prueba9() {
			assertEquals(false,funcion1.funcion1("vamonos que nos vamos"));
		//no sumera mi edad
	}
	
}