/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
4) TarjetaDeCrédito - Cliente - Banco 
    a. Asociación bidireccional: TarjetaDeCrédito ↔ Cliente 
    b. Agregación: TarjetaDeCrédito → Banco 
    Clases y atributos:  
    -TarjetaDeCrédito: numero, fechaVencimiento 
    -Cliente: nombre, dni 
    -Banco: nombre, cuit 
 */

// Clase Banco (Agregación con TarjetaDeCrédito)
class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }

    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", cuit=" + cuit + "]";
    }
}

// Clase Cliente (Asociación bidireccional con TarjetaDeCrédito)
class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // Asociación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", dni=" + dni + "]";
    }
}

// Clase TarjetaDeCredito (Agregación → Banco, Asociación bidireccional ↔ Cliente)
class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;      // Agregación
    private Cliente cliente;  // Asociación bidireccional

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = cliente;
        cliente.setTarjeta(this); // establecer la relación bidireccional
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void mostrarInfo() {
        System.out.println("=== Tarjeta de Crédito ===");
        System.out.println("Numero: " + numero);
        System.out.println("Fecha Vencimiento: " + fechaVencimiento);
        System.out.println("Banco: " + banco);
        System.out.println("Cliente: " + cliente.getNombre() + " (DNI: " + cliente.getDni() + ")");
    }
}

public class MainTarjeta {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente = new Cliente("Juan Pérez", "12345678");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/27", banco, cliente);

        tarjeta.mostrarInfo();
        System.out.println("El cliente accede a su tarjeta: " + cliente.getTarjeta().getNumero());
    }
}

/*
TarjetaDeCredito ↔ Cliente → Asociación bidireccional (Cada tarjeta conoce a su cliente y cada cliente conoce su tarjeta.)
Se establece en el constructor de TarjetaDeCredito con cliente.setTarjeta(this)

TarjetaDeCredito → Banco → Agregación. La tarjeta tiene un banco asociado.
El banco puede existir sin la tarjeta (rombo vacío en UML).

Cada tarjeta pertenece a un cliente y un banco.(1 a 1)
Cada cliente tiene una tarjeta.
*/