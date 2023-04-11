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
public class Ejercicio2 {
    public static void main(String[] arsgs) {
        Scanner scanner = new Scanner(System.in);
        String fail = "Eureka";
        System.out.println("Ingresa la palabra Eureka");
        String frase = scanner.nextLine();
        if(frase.equalsIgnoreCase(fail)) {
            System.out.println("Correcto, se encontro la palabra Eureka");
        }
        else {
            System.out.println("Incorrecto, no se encontro la palabra Eureka");
        }       
                    
        }
            
    }
