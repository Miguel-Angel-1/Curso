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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Contador de Números Impares
        try (Scanner scan = new Scanner(System.in);){
            System.out.print("Ingrese un número entero positivo: ");
            int num = scan.nextInt();
            int i=1;
            System.out.println("Números impares desde 1 hasta "+ num +":");
            
            do {
                if (i%2!=0) {
                    System.out.println(i);
                }
                i++;
            } while (i<=num);
        }
    }
}
