/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia9;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Ice
 */
public class Eje2 {
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Pedir al usuario el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        // Crear un vector de tamaño n y llenarlo con valores aleatorios
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(100); // Valores aleatorios entre 0 y 99
        }

        // Mostrar el vector generado
        System.out.println("Vector generado: " + Arrays.toString(vector));

        // Pedir al usuario el número a buscar
        System.out.print("Ingrese un número para buscar en el vector: ");
        int numeroBuscado = scanner.nextInt();

        // Buscar el número en el vector
        boolean encontrado = false;
        int posicion = -1;
        int repeticiones = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numeroBuscado) {
                if (!encontrado) {
                    encontrado = true;
                    posicion = i;
                }
                repeticiones++;
            }
        }

        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.printf("El número %d se encuentra en la posición %d del vector. ", numeroBuscado, posicion);
            if (repeticiones > 1) {
                System.out.printf("El número %d se repite %d veces en el vector. ", numeroBuscado, repeticiones);
            }
        } else {
            System.out.printf("El número %d no se encuentra en el vector.", numeroBuscado);
        }
    }
}
