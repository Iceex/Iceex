/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.Scanner;
/**
 *
 * @author Ice
 */
public class Libro {
    public String ISBN;
    public int NPage;
    public String Titulo;
    public String Autor;
    
    public Libro(){
        
    }

    public Libro(String ISBN, String Tiutlo, String Autor, int NPage) {
        this.ISBN = ISBN;
        this.NPage = NPage;
        this.Titulo = Tiutlo;
        this.Autor = Autor;
    }
    
    
    public void librodetalles() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el ISBN del libro:");
            this.ISBN = sc.nextLine();
            System.out.println("Ingrese el título del libro:");
            this.Titulo = sc.nextLine();
            System.out.println("Ingrese el Autor del libro:");
            this.Autor = sc.nextLine();
            System.out.println("Ingrese el número de páginas del libro:");
            this.NPage = sc.nextInt();
    }
    
    public void mostrar() {
        System.out.println("Detalles del libro:");
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.Titulo);
        System.out.println("Autor: " + this.Autor);
        System.out.println("Número de páginas: " + this.NPage);

    }

    
}


/*Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas,
y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para
cargar un libro pidiendo los datos al usuario y luego informar
mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.*/
