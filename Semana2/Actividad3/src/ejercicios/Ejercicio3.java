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
        // Evaluacion de Calificaciones con Letras
        int cal;
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Ingrese su calificacion (0-100): ");
            cal = scan.nextInt();
            char [] letra = {'A','B','C','D','F'};
            if (cal>=90 && cal<=100) {
                System.out.println("Tu calificacion de "+ cal +" se le asigna la letra "+ letra[0]);
            } else if (cal>=80 && cal<=89) {
                System.out.println("Tu calificacion de "+ cal +" se le asigna la letra "+ letra[1]);
            } else if (cal>=70 && cal<=79) {
                System.out.println("Tu calificacion de "+ cal +" se le asigna la letra "+ letra[2]);
            } else if (cal>=60 && cal<=69) {
                System.out.println("Tu calificacion de "+ cal +" se le asigna la letra "+ letra[3]);
            } else if (cal<=59) {
                System.out.println("Tu calificacion de "+ cal +" se le asigna la letra "+ letra[4]);
            } else{
                System.out.println("Tu calificacion de "+ cal +" no se le asigna una letra letra por no entrar en el rango de 0-100");
            }
        }
    }
}
