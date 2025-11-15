/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.KATA2;

/**
 *
 * @author feliz
 */
public abstract class Figura {
    protected String nombre;
    
    public Figura(String nombre){
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
}
