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
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Verificar edad para votar
        int edad;
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Ingrese su edad: ");
            edad = scan.nextInt();
            if (edad>=18) {
                System.out.println("La persona puede votar");
            } else {
                System.out.println("La persona no puede votar");
            }    
        }
    }
}
