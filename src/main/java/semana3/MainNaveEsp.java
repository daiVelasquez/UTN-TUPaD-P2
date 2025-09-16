/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author feliz
 */
public class MainNaveEsp {
     public static void main(String[] args) {
        // Crear nave con 50 unidades de combustible
        NaveEspacial nave1 = new NaveEspacial("ExplorerX", 50);

        // Intentar avanzar sin recargar
        nave1.despegar();
        nave1.avanzar(30); // 30*2 = 60 de consumo, debería fallar

        // Recargar combustible
        nave1.recargarCombustible(40); // sube a 80

        // Avanzar correctamente
        nave1.avanzar(20); // 20*2 = 40 consumo

        // Mostrar estado final
        nave1.mostrarEstado();
    }
    
}
