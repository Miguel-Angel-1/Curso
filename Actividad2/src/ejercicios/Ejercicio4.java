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
        // TODO code application logic here

        //Calcular salario neto de un empleado
        double salarioBruto, porcentajeImpuestos, deduccionesAdicionales, salarioNeto, impuesto;
        try(Scanner scan = new Scanner(System.in);){
            System.out.print("Ingrese el salario bruto mensual: ");
            salarioBruto = scan.nextDouble();
            System.out.print("Ingrese el porcentaje de impuestos: ");
            porcentajeImpuestos = scan.nextDouble();
            System.out.print("Ingrese las deducciones adicionales: ");
            deduccionesAdicionales = scan.nextDouble();
            impuesto = salarioBruto * (porcentajeImpuestos / 100);
            salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;
            System.out.printf("El salario neto es: $%.2f\n", salarioNeto);
        }
    }
}    


