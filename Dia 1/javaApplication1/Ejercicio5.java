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
public class Ejercicio5 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int num = scanner.nextInt();
        
        int doble = num * 2;
        int triple = num + num + num;
        double raiz = Math.sqrt(num);
                
                
        System.out.println("Este es el Doble: " + doble);
        System.out.println("Este es el Triple: " + triple);
        System.out.println("Este es el Raiz: " + raiz);
        
    }
    
}
