package org.example;

public class Circulos extends FigurasGeometricas{
    double radio;
    public Circulos(double radio){}
    public Circulos(){}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area(){
        return Math.PI * radio * radio;
    }
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
}
