/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;
import java.util.Scanner;
/**
 *
 * @author Ice
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = scanner.nextInt();
        if(num % 2 == 0) {
            System.out.println("El numero " + num + " es PAR");
        } else 
            System.out.println("El numero " + num + " NO es PAR");
        
    }
    
    
    
}
