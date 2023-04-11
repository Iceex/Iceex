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
public class Eje3 {
    public static void main(String[] asrgs) {
        int[] vector = {10, 100, 999, 1000, 99999, 123456}; // Ejemplo de vector de enteros

int[] digitos = new int[6]; // Arreglo para almacenar la cantidad de números de 1 a 5 dígitos

for (int i = 0; i < vector.length; i++) {
    int numDigitos = (int) Math.log10(vector[i]) + 1; // Determinar cantidad de dígitos del número
    if (numDigitos > 5) {
        numDigitos = 5; // Limitar a números de 5 dígitos
    }
    digitos[numDigitos]++; // Incrementar contador para el rango de dígitos correspondiente
}

// Imprimir resultados
for (int i = 1; i <= 5; i++) {
    System.out.printf("%d digitos: %d%n", i, digitos[i]);
}
    }
}
