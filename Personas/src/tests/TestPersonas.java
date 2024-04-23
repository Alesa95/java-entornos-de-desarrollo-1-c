package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Persona;

class TestPersonas {

	/**
	 * Comprueba que una persona de 0 anhos se muestra como menor de edad
	 */
	@Test
	void testPersonaEdad0 () {
		Persona p = new Persona ("nombre", "apellidos", 0);
		String esperado = "Menor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Comprueba que una persona de 17 anhos se muestra como menor de edad
	 */
	@Test
	void testPersonaEdad17 () {
		Persona p = new Persona ("nombre", "apellidos", 17);
		String esperado = "Menor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Comprueba que una persona de 18 anhos se muestra como mayor de edad
	 */
	@Test
	void testPersona18 () {
		Persona p = new Persona ("nombre", "apellidos", 18);
		String esperado = "Mayor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Comprueba que al intentar instanciarse una persona con edad negativa se lanza
	 * la excepcion esperada
	 */
	@Test
	void testPersonaEdadInvalidaMenos1 () {
		Exception excepcion = assertThrows(IllegalArgumentException.class,
			() -> new Persona("nombre", "apellidos", -1));
		
		String esperado = "La edad debe estar entre 0 y 130";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado, obtenido);
	}
}
