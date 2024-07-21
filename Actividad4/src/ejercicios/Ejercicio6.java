/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;
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
        // Adivinar el Número
        Random rand = new Random();
        int numAleatorio = rand.nextInt(100) + 1;
        int intento;
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Adivina el numero entre 1 y 100:");
            do {
                System.out.print("Introduce tu suposición: ");
                intento = scan.nextInt();
                
                if (intento>numAleatorio) {
                    System.out.println("Demasiado alto. Intenta de nuevo.");
                } else if (intento<numAleatorio) {
                    System.out.println("Demasiado bajo. Intenta de nuevo.");
                }
                
            } while (intento!=numAleatorio);
            
            System.out.println("¡Correcto! El numero era "+ numAleatorio);
        }
    }
}
