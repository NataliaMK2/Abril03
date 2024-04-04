package com.softtek.modelo;

public class Ejercicio6 {
    private String nombreCompleto;
    private double[] parciales;

    public Ejercicio6(String nombreCompleto, int numParciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new double[numParciales];
    }

    public void setParciales(double[] parciales) {
        this.parciales = parciales;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double parcial : parciales) {
            suma += parcial;
        }
        return suma / parciales.length;
    }

    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de los parciales para " + nombreCompleto + ":");
        for (int i = 0; i < parciales.length; i++) {
            System.out.println("Parcial " + (i + 1) + ": " + parciales[i]);
        }
    }


}
