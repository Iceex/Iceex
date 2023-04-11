/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Ice
 */
public class Circunferencia {
    private double radio;
    private final double PI = 3.1416; // valor constante de PI
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return this.radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia:");
        this.radio = sc.nextDouble();
    }
    
    public double area() {
        return PI * this.radio * this.radio;
    }
    
    public double perimetro() {
        return 2 * PI * this.radio;
    }
}
