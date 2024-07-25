/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.*;

/**
 *
 * @author raul
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba una palabra(Ingrese un espacio para terminar): ");
        String palabra = scan.nextLine();
        while (!palabra.equals(" ")){
            System.out.println("Escriba una palabra(Escriba un espacio para terminar): ");
            palabra = scan.nextLine();
            System.out.println("Palabra ingresada: "+ palabra.toUpperCase());
        }
        scan.close();
    }    
}
