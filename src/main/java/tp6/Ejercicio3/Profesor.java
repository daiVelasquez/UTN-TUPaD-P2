/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.Ejercicio3;

import java.util.ArrayList;
import java.util.List;


public class Profesor {
    
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // Relación bidireccional: un profesor dicta muchos cursos

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    // Agrega un curso si no está, y sincroniza el otro lado
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }
    
    // Elimina un curso y sincroniza el otro lado
    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }
    
    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println(" - " + c.getCodigo() + ": " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (" + especialidad + ")");
        System.out.println("Cantidad de cursos: " + cursos.size());
    }
    
    public String getId() { 
        return id; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public String getEspecialidad() {
        return especialidad; 
    }
    public List<Curso> getCursos() {
        return cursos; 
    }
    
}
