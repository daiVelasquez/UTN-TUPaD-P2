/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.Ejercicio2;

/*
Clase Libro
 * Representa un libro que pertenece a una Biblioteca.
 * composición: un Libro no existe sin una Biblioteca.
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Composición con Autor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }

    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn + 
                           " | Título: " + titulo + 
                           " | Año: " + anioPublicacion + 
                           " | Autor: " + autor);
    }

     @Override
    public String toString() {
        return "ISBN: " + isbn + 
               " | Título: " + titulo + 
               " | Año: " + anioPublicacion + 
               " | Autor: " + autor;
    }
}
