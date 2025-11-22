/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.ecommerce.Modelos;

import java.util.ArrayList;
import java.util.List;
import tp8.ecommerce.Interfaces.Notificable;
import tp8.ecommerce.Interfaces.Pagable;

/**
 *
 * @author feliz
 */
public class Pedido implements Pagable {
   private List<Producto> productos;
    private String estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.productos = new ArrayList<>();
        this.estado = "Creado";
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El pedido cambió de estado a: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
