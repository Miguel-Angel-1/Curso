/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author raul
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimir Números Divisibles por 3 y 5
        for (int i=1;i<=100;i++){
            if (i%3==0 && i%5 == 0) {
                System.out.println(i);
            }
        }
    }
}
