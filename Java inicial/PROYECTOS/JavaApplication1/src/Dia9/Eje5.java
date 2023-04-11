/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia9;

/**
 *
 * @author Ice
 */
public class Eje5 {
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 1, -2},
                {-1, 0, 3},
                {2, -3, 0}
        };
        boolean esAntisimetrica = esMatrizAntisimetrica(matriz);
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz NO es antisimétrica");
        }
    }

    // Función para comprobar si una matriz dada es antisimétrica
    public static boolean esMatrizAntisimetrica(int[][] matriz) {
        // Comprobar si la matriz es cuadrada
        if (matriz.length != matriz[0].length) {
            return false;
        }

        // Comprobar si la matriz es igual a su traspuesta, pero cambiada de signo
        int[][] traspuesta = obtenerMatrizTraspuesta(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != -traspuesta[i][j]) {
                    return false;
                }
            }
        }
        return true;
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
}
