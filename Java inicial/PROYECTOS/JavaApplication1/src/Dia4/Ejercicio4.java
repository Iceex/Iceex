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
public class Ejercicio4 {
    public static void main(String[] asrgs) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra con la letra 'A' de inicial");
        String frase = leer.nextLine();
        int longi = frase.length();
        String sub = frase.substring(0,1);
        if("a".equalsIgnoreCase(sub)) {
            System.out.println("Correcto");
        } else { 
            System.out.println("Incorrecto");
        }
    }
    
}


