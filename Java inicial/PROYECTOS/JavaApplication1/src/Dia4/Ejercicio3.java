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
public class Ejercicio3 {
    public static void main(String[] asrgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = scanner.nextLine();
        int longitud = frase.length();
        if(longitud == 8){
            System.out.println("Correcto " + longitud);
        } else {
            System.out.println("Incorrecto " + longitud);
            
        }
    }
    
}
