/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author feliz
 */
public class MainGallina {
     public static void main(String[] args) {
        // Crear dos gallinas
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 3);

        // Simular acciones de la primera gallina
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        // Simular acciones de la segunda gallina
        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        // Mostrar estados finales
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
