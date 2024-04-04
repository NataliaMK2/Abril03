package com.softtek.presentacion;
import com.softtek.modelo.Ejercicio3;

public class ProbarEjercicio3 {
    public static void main(String[] args) {
        double radioCirculo = 3;
        double baseRectangulo = 4;
        double alturaRectangulo = 3;

        double areaCirculo = Ejercicio3.calcularAreaCirculo(radioCirculo);
        System.out.println("El área del círculo es: " + areaCirculo);

        double areaRectangulo = Ejercicio3.calcularAreaRectangulo(baseRectangulo, alturaRectangulo);
        System.out.println("El área del rectángulo es: " + areaRectangulo);
    }
}


