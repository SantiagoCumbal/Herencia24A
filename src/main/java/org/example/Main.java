package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FigurasGeometricas miFIgura1=new FigurasGeometricas();
        Circulos miFigura2=new Circulos();
        Triangulo miFigura3=new Triangulo();
        Cuadrilateros miFigura4=new Cuadrilateros();


        Circulos miFigura5=new Circulos(3.00);
        Triangulo miFigura6=new Triangulo(6.00,8.00);
        Cuadrilateros miFigura7=new Cuadrilateros(5.00,5.00);
        Cuadrilateros miFigura8=new Cuadrilateros(5.00,10.00);

        miFigura2.setNombre("La pileta del CEC");
        miFigura2.setRadio(4.00);
        System.out.println(miFigura2.getNombre());
        System.out.println("La pileta tendra un radio de: ");
        System.out.println(miFigura2.getRadio());
        System.out.println("y su area sera: ");
        System.out.println((miFigura2.area()));

        miFigura3.setNombre("El triangulo de las bermudas");
        miFigura3.setAltura(5.00);
        miFigura3.setBase(3.00);
        System.out.println(miFigura3.getNombre());
        System.out.println("Su altura es: "+miFigura3.getAltura());
        System.out.println("Su base es: "+miFigura3.getBase());
        System.out.println("Su area es: "+miFigura3.calcularArea());
        System.out.println("Su perimetro es: "+miFigura3.calcularPerimetro());

        miFigura4.setNombre("xd");
        miFigura4.setNum_lados(4);
        miFigura4.setAncho(6);
        miFigura4.setLargo(5);
        System.out.println(miFigura4.getNombre());
        System.out.println("Su numero de lados es:"+miFigura4.getNum_lados());
        System.out.println("Su ancho es:"+miFigura4.getAncho() );
        System.out.println("Su largo es:"+miFigura4.getLargo());
        System.out.println("Su area es: "+miFigura4.calcularArea());
        System.out.println("Su perimetro es: "+miFigura4.calcularPerimetro());

        //como le va


    }
}