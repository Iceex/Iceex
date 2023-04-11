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
public class Eje1 {
    public static void main(String[] asrgs) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        
        while (!exit) {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multi");
            System.out.println("4. Divi");
            System.out.println("5. Salir");
            
            int select = sc.nextInt();
            
            switch (select) {
                case 1:
                    System.out.println("La Suma da como resultado: " + (num1 + num2));
                    break;
                case 2:
                    if (num2 > num1) {
                     System.out.println("La Resta da como resultado: " + (num2 - num1));
                    } else {
                        System.out.println("La Resta da como resultado: " + (num1 - num2));
                    }
                     break;
                case 3:
                    System.out.println("La Multiplicacion da como resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                    System.out.println("La division da como resultado: " + ((double)num1 / num2));
                    } else {
                        System.out.println("No se puede dividir entre cero");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        sc.close();
        System.out.println("Gracias por participar, no vemos!");
    }
}
