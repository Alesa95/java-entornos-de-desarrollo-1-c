package app;

import modelos.Rectangulo;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(2,3);
		
		int area1 = r1.getArea();
		int perimetro2 = r2.getPerimetro();
		
		System.out.println("El área del rectángulo 1 es " + area1);
		System.out.println("El perímetro del rectángulo 2 es " + perimetro2);
	}

}
