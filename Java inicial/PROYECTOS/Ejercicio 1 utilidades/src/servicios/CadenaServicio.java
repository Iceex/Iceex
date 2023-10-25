/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
import entidades.Cadena;

/**
 *
 * @author Ice
 */


public class CadenaServicio {

    public static int main(Cadena cadena) {
        int cantidad = 0;
        String vocales = "AEIOUaeiou";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (vocales.indexOf(cadena.getFrase().charAt(i)) != -1) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public static String invertirFrase(Cadena cadena) {
        StringBuilder builder = new StringBuilder(cadena.getFrase());
        builder.reverse();
        return builder.toString();
    }
    
    public static int vecesRepetido(Cadena cadena, String letra) {
        int cantidad = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra.charAt(0)) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public static boolean contiene(Cadena cadena, String letra) {
        return cadena.getFrase().contains(letra);
    }
    
    public static void compararLongitud(Cadena cadena1, String frase) {
        int longitudFrase = frase.length();
        if (cadena1.getLongitud() > longitudFrase) {
            System.out.println(cadena1.getFrase() + " es más larga que " + frase);
        } else if (cadena1.getLongitud() < longitudFrase) {
            System.out.println(cadena1.getFrase() + " es más corta que " + frase);
        } else {
            System.out.println(cadena1.getFrase() + " tiene la misma longitud que " + frase);
        }
    }
    
    public static String unirFrases(Cadena cadena1, String frase) {
        return cadena1.getFrase() + " " + frase;
    }
    
    public static String reemplazar(Cadena cadena, String letra, String reemplazo) {
        return cadena.getFrase().replace(letra.charAt(0), reemplazo.charAt(0));
    }
}
