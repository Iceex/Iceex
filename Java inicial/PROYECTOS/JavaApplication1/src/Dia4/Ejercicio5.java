/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia4;
import java.util.Scanner;
/**
 *
 * @author Ice
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limite = 20, suma = 0, num;

        while (suma <= limite) {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            suma += num;
        }

        System.out.println("Llegastes al limite establecido: " + limite + " Tu total fue de: " + suma);
    }
}
