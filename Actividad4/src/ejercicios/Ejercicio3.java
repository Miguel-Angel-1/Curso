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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Contar letras 'a' en una palabra
        int cont=0;
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Dame una palabra: ");
            String palabra = scan.nextLine().toLowerCase();
            for (int i=0;i<palabra.length();i++){
                if(palabra.charAt(i)=='a'){
                    cont +=1;
                }
            }
            System.out.println("Tu palabra tiene "+ cont +" letras a");
        }
    
    }
}