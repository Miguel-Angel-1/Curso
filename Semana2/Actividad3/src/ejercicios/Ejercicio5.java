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
        // Determinar la estación del año
        int est;
        String [] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        String [] estaciones = {"Primavera","Verano","Otoño","Invierno"};
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Ingrese un número correspondiente al mes (1-12): ");
            est = scan.nextInt();

            if (est < 1 || est > 12) {
                System.out.println("Opción no válida, ingrese un numero entre 1 y 12.");
            } else {
                String mes = meses[est - 1];
                String estacion = "";

                switch (est) {
                    case 1, 2, 12 -> estacion = estaciones[3];
                    case 3, 4, 5 -> estacion = estaciones[0];
                    case 6, 7, 8 -> estacion = estaciones[1];
                    case 9, 10, 11 -> estacion = estaciones[2];
                }
                System.out.println("El mes indicado es "+ mes +" y la estación es "+ estacion);
            }
        }
    }
}
