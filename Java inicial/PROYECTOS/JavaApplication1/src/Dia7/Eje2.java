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
public class Eje2 {
    public static void main(String[] asrgs) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        
        System.out.println("Ingrese un nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese una edad");
        int edad = sc.nextInt();

        while (!exit) {
            System.out.println("Estos fueron los resultados...");
            System.out.println("==================================");
            System.out.println(" ");
            if (edad > 18){
                System.out.println(nombre + " Es mayor de edad");
            } else {
                System.out.println(nombre + " Es menor de edad");
            }
            
            System.out.println("¿Quieres agregar otra persona? (Yes/No)");
            sc.nextLine();
            String decicion = sc.nextLine();
            if (decicion.equalsIgnoreCase("Yes")) {
                System.out.println("Ingrese un nombre");
                nombre = sc.nextLine();
                System.out.println("Ingrese una edad");
                edad = sc.nextInt();
            } if (decicion.equalsIgnoreCase("No")) {
                exit = true;
            }
            
        }
        sc.close();
        System.out.println(" ");
        System.out.println("Gracias, hasta la proxima!");
    }
}
