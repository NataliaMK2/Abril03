package com.softtek.modelo;

public class Ejercicio5 {
    public int numero;

    public Ejercicio5(int numero) {
        this.numero = numero;
    }

    public String generarTabla() {
        StringBuilder tabla = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            tabla.append(numero).append(" x ").append(i).append(" = ").append(numero * i);
            tabla.append("\n");
        }
        return tabla.toString();
    }

}
