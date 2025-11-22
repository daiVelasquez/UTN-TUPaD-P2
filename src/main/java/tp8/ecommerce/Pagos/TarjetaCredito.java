/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.ecommerce.Pagos;

import tp8.ecommerce.Interfaces.Pago;
import tp8.ecommerce.Interfaces.PagoConDescuento;

/**
 *
 * @author feliz
 */
public class TarjetaCredito implements Pago, PagoConDescuento{
   @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de Crédito procesado por: $" + monto);
    }
}
