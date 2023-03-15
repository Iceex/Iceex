/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Ice
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2;
        System.out.println("La suma de los dos números es: " + suma);
    }
}
