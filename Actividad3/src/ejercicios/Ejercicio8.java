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
        // Brindar información
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Ingrese el nombre de un artista, película, serie o algo de su preferencia:");
            String preferencia = scanner.nextLine().toLowerCase();
            switch (preferencia) {
                case "leonardo dicaprio" -> {System.out.println("Leonardo DiCaprio es un actor estadounidense conocido por sus papeles en películas como Titanic, Inception y The Revenant.");}
                case "breaking bad" -> {System.out.println("Breaking Bad es una serie de televisión estadounidense que sigue la vida de un profesor de química convertido en fabricante de metanfetaminas.");}
                case "inception" -> {System.out.println("Inception es una película de ciencia ficción dirigida por Christopher Nolan, que explora el mundo de los sueños y el subconsciente.");}
                case "stranger things" -> {System.out.println("Stranger Things es una serie de televisión de ciencia ficción y terror creada por los hermanos Duffer, que sigue la desaparición de un niño y eventos sobrenaturales en la ciudad de Hawkins.");}
                case "taylor swift" -> {System.out.println("Taylor Swift es una cantante y compositora estadounidense conocida por sus éxitos en los géneros de country y pop, como Love Story y Shake It Off.");}
                default -> {System.out.println("Lo siento, no tengo información sobre " + preferencia + ". Intente con otra búsqueda.");}
            }
        }
    }
}
