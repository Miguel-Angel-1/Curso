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
public class Ejercicio3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Calcular el indice de masa corporal
        double a,b,indice;
        try (Scanner scan = new Scanner(System.in);){
            System.out.println("Dame tu peso en Kg: ");
            a = scan.nextFloat();
            System.out.println("Dame tu estatura en m: ");
            b = scan.nextFloat();
            indice = a / (b * b);
            System.out.println("Tu IMC es: " + indice);
        }
    }
}
