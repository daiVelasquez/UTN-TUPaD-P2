/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.ecommerce.Pagos;

import tp8.ecommerce.Interfaces.Pago;


public class Paypal implements Pago {
     @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal procesado por: $" + monto);
    }
}
