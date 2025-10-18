/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.Ej.DependenciaDeUso;

/**
11 ) Reproductor - Canción - Artista 
    a. Asociación unidireccional: Canción → Artista 
    b. Dependencia de uso: Reproductor.reproducir(Cancion) 
    Clases y atributos: 
    -Canción: titulo. 
    -Artista: nombre, genero. 
    -Reproductor->método: void reproducir(Cancion cancion)
 */

class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Artista: " + nombre + " (" + genero + ")";
    }
}


class Cancion {
    private String titulo;
    private Artista artista; // Asociación unidireccional hacia Artista

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Canción: " + titulo + " - " + artista.getNombre();
    }
}


class Reproductor {

    // Dependencia de uso: recibe una Cancion como parámetro, pero no la guarda como atributo
    public void reproducir(Cancion cancion) {
        System.out.println("🎵 Reproduciendo: " + cancion.getTitulo() + " de " + cancion.getArtista().getNombre());
    }
}

public class MainReproductor {
    public static void main(String[] args) {

      
        Artista artista = new Artista("Gustavo Cerati", "Rock");

        // Crear una canción asociada al artista
        Cancion cancion = new Cancion("Crimen", artista);

        
        Reproductor reproductor = new Reproductor();

        // Reproducir la canción (dependencia de uso)
        reproductor.reproducir(cancion);
 }
}

/*
Asociación unidireccional (Canción → Artista):
La clase Cancion tiene un atributo de tipo Artista, por lo tanto conoce al artista que la interpreta.

Dependencia de uso (Reproductor → Cancion):
La clase Reproductor usa una instancia de Cancion en el método reproducir(), pero no la almacena como atributo, 
solo la utiliza de forma temporal para ejecutar una acción.
- Esto es lo que diferencia la dependencia de una asociación.
*/
