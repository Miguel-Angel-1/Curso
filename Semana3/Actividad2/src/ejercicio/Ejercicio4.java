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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese un numero: ");
            array[i] = scan.nextInt();
        }

        System.out.print("Array normal: ");
        for (int i=0;i<6;i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();

        for (int i=0;i<array.length/2;i++) {
            int temporal = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temporal;
        }

        System.out.print("Array invertido: ");
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] +" ");
        }
        scan.close();
    }
}
