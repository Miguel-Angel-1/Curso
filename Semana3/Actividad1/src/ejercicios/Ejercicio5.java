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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba una palabra: ");
        String palabra = scan.nextLine();
        System.out.println("Su palabra es "+ palabra);
        System.out.print("Desea cambiar alguna letra de su palabra?(Si/No):");
        String opcion = scan.nextLine().toLowerCase();
        if (opcion.equals("si")){
            System.out.print("Ingrese letra a cambiar: ");
            String letra1 = scan.next();
            char letraAntigua = letra1.charAt(0);
            System.out.print("Ingrese la nueva letra: ");
            String letra2 = scan.next();
            char letraNueva = letra2.charAt(0);
            System.out.print("Su nueva palabra es "+ palabra.replace(letraAntigua, letraNueva));
        } else if (!opcion.equals("no")){
            System.out.print("Por favor, ingrese si o no");
        } else {
            System.out.print("Su palabra es "+ palabra);
        }
        scan.close();
    }
}
