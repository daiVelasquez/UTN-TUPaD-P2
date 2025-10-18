/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
9) CitaMédica - Paciente - Profesional 
    a. Asociación unidireccional: CitaMédica → Paciente,  
    b. Asociación unidirecciona: CitaMédica → Profesional 
    Clases y atributos:  
    -CitaMédica: fecha, hora 
    -Paciente: nombre, obraSocial 
    -Profesional: nombre, especialidad 
 */

class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", obraSocial=" + obraSocial + "]";
    }
}

// Clase Profesional
class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Profesional [nombre=" + nombre + ", especialidad=" + especialidad + "]";
    }
}

// Clase CitaMédica (asociación unidireccional con Paciente y Profesional)
class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void mostrarInfo() {
        System.out.println("=== Cita Médica ===");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Paciente: " + paciente);
        System.out.println("Profesional: " + profesional);
    }
}

public class MainCitaMedica {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("María López", "OSDE");
        Profesional profesional = new Profesional("Dr. García", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-25", "09:30", paciente, profesional);

        cita.mostrarInfo();
    }
}

/*
Asociación unidireccional (→):
Indica que una clase usa o referencia a otra, pero la relación no es recíproca.
En este caso, CitaMédica conoce a Paciente y Profesional, pero ellos no conocen a CitaMédica.

Cardinalidad (1 a 1):
Cada cita médica involucra un único paciente y un único profesional.
*/