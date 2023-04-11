/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia9;
import java.util.Scanner;
/**
 *
 * @author Ice
 */
public class Eje6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        int[] filas = new int[3];
        int[] columnas = new int[3];
        int[] diagonales = new int[2];
        boolean numerosCorrectos = true;

        // Pedir al usuario que introduzca los números del cuadrado
        System.out.println("Introduce los números del cuadrado (del 1 al 9):");
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                int num = sc.nextInt();
                if (num < 1 || num > 9) {
                    numerosCorrectos = false;
                    break;
                }
                cuadrado[i][j] = num;
            }
            if (!numerosCorrectos) {
                break;
            }
        }

        // Comprobar si los números introducidos son correctos
        if (!numerosCorrectos) {
            System.out.println("Los números introducidos no son correctos");
            return;
        }

        // Calcular la suma de las filas, las columnas y las diagonales
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                filas[i] += cuadrado[i][j];
                columnas[j] += cuadrado[i][j];
                if (i == j) {
                    diagonales[0] += cuadrado[i][j];
                }
                if (i + j == 2) {
                    diagonales[1] += cuadrado[i][j];
                }
            }
        }

        // Comprobar si la suma de las filas, las columnas y las diagonales es idéntica
        int suma = filas[0];
        boolean esCuadradoMagico = true;
        for (int i = 1; i < filas.length; i++) {
            if (filas[i] != suma || columnas[i] != suma) {
                esCuadradoMagico = false;
                break;
            }
        }
        if (diagonales[0] != suma || diagonales[1] != suma) {
            esCuadradoMagico = false;
        }

        // Mostrar el resultado
        if (esCuadradoMagico) {
            System.out.println("El cuadrado introducido es mágico");
        } else {
            System.out.println("El cuadrado introducido NO es mágico");
        }
    }
}
