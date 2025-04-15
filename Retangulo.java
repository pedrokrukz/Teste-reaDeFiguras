/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ppok3
 */
public class retangulo {
    

package Retangulo;

public class Retangulo {

    private double altura;
    private double base;

    public Retangulo() {
        this(0, 0);
    }

    public Retangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public final void setAltura(double altura) {
        this.altura = altura;
    }

    public final void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getArea() {
        return base * altura;
    }

    // Opcional:
    public double getPerimetro() {
        return 2 * (base + altura);
    }
}
}
