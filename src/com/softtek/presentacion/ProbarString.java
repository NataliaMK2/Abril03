package com.softtek.presentacion;

public class ProbarString {
    public static void main(String[] args){
        String frase = "Nunca mates una mosca sobre la cabeza de un tigre.";

        System.out.println("cadena en mayusculas " + frase.toUpperCase());
        System.out.println("cadena en minusculas " + frase.toLowerCase());

        System.out.println(frase.substring(0, "Nunca".length()));

        System.out.println(frase.substring(frase.indexOf("mosca"), frase.indexOf("mosca") + "mosca".length()));

        System.out.println(frase.substring(frase.indexOf("cabeza"), frase.indexOf("cabeza") + "cabeza".length()));

        System.out.println(frase.indexOf('m'));

        System.out.println(frase.length());
    }
}
