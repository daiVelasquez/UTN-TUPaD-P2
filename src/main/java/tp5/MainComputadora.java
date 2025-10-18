/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/*
 5) Computadora - PlacaMadre - Propietario 
    a. Composición: Computadora → PlacaMadre 
    b. Asociación bidireccional: Computadora ↔ Propietario 
    Clases y atributos:  
    -Computadora: marca, numeroSerie    
    -PlacaMadre: modelo, chipset 
    -Propietario: nombre, dni 
 */

// Clase PlacaMadre (Composición con Computadora)
class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }

    public String getChipset() {
        return chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre [modelo=" + modelo + ", chipset=" + chipset + "]";
    }
}

// Clase Propietario (Asociación bidireccional con Computadora)
class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Asociación bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public String toString() {
        return "Propietario [nombre=" + nombre + ", dni=" + dni + "]";
    }
}

// Clase Computadora (Composición → PlacaMadre, Asociación bidireccional ↔ Propietario)
class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa;       // Composición
    private Propietario propietario; // Asociación bidireccional

    public Computadora(String marca, String numeroSerie, PlacaMadre placa, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = placa;
        this.propietario = propietario;
        propietario.setComputadora(this); // establecer la relación bidireccional
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlaca() {
        return placa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void mostrarInfo() {
        System.out.println("=== Computadora ===");
        System.out.println("Marca: " + marca);
        System.out.println("Numero de Serie: " + numeroSerie);
        System.out.println("Placa Madre: " + placa);
        System.out.println("Propietario: " + propietario.getNombre() + " (DNI: " + propietario.getDni() + ")");
    }
}

public class MainComputadora {
    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("ASUS ROG", "Z790");
        Propietario propietario = new Propietario("Lucía Fernández", "98765432");
        Computadora computadora = new Computadora("HP", "SN123456", placa, propietario);

        computadora.mostrarInfo();
        System.out.println("El propietario accede a su computadora: " + propietario.getComputadora().getMarca());
    }
}

/*
Computadora → PlacaMadre → Composición
La computadora posee totalmente a la placa madre.
Si la computadora desaparece, la placa madre también desaparece.

Computadora ↔ Propietario → Asociación bidireccional
Cada computadora conoce a su propietario y cada propietario conoce su computadora.

Multiplicidad 1 a 1
Una computadora tiene una placa madre y un propietario.
Cada propietario tiene una computadora.
*/