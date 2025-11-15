/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author feliz
 */
public class MainPrincipal {
     public static void main(String[] args) {
        Inventario inventario = new Inventario();

        //1) Crear y agregar cinco productos con distintas categorías.
        Producto p1 = new Producto("A01", "Manzanas", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E02", "Auriculares", 2500, 20, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R03", "Campera", 3500, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H04", "Silla", 2700, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A05", "Pan", 800, 80, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2) Listar todos los productos.
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        inventario.listarProductos();

        // 3) Buscar un producto por ID.
        System.out.println("\n--- BUSCAR PRODUCTO POR ID P003---");
        Producto encontrado = inventario.buscarProductoPorId("P003");
        if (encontrado != null) encontrado.mostrarInfo();

        // 4)  Filtrar productos por categoría.
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5) Eliminar un producto por su ID.
        inventario.eliminarProducto("P002");
        inventario.listarProductos();

        // 6) Actualizar el stock de un producto existente.
        inventario.actualizarStock("P001", 80);

        // 7) Mostrar el total de stock disponible.
        System.out.println("\nTotal de unidades en stock: " + inventario.obtenerTotalStock());

        // 8) Obtener y mostrar el producto con mayor stock
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) {
            System.out.println("\nProducto con mayor stock:");
            mayor.mostrarInfo();
        }
        // 9) Filtrar productos con precio entre $1000 a $3000.
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10) Mostrar las categorías disponibles.
        inventario.mostrarCategoriasDisponibles();
    }
}
