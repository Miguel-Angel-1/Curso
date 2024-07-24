/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author raul
 */
import java.util.*;
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculadora de Calificaciones Finales
        double a,b,c,calFinal;
        try (Scanner scan = new Scanner(System.in);) {
            System.out.println("Dame la calificacion de los parciales (0-100): ");
            a = scan.nextDouble();
            System.out.println("Dame la calificacion del proyecto (0-100): ");
            b = scan.nextDouble();
            System.out.println("Dame la calificacion del examen final (0-100): ");
            c = scan.nextDouble();
            if (a>=0 && a<=100 && b>=0 && b<=100 && c>=0 && c<=100) {
                calFinal = (a * .4) + (b *.3) + (c * .3);
                System.out.println("La calificacion final es: " + calFinal);
            } else {
                System.out.println("La calificacion debe entrar en el rango de 0-100");
            }
        }
    }
}
