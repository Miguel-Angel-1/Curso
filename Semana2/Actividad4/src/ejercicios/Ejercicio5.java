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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Contador de Dígitos
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Ingrese un numero entero: ");
            int num = scan.nextInt();
            String numStr = Integer.toString(Math.abs(num));
            int cantDigitos = numStr.length();
            System.out.println("El numero "+ num +" tiene "+ cantDigitos +" digitos");
        }
    }
    
}
