/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Biblioteca
 * Representa una biblioteca que contiene múltiples libros.
 * Ejemplo de composición 1 a N: si se elimina la Biblioteca,
 * también se pierden sus Libros.
 */

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public void listarLibros() {
        System.out.println("\n=== Libros en la Biblioteca " + nombre + " ===");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }
    
    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro con ISBN " + isbn + " eliminado.");
        } else {
            System.out.println("No se encontró el libro con ISBN " + isbn);
        }
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
     public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n=== Libros publicados en el año " + anio + " ===");
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }
     
    public void mostrarAutoresDisponibles() {
        System.out.println("\n=== Autores disponibles en la Biblioteca ===");
        ArrayList<String> nombres = new ArrayList<>();
        for (Libro l : libros) {
            String nombreAutor = l.getAutor().getNombre();
            if (!nombres.contains(nombreAutor)) {
                nombres.add(nombreAutor);
                l.getAutor().mostrarInfo();
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteca: " + nombre + " | Libros cargados: " + libros.size();
    } 
     
}
