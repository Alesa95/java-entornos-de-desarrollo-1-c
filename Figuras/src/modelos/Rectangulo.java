package modelos;

import java.util.*;

public class Rectangulo {

    private int base;
    private int altura;

    /**
     * Constructor por defecto. La base y la altura valdrán 1.
     */
    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }

    /**
     * Constructor que recibe la base y la altura
     * @param base 
     * @param altura
     */
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Devuelve el área del rectángulo según la fórmula area = base * altura.
     * @return
     */
    public int getArea() {
        return this.base * this.altura;
    }

    /**
     * Devuelve el perímetro del rectángulo según la fórmula perimetro = 2*base + 2*altura.
     * @return
     */
    public int getPerimetro() {
        return 2*this.base + 2*this.altura;
    }

    /**
     * @return
     */
    public int getBase() {
        return this.base;
    }

    /**
     * @return
     */
    public int getAltura() {
        return this.altura;
    }

    /**
     * @param base
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

}