/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Ice
 */
public class Razasdeperro {
    public static void main(String[] args) {
        ArrayList<String> razasDePerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String raza;

        while (true) {
            System.out.print("Introduce una raza de perro (o escribe \"salir\" para finalizar): ");
            raza = scanner.nextLine();
            if (raza.equalsIgnoreCase("salir")) {
                break;
            }
            razasDePerros.add(raza);
        }

        System.out.println("Las razas de perros introducidas son: ");
        for (String razaDePerro : razasDePerros) {
            System.out.println("- " + razaDePerro);
        }
    }
}
