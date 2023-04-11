/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2;
import Circunferencia.Circunferencia;
/**
 *
 * @author Ice
 */
public class Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Circunferencia circ1 = new Circunferencia(5); // crear objeto con radio inicial de 5
    circ1.crearCircunferencia();
    System.out.println("Radio de la circunferencia 1: " + circ1.getRadio());
    System.out.println("Área de la circunferencia 1: " + circ1.area());
    System.out.println("Perímetro de la circunferencia 1: " + circ1.perimetro());
    }
    
}
