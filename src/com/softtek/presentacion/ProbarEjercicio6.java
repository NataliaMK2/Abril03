package com.softtek.presentacion;
import com.softtek.modelo.Ejercicio6;

public class ProbarEjercicio6 {
    public static void main(String[] args) {
        Ejercicio6 alumno = new Ejercicio6("Natalia", 3);
        double[] calificaciones = {85.5, 90.0, 78.3};
        alumno.setParciales(calificaciones);

        alumno.mostrarCalificaciones();
        System.out.println("Promedio: " + alumno.calcularPromedio());
    }
}
