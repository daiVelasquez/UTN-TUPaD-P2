/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author feliz
 */
public class Gallina {
   // Atributos privados
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // al crear la gallina no tiene huevos
    }

    // Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos += 1;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    // Método para envejecer la gallina
    public void envejecer() {
        edad += 1;
        System.out.println("Gallina " + idGallina + " ha envejecido. Edad ahora: " + edad);
    }

    // Método para mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("-------------------------");
    }
}
