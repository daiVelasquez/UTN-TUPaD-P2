/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author feliz
 */
public class MainLibro {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);

        // Mostrar info inicial
        libro1.mostrarInfo();

        // Intentar cambiar el año a un valor inválido
        libro1.setAnioPublicacion(-2020);

        // Intentar cambiar el año a un valor válido
        libro1.setAnioPublicacion(2020);

        // Mostrar info final
        libro1.mostrarInfo();
    }
}
