/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia9;
/**
 *
 * @author Ice
 */
public class Eje1 {
    public static void main(String[] asrgs) {
        int[] vector = new int[100];
        
        for (int i = 0; i < vector.length; i++) {
        vector[i] = i + 1;
        }
        for (int i = vector.length - 1; i >= 0; i--){ /// Desendiente menor a mayor
            
            System.out.println("[" + vector[i] + "]");
        }
    }
}
