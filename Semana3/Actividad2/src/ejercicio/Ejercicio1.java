/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int par=0,impar=0;
        for (int i=0; i<10; i++){
            System.out.print("Ingresa un numero: ");
            array[i] = scan.nextInt();
        }
        for (int i=0; i<10; i++){
            if (array[i]%2==0){
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Cantidad de numeros pares: "+ par);
        System.out.println("Cantidad de numeros impares: "+ impar);
        scan.close();
    }
    
}
