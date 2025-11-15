/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.Ejercicio3;

import java.util.ArrayList;
import java.util.List;


public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + curso.getNombre());
        } else {
            System.out.println("No se pudo asignar el profesor al curso.");
        }
    }

    public void listarProfesores() {
        System.out.println("\nProfesores en la universidad:");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }
    }

    public void listarCursos() {
        System.out.println("\nCursos disponibles:");
        for (Curso c : cursos) {
            c.mostrarInfo();
            System.out.println();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + codigo);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            for (Curso c : new ArrayList<>(profesor.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + id);
        }
    }

    public void reporteCantidadCursosPorProfesor() {
        System.out.println("\n--- Reporte de cursos por profesor ---");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " curso(s).");
        }
    }
}
