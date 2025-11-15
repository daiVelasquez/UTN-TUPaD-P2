/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.Ejercicio3;

/**
 *
 * @author feliz
 */
public class Curso {
     private String codigo;
    private String nombre;
    private Profesor profesor; // Relación bidireccional: cada curso tiene 1 profesor

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Sincroniza la relación bidireccional correctamente
    public void setProfesor(Profesor p) {
        if (this.profesor == p) return;

        // Si ya tenía profesor, lo quitamos de su lista
        if (this.profesor != null) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.eliminarCurso(this);
        }

        // Asignamos el nuevo profesor y actualizamos su lista
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " (" + codigo + ")");
        System.out.println("Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
    }

   
    public String getCodigo() { 
        return codigo; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public Profesor getProfesor() {
        return profesor; 
    }
    
    
}
