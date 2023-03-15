/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication1;
import java.util.Scanner;
/**
 *
 * @author Ice
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe cuantos grados hace: ");
        double celsios = scanner.nextInt();
        
        double Formula = 32 + (9 * celsios / 5);
        System.out.println("Esta son los grados celsios en Fahrenheit: " + Formula);
    }
    
 
}
