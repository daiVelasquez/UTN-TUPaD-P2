/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/*
 3)  Libro - Autor - Editorial 
    a. Asociación unidireccional: Libro → Autor 
    b. Agregación: Libro → Editorial 
    
    Clases y atributos: 
    -Libro: titulo, isbn 
    -Autor: nombre, nacionalidad 
    -Editorial: nombre, direccion
 */

// Clase Autor (Asociación unidireccional desde Libro)
class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
    }
}

// Clase Editorial (Agregación con Libro)
class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Editorial [nombre=" + nombre + ", direccion=" + direccion + "]";
    }
}

// Clase Libro
class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;           // Asociación unidireccional
    private Editorial editorial;   // Agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void mostrarInfo() {
        System.out.println("=== Libro ===");
        System.out.println("Titulo: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
    }
}

public class MainLibro {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires");
        Libro libro = new Libro("Cien Años de Soledad", "978-3-16-148410-0", autor, editorial);

        libro.mostrarInfo();
    }
}

/*
Libro --> Autor → asociación unidireccional (solo un objeto conoce al otro.)
Un Libro conoce a su Autor, pero el Autor no mantiene referencia al libro.

Libro o-- Editorial → agregación, rombo vacío indica que la editorial puede existir sin el libro

"1" en ambos lados indica multiplicidad uno a uno

*/