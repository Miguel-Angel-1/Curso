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
        // TODO code application logic here

        // Calcular el promedio de 3 numeros
        int a,b,c,promedio;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame el numero 1: ");
        a = scan.nextInt();
        System.out.println("Dame el numero 2: ");
        b = scan.nextInt();
        System.out.println("Dame el numero 3: ");
        c = scan.nextInt();
        promedio = (a+b+c)/3;
        System.out.println("El promedio de los 3 numeros es: " + promedio);
        scan.close();
    }
    
}
