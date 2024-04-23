package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestAlgoritmos {

	@Test
	void sumatorio1() {
		int sumaEsperada = 10;
		int sumaObtenida = Algoritmos.sumatorio(4);
		assertEquals(sumaEsperada, sumaObtenida);
	}
	
	@Test
	void sumatorioParamIncorrecto() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
			() -> Algoritmos.sumatorio(-1));
		
		String esperado = "El número debe ser igual o superior a 0";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado, obtenido);
	}
}
