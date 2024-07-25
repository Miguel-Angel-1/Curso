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
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = scan.nextInt();
        
        boolean Primo = numeroPrimo(numero);
        
        if (Primo) {
            System.out.println("El numero "+ numero +" es primo.");
        } else {
            System.out.println("El numero "+ numero +" no es primo.");
        }
        scan.close();
    }
    
    public static boolean numeroPrimo(int numero) {
        if (numero<=1) {
            return false;
        }
        for (int i=2;i<=Math.sqrt(numero);i++) {
            if (numero%i==0) {
                return false;
            }
        }
        return true;
    }
    
}
