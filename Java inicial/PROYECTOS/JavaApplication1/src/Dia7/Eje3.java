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
public class Eje3 {

    private static int moneda;
    
    public static void main(String[] asrgs) {
       
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de Euro a cambiar");
        double valor = sc.nextInt();
        
        System.out.println("Elige el tipo de moneda a calcular");
            System.out.println("1. Dolar");
            System.out.println("2. Yenes");
            System.out.println("3. Libras");
        moneda = sc.nextInt();
        

        cambio(valor, moneda);
        sc.close();
        }
        public static void cambio(double valor, int moneda) {
            
            String divisa = "";
            double calculo = 0;
            String signo = "";
            boolean exit = false;
            while (!exit) {
                
            
            switch (moneda) {
                case 1:
                 calculo = 1.28611;
                 divisa = "Dolares";
                 signo = "$";
                 break;
                 
                case 2:
                 calculo = 129.852;
                 divisa = "Yenes";
                 signo = "¥";
                 break;
                 
                case 3:
                    calculo = 0.86;
                    divisa = "Libras";
                    signo = "£";
                    break;
                default:
                    System.out.println("Moneda no soportada");
                    
            }
            double resultado = valor * calculo;
            System.out.println("Cambio con exito obtienes " + signo + resultado + " " + divisa + " de " + valor + " inicial" );
                    System.out.println("=======================================" );

            Scanner sc = new Scanner(System.in);
        
            System.out.println("Quieres calcular otra moneda? (Y/N)");
            String seguir = sc.nextLine();
            if (seguir.equalsIgnoreCase("Y")) {
            System.out.println("=======================================" );
            System.out.println("Elige el tipo de moneda a calcular");
            System.out.println("1. Dolar");
            System.out.println("2. Yenes");
            System.out.println("3. Libras");
        
            moneda = sc.nextInt();
            } else {
                System.out.println("=======================================" );
                System.out.println("Gracias por participar, Hasta luego!");
                return;
            }
            }
        }
}
