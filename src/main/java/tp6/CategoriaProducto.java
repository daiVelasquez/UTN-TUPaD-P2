/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author feliz
 */
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

     // Atributo interno que guarda una descripción textual.
    private final String descripcion;

     // Constructor del enum: asigna la descripción a cada categoría.
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Método público para obtener la descripción de la categoría.
    public String getDescripcion() {
        return descripcion;
    }
}
