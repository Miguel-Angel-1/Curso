/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        int suma=0;
        
        for (int i=0; i<5; i++){
            System.out.print("Ingresa un numero: ");
            array[i] = scan.nextInt();
        }
        for (int i=0; i<=5; i++){
            suma += array[i];
        }
        System.out.println(suma);
        scan.close();
    }
}
