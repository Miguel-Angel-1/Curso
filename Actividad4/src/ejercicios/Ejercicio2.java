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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Conteo de numeros
        int num,n,mayor=0,menor=0,igual=0;
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Ingresa la cantidad de numeros que va a ingresar: ");
            num = scan.nextInt();
            for (int i=0;i<num; i++) {
                System.out.println("Dame un numero: ");
                n = scan.nextInt();
                if (n>0){
                    mayor++;
                } else if (n<0) {
                    menor++;
                } else {
                    igual++;
                }
            }
            System.out.println("Numeros mayores a 0: "+ mayor);
            System.out.println("Numeros menores a 0: "+ menor);
            System.out.println("Numeros iguales a 0: "+ igual);
        }
    }
}
