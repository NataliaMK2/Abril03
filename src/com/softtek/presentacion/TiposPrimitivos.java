package com.softtek.presentacion;

public class TiposPrimitivos {
    public static void main (String[] args){
        double lado = 6;
        double area =lado * lado;
        System.out.println("area" + area);

        double radio = 3;
        double areaCirculo = Math.PI * radio * radio ;
        System.out.println("area" + areaCirculo);


        double base= 4;
        double altura= 3;
        double perimetro= 2 * (base + altura);
        System.out.println("perimetro" + perimetro);


    }
}
