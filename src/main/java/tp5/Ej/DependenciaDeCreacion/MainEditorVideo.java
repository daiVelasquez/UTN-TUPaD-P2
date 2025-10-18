/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.Ej.DependenciaDeCreacion;

/*
14)  EditorVideo - Proyecto - Render 
    a. Asociación unidireccional: Render → Proyecto 
    b. Dependencia de creación: EditorVideo.exportar(String, Proyecto) 
    c. Clases y atributos: 
    Render: formato. 
 
    Proyecto: nombre, duracionMin. 
    EditorVideo->método: void exportar(String formato, Proyecto proyecto) 
 */

class Proyecto {
    private String nombre;
    private int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto [nombre=" + nombre + ", duracionMin=" + duracionMin + "]";
    }
}

// Clase Render (asociación unidireccional con Proyecto)
class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    @Override
    public String toString() {
        return "Render [formato=" + formato + ", proyecto=" + proyecto.getNombre() + "]";
    }
}

// Clase EditorVideo (dependencia de creación)
class EditorVideo {

    // Método que crea un render usando Proyecto y formato
    public Render exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // Dependencia de creación
        System.out.println("Render creado: " + render);
        return render;
    }
}

public class MainEditorVideo {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("VideoTutorial", 15);
        EditorVideo editor = new EditorVideo();

        // Exportar un render (dependencia de creación)
        Render render = editor.exportar("MP4", proyecto);
    }
}

/*
Asociación unidireccional (→):
Render → Proyecto
Cada render está asociado a un único proyecto. El proyecto no conoce los renders generados.
Cardinalidad (1 a 1)

Dependencia de creación (..>):
EditorVideo ..> Render
El editor de video crea instancias de Render dentro del método exportar(). 
La relación es temporal: el editor usa el proyecto como parámetro para crear el render, pero no lo almacena como atributo.
*/