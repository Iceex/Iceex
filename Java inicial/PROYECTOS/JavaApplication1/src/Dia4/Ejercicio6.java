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
public class Ejercicio6 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, opcion;
        boolean salir = false;

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();

        while (!salir) {
            System.out.println("\nMENU");
            System.out.println("1. Sumar los dos números");
            System.out.println("2. Restar los dos números");
            System.out.println("3. Multiplicar los dos números");
            System.out.println("4. Dividir el primer número entre el segundo");
            System.out.println("5. Salir del programa");

            System.out.print("\nElige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El producto es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("La división es: " + ((double)num1 / num2));
                    } else {
                        System.out.println("No se puede dividir entre cero");
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    sc.nextLine(); // Consumimos el salto de línea
                    String respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("S")) {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        sc.close();
        System.out.println("¡Hasta luego!");
    }
}
