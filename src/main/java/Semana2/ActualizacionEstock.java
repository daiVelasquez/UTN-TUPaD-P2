/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

/* Actualización de stock a partir de venta y recepción de productos. 
Crea un método actualizarStock(int stockActual, int cantidadVendida, 
int cantidadRecibida), que calcule el nuevo stock después de una venta y 
recepción 
de productos: 
NuevoStock = StockActual − CantidadVendida + CantidadRecibida 
NuevoStock = CantidadVendida + CantidadRecibida 
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la 
cantidad recibida, y muestra el stock actualizado. 
 */
public class ActualizacionEstock {
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
      }
    
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad actual: ");
        int stockActual = input.nextInt();
        
        System.out.println("Ingerse la cantidad vendida: ");
        int cantidadVendida = input.nextInt();
       
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();
        
        int nuevoStock =  actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El stock actualizado es: " + nuevoStock);
    }
}
