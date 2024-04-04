package com.softtek.modelo;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    private int resultado;
    private Scanner scanner;

    public Ejercicio7() {
        scanner = new Scanner(System.in);
        do {
            lanzar();
            System.out.print("Quiere continuar S/N: ");
        } while (scanner.next().equalsIgnoreCase("S"));
        scanner.close();
    }

    public void lanzar() {
        Random random = new Random();
        resultado = random.nextInt(6) + 1;
        dibujar(resultado);
    }

    public void dibujar(int numero) {
        System.out.println(" ------- ");
        switch (numero) {
            case 1:
                System.out.println("|       |");
                System.out.println("|   *   |");
                System.out.println("|       |");
                break;
            case 2:
                System.out.println("| *     |");
                System.out.println("|       |");
                System.out.println("|     * |");
                break;
            case 3:
                System.out.println("| *     |");
                System.out.println("|   *   |");
                System.out.println("|     * |");
                break;
            case 4:
                System.out.println("| *   * |");
                System.out.println("|       |");
                System.out.println("| *   * |");
                break;
            case 5:
                System.out.println("| *   * |");
                System.out.println("|   *   |");
                System.out.println("| *   * |");
                break;
            case 6:
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                System.out.println("| *   * |");
                break;
            default:
                System.out.println("Número no valido");
        }
        System.out.println(" ------- ");
    }


}
