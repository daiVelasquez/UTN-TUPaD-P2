/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author feliz
 */
public class MainMascota {
    public static void main(String[] args) {
        // Crear una mascota
        Mascota msc = new Mascota("Firulais", "Perro", 3);

        // Mostrar información inicial
        msc.mostrarInfo();

        // Simular el paso de un año
        msc.cumplirAnios();

        // Mostrar información después de cumplir años
        msc.mostrarInfo();

        // Simular otro año
        msc.cumplirAnios();
        msc.mostrarInfo();
    }
}
