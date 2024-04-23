package util;

public abstract class Algoritmos {

	/**
	 * Devuelve el sumatorio del numero especificado
	 * 
	 * @param numero	el numero del que queremos calcular el sumatorio
	 * @return			el sumatorio del numero especificado
	 * @throws IllegalArgumentException		
	 */
	public static int sumatorio(int numero) {
		if(numero < 0) {
			throw new IllegalArgumentException("El número debe ser igual o superior a 0");
		}
		
		int suma = 0;
		
		for(int i = 1; i <= numero; i++) {
			suma += i;
		}
		
		return suma;
	}
}
