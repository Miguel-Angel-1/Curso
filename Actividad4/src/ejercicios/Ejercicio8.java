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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calcular la Media de Números Positivos
        double suma=0;
        int cant=0;
        double num;
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Ingrese numeros positivos para calcular la media (ingrese un numero negativo para terminar):");
            while (true) {
                num = scan.nextDouble();
                if (num<0) {
                    break;
                }
                suma+=num;
                cant++;
            }
            if (cant>0) {
                double media = suma / cant;
                System.out.println("La media de los numeros positivos ingresados es: "+ media);
            } else {
                System.out.println("No se ingresaron numeros positivos.");
            }
        }
    }
}
