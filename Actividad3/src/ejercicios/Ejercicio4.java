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
public class Ejercicio4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calcular Precio con Descuento
        double totalCompra, desc, totalDescuento;
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Dame el total de tu compra: ");
            totalCompra = scan.nextDouble();
            if (totalCompra<=100) {
                System.out.println("El total de su compra es de $"+ totalCompra);
            } else if (totalCompra>100 && totalCompra<=200) {
                desc = totalCompra * .1;
                totalDescuento = totalCompra - desc;
                System.out.println("El total de su compra es de $"+ totalCompra +" menos el 10% por superar los $100 es de $"+ totalDescuento);
            } else if (totalCompra>200 && totalCompra<=500) {
                desc = totalCompra * .2;
                totalDescuento = totalCompra - desc;
                System.out.println("El total de su compra es de $"+ totalCompra +" menos el 20% por superar los $200 es de $"+ totalDescuento);
            } else if (totalCompra>500) {
                desc = totalCompra * .25;
                totalDescuento = totalCompra - desc;
                System.out.println("El total de su compra es de $"+ totalCompra +" menos el 25% por superar los $500 es de $"+ totalDescuento);
            }
        }
    }
}
