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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[8];
        
        for (int i=0;i<8; i++) {
            System.out.print("Ingrese un numero: ");
            array[i] = scan.nextInt();
        }

        int Mayor = array[0];
        int Menor = array[0];

        for (int i=1;i<array.length;i++) {
            Mayor = Math.max(Mayor, array[i]);
            Menor = Math.min(Menor, array[i]);
        }

        System.out.println("El numero mayor es: "+ Mayor);
        System.out.println("El numero menor es: "+ Menor);
        scan.close();
    }
}
