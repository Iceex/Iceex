/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
/**
 *
 * @author Ice
 */
public class CuentaBancaria {
        public int numeroCuenta;
        public long dniCliente;
        public double saldoActual;
        
        public CuentaBancaria () {
            // constructor vacio
        }
        
        public void CuentaBancaria (int numeroCuenta, long dniCliente, double saldoActual) {
            this.numeroCuenta = numeroCuenta;
            this.dniCliente = dniCliente;
            this.saldoActual = saldoActual;
        }
        // Getter numero Cuenta
        public int get_numeroCuenta() { 
            return numeroCuenta;
        }
        //Setter numero Cuenta
        public void set_numeroCuenta(int numeroCuenta){
            this.numeroCuenta = numeroCuenta;
        }
        // Getter Dni Cliente        
        public long get_dniCliente() {
            return dniCliente;
        }
        // Setter Dni Cliente           
        public void set_dniCliente(long dniCliente) {
            this.dniCliente = dniCliente;
        }
        // Getter Saldo Actual        
        public double get_saldoActual() {
            return saldoActual;
        }
        // Setter Saldo Actual         
        public void set_saldoActual(double saldoActual) {
            this.saldoActual = saldoActual;
        }
        
}



/* Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos:
* numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/