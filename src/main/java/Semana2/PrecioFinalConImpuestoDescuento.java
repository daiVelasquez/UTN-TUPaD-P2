/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

/*Cálculo del Precio Final con impuesto y descuento.  
Crea un método calcularPrecioFinal(double impuesto, double 
descuento) que calcule el precio final de un producto en un e-commerce. La 
fórmula es: 
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times 
Descuento) 
Desde main(), solicita el precio base del producto, el porcentaje de 
impuesto y el porcentaje de descuento, llama al método y muestra el precio 
final. 
 */
public class PrecioFinalConImpuestoDescuento {
    
    // Método para calcular el precio final
   public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        
        impuesto = impuesto / 100;
        descuento = descuento / 100;

        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el porcentaje de impuesto: ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = input.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.printf("El precio final del producto es: ", precioFinal);
    }
}
