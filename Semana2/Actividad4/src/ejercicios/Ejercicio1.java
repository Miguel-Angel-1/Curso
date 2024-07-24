/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.*;

/**
 *
 * @author raul
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Factorial de un numero
        int num, fact=1;
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Dame un numero: ");
            num = scan.nextInt();
            for (int i=1; i<=num;i++) {
                fact *= i;
            }
            System.out.println("El factorial de "+ num +" es "+ fact);
        }
    }
    
}
