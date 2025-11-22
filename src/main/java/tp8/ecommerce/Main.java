/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.ecommerce;

import tp8.ecommerce.Interfaces.Pago;
import tp8.ecommerce.Modelos.Cliente;
import tp8.ecommerce.Modelos.Pedido;
import tp8.ecommerce.Modelos.Producto;
import tp8.ecommerce.Pagos.TarjetaCredito;

/**
 *
 * @author feliz
 */
public class Main {
      public static void main(String[] args) {

        Cliente cliente = new Cliente("Daiana");

        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Auriculares", 15000));
        pedido.agregarProducto(new Producto("Mouse Gamer", 9000));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        Pago metodoPago = new TarjetaCredito();

        double totalConDescuento = ((TarjetaCredito) metodoPago).aplicarDescuento(pedido.calcularTotal());

        metodoPago.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Pagado");
        pedido.cambiarEstado("Enviado");
    }
}
