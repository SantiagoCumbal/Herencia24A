package org.example;

public class Triangulo extends FigurasGeometricas {
    double base;
    double altura;
    public Triangulo(double base, double altura){}
    public Triangulo() {}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularArea(){
        return base*altura;
    }
    public double calcularPerimetro(){
        return 2*base*altura;
    }
}
