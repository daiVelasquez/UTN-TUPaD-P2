/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author feliz
 */
public class NaveEspacial {
    //Atributos
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;
    
    //constructor
    public NaveEspacial(String nombre, int combustibleInicial){
        this.nombre = nombre;
        if (combustible > MAX_COMBUSTIBLE) {
            this.combustible = MAX_COMBUSTIBLE;
        } else {
            this.combustible = combustibleInicial;
        }
    }
    
    //Método para despegar 
    public void despegar(){
        if(combustible >=10){
            combustible -=10;
            System.out.println(nombre + "ha despegado! Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + "no tiene suficiente combustible para despegar");
        }
    }
    
    // Método para avanzar una distancia
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // ejemplo: 2 unidades de combustible por cada unidad de distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println(nombre + " se recargó al máximo (" + MAX_COMBUSTIBLE + ").");
        } else {
            combustible += cantidad;
            System.out.println(nombre + " recargó " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }

    // Mostrar estado
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
        System.out.println("--------------------------");
    }
    
}
    

