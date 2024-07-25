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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = scan.nextInt();
        int mcd = calcularMCD(num1, num2);
        System.out.println("El muximo comun divisor de "+ num1 +" y "+ num2 +" es: "+ mcd);
        scan.close();
    }
    
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temporal = b;
            b = a%b;
            a = temporal;
        }
        return a;
    }
}
