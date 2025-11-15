/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.Ejercicio3;

/**
 *
 * @author feliz
 */
public class Main {
    public static void main(String[] args){
        
         Universidad utn = new Universidad("UTN");

        // 1) Crear profesores
        Profesor p1 = new Profesor("P1", "Gabriel Torres", "Programación");
        Profesor p2 = new Profesor("P2", "Daiana Velasquez", "Matemática");
        Profesor p3 = new Profesor("P3", "Laura Gómez", "Bases de Datos");

        // 2) Crear cursos
        Curso c1 = new Curso("C1", "Programación I");
        Curso c2 = new Curso("C2", "Matemática Discreta");
        Curso c3 = new Curso("C3", "Bases de Datos I");
        Curso c4 = new Curso("C4", "Arquitectura de Computadoras");
        Curso c5 = new Curso("C5", "Lógica y Algoritmos");

        // 3) Agregar a la universidad
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        // 4) Asignar profesores a cursos
        utn.asignarProfesorACurso("C1", "P1");
        utn.asignarProfesorACurso("C2", "P2");
        utn.asignarProfesorACurso("C3", "P3");
        utn.asignarProfesorACurso("C4", "P1");

        // 5) Mostrar información
        utn.listarProfesores();
        utn.listarCursos();

        // 6) Cambiar profesor de un curso
        System.out.println("\nCambiando profesor de 'C3'...");
        utn.asignarProfesorACurso("C3", "P1");

        // 7) Eliminar un curso
        System.out.println("\nEliminando curso 'C2'...");
        utn.eliminarCurso("C2");

        // 8) Eliminar un profesor
        System.out.println("\nEliminando profesor 'P3'...");
        utn.eliminarProfesor("P3");

        // 9) Reporte final
        utn.reporteCantidadCursosPorProfesor();
    }
    
}
