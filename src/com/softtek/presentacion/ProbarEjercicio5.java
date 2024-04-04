package com.softtek.presentacion;
import com.softtek.modelo.Ejercicio5;

public class ProbarEjercicio5 {
    public static void main(String[] args) {
        Ejercicio5 tabla2 = new Ejercicio5(2);
        System.out.println("Tabla de multiplicar del " + tabla2.numero + ":");
        System.out.println(tabla2.generarTabla());
    }
}
