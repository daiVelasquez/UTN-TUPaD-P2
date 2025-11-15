/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.Ejercicio2;

/**
* Clase principal
 * Ejecuta el programa de gestión de Biblioteca y Libros.
 * Demuestra la composición 1 a N y el uso de colecciones dinámicas.
 */
public class Main {
    public static void main (String[] args){
    
        // 1) Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
         // 2) Crear tres autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A003", "Ernest Hemingway", "Estadounidense");

        // 3) Agregar 5 libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, autor2);
        biblioteca.agregarLibro("ISBN003", "Harry Potter y la cámara secreta", 1998, autor2);
        biblioteca.agregarLibro("ISBN004", "El viejo y el mar", 1952, autor3);
        biblioteca.agregarLibro("ISBN005", "Crónica de una muerte anunciada", 1981, autor1);
        
        // 4) Listar todos los libros
        biblioteca.listarLibros();

        // 5) Buscar un libro por ISBN
        System.out.println("\n=== Buscar libro con ISBN003 ===");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (encontrado != null) encontrado.mostrarInfo();
        
         // 6) Filtrar libros por año específico
        biblioteca.filtrarLibrosPorAnio(1997);

        // 7) Eliminar un libro y volver a listar
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        // 8) Mostrar cantidad total de libros
        System.out.println("\nCantidad total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        // 9) Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
        
    }
   
}
