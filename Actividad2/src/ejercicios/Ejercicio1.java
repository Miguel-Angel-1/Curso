/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author raul
 */
import java.util.*;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Calcular el area de un rectangulo 
        double a,b,area;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame el largo del rectangulo: ");
        a = scan.nextFloat();
        System.out.println("Dame el ancho del rectangulo: ");
        b = scan.nextFloat();
        area = a * b;
        System.out.println("El area del rectangulo es: " + area);
        scan.close();
    }
    
}
