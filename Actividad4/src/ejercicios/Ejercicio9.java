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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculadora Básica con Menú
        boolean continuar = true;
        try (Scanner scan = new Scanner(System.in);){
            while (continuar) { 
                System.out.println("Calculadora Básica:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scan.nextInt();
                if (opcion==5) {
                    break;
                }
                System.out.print("Ingrese el primer número: ");
                double num1 = scan.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scan.nextDouble();
                switch (opcion) {
                    case 1 -> {System.out.println("Resultado: "+ (num1 + num2));}
                    case 2 -> {System.out.println("Resultado: "+ (num1 - num2));}
                    case 3 -> {System.out.println("Resultado: "+ (num1 * num2));}
                    case 4 -> {if (num2 != 0) {System.out.println("Resultado: "+ (num1 / num2));} else {System.out.println("Error: División por cero.");}}
                    default -> {System.out.println("Opción no válida.");}
                }
                System.out.print("¿Desea realizar otra operación? (si/no): ");
                continuar = scan.next().equalsIgnoreCase("si");
            }
        }
    }
}