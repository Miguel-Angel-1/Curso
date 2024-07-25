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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        int num = scan.nextInt();
        System.out.println("Raiz cuadrada de "+ num +" es "+ Math.sqrt(num));
        scan.close();
    }
}
