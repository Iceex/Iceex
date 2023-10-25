/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import java.util.Scanner;
import Entidad.CuentaBancaria;
import java.util.Random;
/**
 *
 * @author Ice
 */
public class CuentaBancariaServicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random alazar = new Random();
        CuentaBancaria dato = new CuentaBancaria();
        
        // Crear cuenta
        
        System.out.println("Bienvenido al Banco TUDINERO");
        System.out.println("=================================");
        System.out.println("Ingrese su DNI: ");
        dato.dniCliente = sc.nextLong();
        dato.numeroCuenta = alazar.nextInt(1250487); // Generar numero de cuenta alazar
        dato.set_saldoActual(1000);
        System.out.println("Tu saldo actual es $1000");
        // Menu
        
        boolean exit = false;
        while(!exit) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("¿Que operación desea realizar?        +");   
        System.out.println("1. Ingresar dinero                    +");
        System.out.println("2. Retirar dinero                     +");
        System.out.println("3. Retiro rapido                      +");
        System.out.println("4. Ver saldo Actual                   +");
        System.out.println("5. Ver informacion de cuenta          +");
        System.out.println("6. Salir                              +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        int menu = sc.nextInt();

            
            switch(menu) {
                
                case 1:
                    
                    System.out.println("Ingrese valor deseado");
                    double saldo = sc.nextInt();
                    dato.saldoActual += saldo;
                    System.out.println("========================================================");
                    System.out.println("Se a acreditaron: " + "$" + saldo + " a tu saldo actual es: " + "$" + dato.saldoActual);
                    System.out.println("========================================================");
                    break;
                    
                case 2:   
                    System.out.println("Ingrese valor a retirar");
                    double retiro = sc.nextInt();
                    if(retiro < dato.saldoActual){
                        dato.saldoActual -= retiro;
                        System.out.println("======================================");
                        System.out.println("Retiro Exitoso de: " + "$" + retiro + " Te queda: " + "$" + dato.saldoActual); 
                        System.out.println("======================================");
                    }
                    else {
                        dato.set_saldoActual(0);
                        System.out.println("======================================");
                        System.out.println("No posee los fondos suficiente, se retiró el total de su saldo: " + "$" + dato.saldoActual);
                        System.out.println("======================================");
                    }
                    break;     
                
                case 3:
                    System.out.println("Se retirará el 20% de su saldo actual");
                    System.out.println("=========================================");
                    double resultado = dato.saldoActual * 0.2;                    
                    System.out.println("A retirado con exito: " + resultado + " de su cuenta" + " Saldo actual: " + dato.saldoActual);
                    System.out.println("=========================================");
                    break;
                    
                case 4:
                    System.out.println("==============================");
                    System.out.println("Tu saldo actual es: " + dato.saldoActual);
                    System.out.println("==============================");
                    break;
                    
                case 5:
                    System.out.println("Estos son los datos de tu cuenta: ");
                    System.out.println("====================================");
                    System.out.println("Numero de cuenta: " + dato.numeroCuenta);
                    System.out.println("DNI: " + dato.dniCliente);
                    System.out.println("====================================");
                    break;
                    
                case 6:
                    System.out.println("==============================");
                    System.out.println("Gracias por visitarnos");
                    System.out.println("Hasta luego");
                    System.out.println("==============================");
                    return;
                    
                default:
                    System.out.println("Opcion no valida intente de nuevo");        
            }
        }
        }
    }
