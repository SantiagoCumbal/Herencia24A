package org.example;

public class Eneagono extends FigurasGeometricas{
    double med_lado;
    double apotema;
    public Eneagono(){}
    public Eneagono(String nombre, int num_lados, double apotema, double med_lado){
        super(nombre,num_lados);
        this.apotema = apotema;
        this.med_lado = med_lado;
    }

    public double getMed_lado() {
        return med_lado;
    }

    public void setMed_lado(double med_lado) {
        this.med_lado = med_lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

}
