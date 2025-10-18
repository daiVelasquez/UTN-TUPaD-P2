/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/*
7) Vehículo - Motor - Conductor 
    a. Agregación: Vehículo → Motor 
    b. Asociación bidireccional: Vehículo ↔ Conductor 
    Clases y atributos:  
    -Vehículo: patente, modelo 
    -Motor: tipo, numeroSerie 
    -Conductor: nombre, licencia 
 */

// Clase Motor (Agregación con Vehículo)
class Motor {
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor [tipo=" + tipo + ", numeroSerie=" + numeroSerie + "]";
    }
}

// Clase Conductor (Asociación bidireccional con Vehículo)
class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Asociación bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor [nombre=" + nombre + ", licencia=" + licencia + "]";
    }
}

// Clase Vehiculo (Agregación → Motor, Asociación bidireccional ↔ Conductor)
class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;          // Agregación
    private Conductor conductor;  // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        conductor.setVehiculo(this); // Establece relación bidireccional
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void mostrarInfo() {
        System.out.println("=== Vehículo ===");
        System.out.println("Patente: " + patente);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Conductor: " + conductor.getNombre() + " (Licencia: " + conductor.getLicencia() + ")");
    }
}

public class MainVehiculo {
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "MTR-12345");
        Conductor conductor = new Conductor("Carlos López", "LIC-9876");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla", motor, conductor);

        vehiculo.mostrarInfo();
        System.out.println("El conductor maneja el vehículo: " + conductor.getVehiculo().getModelo());
    }
    
}

/*
Vehículo → Motor → Agregación
El vehículo tiene un motor, pero el motor puede existir sin el vehículo (por eso es agregación).
Se representa con un rombo vacío (o--).

Vehículo ↔ Conductor → Asociación bidireccional
Ambos se conocen mutuamente.
El Vehículo conoce al Conductor, y el Conductor conoce su Vehículo.

Multiplicidad 1 a 1
Cada vehículo tiene un conductor y un motor.
Cada conductor tiene un solo vehículo asignado.
*/