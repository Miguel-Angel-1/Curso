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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Generar Secuencia de Cuadrados
        try (Scanner scan = new Scanner(System.in);){
            System.out.print("Ingrese un número entero positivo: ");
            int num = scan.nextInt();
            int i=1;
            System.out.println("Cuadrados de los números desde 1 hasta "+ num +":");
            do {
                System.out.println("El cuadrado de "+ i +" es "+ (i*i));
                i++;
            } while (i<=num);
        }
        
    }
}
