/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author feliz
 */
public class MainEstudiante {
     public static void main(String[] args) {
        Estudiante alumno = new Estudiante("Daiana", "Velásquez", "Programación I", 8.5);

        alumno.mostrarInfo();
        alumno.subirCalificacion(1.5);
        alumno.bajarCalificacion(0.5);
        alumno.mostrarInfo();
    }
    
}
