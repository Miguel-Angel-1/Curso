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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Vocales o No Vocales
    try (Scanner scan = new Scanner(System.in)){
        System.out.println("Ingrese una letra (espacio para terminar): ");
        char letra = scan.next().charAt(0);

        while (letra!=' ') {
            if (Character.isLetter(letra)) {
                switch (Character.toLowerCase(letra)) {
                    case 'a', 'e', 'i', 'o', 'u' -> System.out.println(letra +" es una vocal.");
                    default -> System.out.println(letra +" es una consonante.");
                }
            } else {
                System.out.println("Ingrese una letra valida.");
            }
            System.out.println("Ingrese otra letra (espacio para terminar): ");
            letra = scan.next().charAt(0);
        }
    }
        
    }
}
