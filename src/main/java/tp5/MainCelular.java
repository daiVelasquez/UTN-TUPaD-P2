package tp5; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*
2) Celular - Batería - Usuario 
   a. Agregación: Celular → Batería 
   b. Asociación bidireccional: Celular ↔ Usuario 
   Clases y atributos:  
   -Celular: imei, marca, modelo 
   -Batería: modelo, capacidad 
   -Usuario: nombre, dni
 */

// Clase Bateria (Agregación con Celular)
class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Bateria [modelo=" + modelo + ", capacidad=" + capacidad + "]";
    }
}

// Clase Usuario (Asociación bidireccional con Celular)
class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // Asociación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", dni=" + dni + "]";
    }
}

// Clase Celular (Agregación → Bateria, Asociación bidireccional ↔ Usuario)
class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;   // Agregación
    private Usuario usuario;   // Asociación bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        usuario.setCelular(this); // establecer la relación bidireccional
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void mostrarInfo() {
        System.out.println("=== Datos del Celular ===");
        System.out.println("IMEI: " + imei);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria);
        System.out.println("Usuario: " + usuario.getNombre() + " (DNI: " + usuario.getDni() + ")");
    }
}


public class MainCelular {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("BAT-5000", 4000);
        Usuario usuario = new Usuario("Ana Gómez", "12345678");
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21", bateria, usuario);

        celular.mostrarInfo();
        System.out.println("El usuario accede a su celular: " + usuario.getCelular().getModelo());
    }
}

/*
Agregación (Celular → Bateria):
Se representa con un rombo vacío en UML (o--).
La batería existe por sí sola, no depende del celular.

Asociación bidireccional (Celular ↔ Usuario):
Cada celular conoce a su usuario, y cada usuario conoce su celular.
Se establece en el constructor con usuario.setCelular(this).

Multiplicidad 1 a 1:
Un usuario tiene un celular, un celular tiene un usuario.
Un celular tiene exactamente una batería.

 */


