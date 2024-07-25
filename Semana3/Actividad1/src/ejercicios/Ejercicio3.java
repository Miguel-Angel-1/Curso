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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        String palabra = scan.nextLine().toLowerCase();
        System.out.println(palabraEsPalindromo(palabra));
        scan.close();
    }

    public static String palabraEsPalindromo(String palabra){
        String palabraInvertida="";
        for (int i=palabra.length()-1;i>=0;i--) {
        palabraInvertida = palabraInvertida + palabra.charAt(i);
        }
        if (palabra.replaceAll(" ", "").equals(palabraInvertida.replaceAll(" ", ""))) {
            return "Es un palindromo";
        } else {
            return "No es palindromo";
        }
    }
}
