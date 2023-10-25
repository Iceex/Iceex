/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.SistemaDeNotas;
import java.util.ArrayList;
/**
 *
 * @author Ice
 */
public class ServicioDeNotas {
    public static void main(String[] args) {
        SistemaDeNotas[] estudiantes = {
            new SistemaDeNotas("Jhan", 20),
            new SistemaDeNotas("Jose", 13),
            new SistemaDeNotas("Joselyn", 15),
            new SistemaDeNotas("Lari", 14),
            new SistemaDeNotas("Daniel", 17),
            new SistemaDeNotas("Laurimar", 18),
            new SistemaDeNotas("Abraham", 10),
            new SistemaDeNotas("Venshi", 11)
        };

        // Calcular promedio de notas
        double promedio = 0;
        for (SistemaDeNotas estudiante: estudiantes) {
            promedio += estudiante.getNota();
        }
        promedio /= estudiantes.length;
        System.out.println("El promedio de notas del curso es: " + promedio);

        // Buscar estudiantes con nota mayor al promedio
        ArrayList<String> nombresMayoresPromedio;
        nombresMayoresPromedio = new ArrayList();
        for (SistemaDeNotas estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombresMayoresPromedio.add(estudiante.getNombre());
            }
        }

        // Mostrar estudiantes con nota mayor al promedio
        System.out.println("Los estudiantes con nota mayor al promedio son:");
        for (SistemaDeNotas estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                System.out.println(estudiante.getNombre() + " - Nota: " + estudiante.getNota());
            }
        }
    }
}
