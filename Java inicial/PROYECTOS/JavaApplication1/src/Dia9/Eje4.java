/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia9;
import java.util.Random;
/**
 *
 * @author Ice
 */
public class Eje4 {
    public static void main(String[] asrgs) {
        // Crear matriz de 4x4 con valores aleatorios
        int[][] matriz = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10); // Valores aleatorios entre 0 y 9
            }
        }
        
        // Imprimir matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Obtener matriz traspuesta
        int[][] traspuesta = obtenerMatrizTraspuesta(matriz);

        // Imprimir matriz traspuesta
        System.out.println("Matriz traspuesta:");
        imprimirMatriz(traspuesta);
    }

    // Función para obtener la matriz traspuesta de una matriz dada
    public static int[][] obtenerMatrizTraspuesta(int[][] matriz) {
        int[][] traspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }

    // Función para imprimir una matriz en la consola
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
    

