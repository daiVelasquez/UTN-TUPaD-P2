/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

// Clase que modela un producto dentro del inventario.
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria; // Categoría a la que pertenece.

    // Atributo estático: se comparte entre todos los objetos de la clase
    private static int contadorProductos = 0;
    
    // Constructor que inicializa todos los atributos. (principal)
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        contadorProductos++; // cada vez que se crea un producto, aumenta el contador
    }
    
    
    // Constructor sobrecargado: crea productos con menos datos.
    public Producto(String id, String nombre, double precio, CategoriaProducto categoria) {
        this(id, nombre, precio, 0, categoria);
    }
    
    
// Métodos "getters" para acceder a los datos privados.
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    // Setter para actualizar stock
    public void setCantidad(int cantidad) { 
        this.cantidad = cantidad; 
    }
    
    
    // Método estático: devuelve el total de productos creados
    public static int getContadorProductos() {
        return contadorProductos;
    }

    
    public void mostrarInfo() {
        System.out.println(this.toString());
    }
    
     // Sobrescritura de toString() para representar el objeto como texto
    @Override
    public String toString() {
        return "Producto{" +
               "id='" + id + '\'' +
               ", nombre='" + nombre + '\'' +
               ", precio=$" + precio +
               ", cantidad=" + cantidad +
               ", categoria=" + categoria +
               " (" + categoria.getDescripcion() + ")}";
    }
}

