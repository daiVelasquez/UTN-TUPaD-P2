/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/*
6) Reserva - Cliente - Mesa 
    a. Asociación unidireccional: Reserva → Cliente 
    b. Agregación: Reserva → Mesa 
    Clases y atributos: 
    -Reserva: fecha, hora 
    -Cliente: nombre, telefono 
    -Mesa: numero, capacidad 
 */

// Clase Cliente (Asociación unidireccional desde Reserva)
class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", telefono=" + telefono + "]";
    }
}

// Clase Mesa (Agregación con Reserva)
class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Mesa [numero=" + numero + ", capacidad=" + capacidad + "]";
    }
}

// Clase Reserva (Asociación unidireccional con Cliente, Agregación con Mesa)
class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;  // Asociación unidireccional
    private Mesa mesa;        // Agregación

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void mostrarInfo() {
        System.out.println("=== Reserva ===");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Cliente: " + cliente);
        System.out.println("Mesa: " + mesa);
    }
}

public class MainReserva {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("María Gómez", "1122334455");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-10-20", "21:00", cliente, mesa);

        reserva.mostrarInfo();
    }
}
 
/*
Reserva → Cliente → Asociación unidireccional
Solo la clase Reserva conoce al Cliente.
El cliente no sabe qué reservas tiene (no hay atributo de reserva en Cliente).

Reserva → Mesa → Agregación
Una reserva utiliza una mesa, pero la mesa puede existir sin la reserva (por eso es una agregación, no composición).

Multiplicidad 1 a 1
Cada reserva tiene un solo cliente y una sola mesa.
Cada mesa y cliente pueden reutilizarse para otras reservas (no hay exclusividad total).
*/