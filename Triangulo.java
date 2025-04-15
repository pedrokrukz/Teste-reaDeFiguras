/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ppok3
 */
public class triangulo {
    
}

public class Triangulo {

    private double altura;
    private double base;

    public Triangulo() {
        this(0, 0);
    }

    public Triangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public final void setAltura(double altura) {
        this.altura = altura;
    }

    public final void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return (base * altura) / 2.0;
    }
}

