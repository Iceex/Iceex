/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia7;
import java.util.Scanner;
/**
 *
 * @author Ice
 */
public class Eje4 {
    public static void main(String[] asrgs) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        boolean esPrimo = esPrimo(num);
        if (esPrimo) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
        scanner.close();
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
