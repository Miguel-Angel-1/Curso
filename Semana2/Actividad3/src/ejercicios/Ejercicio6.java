/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Ejercicio6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Convertidor de grados
        double gradosCe, res;
        String op,unidad;
        String [] gr = {"°F", "K"};

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Ingrese el valor en grados Celsius: ");
            gradosCe = scan.nextDouble();
            scan.nextLine(); // Consumir el salto de línea
            System.out.println("¿A qué grados los desea convertir?");
            System.out.println("Escriba a qué grados lo convertirá (Fahrenheit o Kelvin): ");
            op = scan.nextLine().toLowerCase();
            switch (op) {
                case "fahrenheit" -> {
                    res = (gradosCe * 9 / 5) + 32;
                    unidad = gr[0];
                }
                case "kelvin" -> {
                    res = gradosCe + 273.15;
                    unidad = gr[1];
                }
                default -> {
                    System.out.println("Opción no válida");
                    return;
                }
            }
            System.out.println("Los " + gradosCe + "°C se convierten a "+ res + unidad);
        }
    }
}
