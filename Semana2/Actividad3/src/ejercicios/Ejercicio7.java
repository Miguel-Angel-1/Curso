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
public class Ejercicio7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Conversor de monedas
        double tasaUSD = 18.6;
        double tasaEUR = 19.61;
        double tasaTHB = 0.50;
        double tasaJPY = 0.11;
        double tasaKRW = 0.013;
        double tasaAUD = 12.07;
        double tasaPEN = 4.83;
        double tasaCAD = 13.12;
        double tasaVES = 15709.24;
        double tasaARS = 0.020;

        String[] monedas = {"Dolares(USD)", "Euro(EUR)", "Bath(THB)", "Yen(JPY)", "Won(KRW)", "Dolar Australiano(AUD)", "Sol(PEN)", "Dolar Canadiense(CAD)", "Bolivar(VES)", "Peso Argentino(ARS)"};

        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Ingrese la cantidad en pesos mexicanos (MXN): ");
            double pesos = scanner.nextDouble();

            System.out.println("Seleccione la moneda a la que desea convertir:");
            for (int i = 0; i < monedas.length; i++) {
                System.out.println((i + 1) + ". " + monedas[i]);
            }
            int opcion = scanner.nextInt();

            double resultado;
            String monedaSeleccionada;

            switch (opcion) {
                case 1 -> {
                    resultado = pesos * tasaUSD;
                    monedaSeleccionada = "USD";
                }
                case 2 -> {
                    resultado = pesos * tasaEUR;
                    monedaSeleccionada = "EUR";
                }
                case 3 -> {
                    resultado = pesos * tasaTHB;
                    monedaSeleccionada = "THB";
                    }
                case 4 -> {
                    resultado = pesos * tasaJPY;
                    monedaSeleccionada = "JPY";
                }
                case 5 -> {
                    resultado = pesos * tasaKRW;
                    monedaSeleccionada = "KRW";
                }
                case 6 -> {
                    resultado = pesos * tasaAUD;
                    monedaSeleccionada = "AUD";
                }
                case 7 -> {
                    resultado = pesos * tasaPEN;
                    monedaSeleccionada = "PEN";
                }
                case 8 -> {
                    resultado = pesos * tasaCAD;
                    monedaSeleccionada = "CAD";
                }
                case 9 -> {
                    resultado = pesos * tasaVES;
                    monedaSeleccionada = "VES";
                }
                case 10 -> {
                    resultado = pesos * tasaARS;
                    monedaSeleccionada = "ARS";
                }
                default -> {
                    System.out.println("Opción no válida");
                    return;
                }
            }
            System.out.printf("La cantidad de %.2f MXN se convierte a %.2f %s%n", pesos, resultado, monedaSeleccionada);
        }
    }
}
