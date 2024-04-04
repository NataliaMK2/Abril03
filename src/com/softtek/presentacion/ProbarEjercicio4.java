package com.softtek.presentacion;
import com.softtek.modelo.Ejercicio4;

public class ProbarEjercicio4 {
    public static void main (String[] args){
        Ejercicio4 instancia = new Ejercicio4(5);
        instancia.incrementar();
        System.out.println(instancia.muestra());
    }
}
