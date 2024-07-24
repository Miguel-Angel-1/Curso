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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generar una Secuencia Aritmética
        try (Scanner scan = new Scanner(System.in);){
            System.out.print("Ingrese el primer numero de la secuencia: ");
            int primNumero = scan.nextInt();
            System.out.print("Ingrese la diferencia entre los números: ");
            int dif = scan.nextInt();
            System.out.print("Ingrese el numero máximo hasta el cual la secuencia debe continuar: ");
            int max = scan.nextInt();
            int numActual = primNumero;
            System.out.println("Secuencia Aritmética:");
            do {
                System.out.println(numActual);
                numActual+=dif;
            } while (numActual<=max);
        }
        
    }
}
