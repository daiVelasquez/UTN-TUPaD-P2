/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

/*Composición de funciones para calcular costo de envío y total de compra. 
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de 
envío basado en la zona de envío (Nacional o Internacional) y el peso del 
paquete. 
Nacional: $5 por kg  
Internacional: $10 por kg 
b. calcularTotalCompra(double precioProducto, double 
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con 
el costo de envío. 
Desde main(), solicita el peso del paquete, la zona de envío y el precio 
del producto. Luego, muestra el total a pagar. 
 */
public class ComposicionDeFunciones {
    
     public static double calcularCostoEnvio(double peso, String zona){
         double costoEnvio = 0;
         
         if (zona.equalsIgnoreCase("Nacional")){
             costoEnvio = peso * 5;
         }  else if (zona.equalsIgnoreCase("Internacional")) {
             costoEnvio = peso * 10;
         }  else {
             System.out.println("Zona inválida. Se asume costo 0.");
         }
         return costoEnvio;
     }
     
     public static double calcularTotalCompra(double precioProducto, double costoEnvio){
         return precioProducto + costoEnvio;
     }
     
    
     public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
         System.out.println("Ingrese el precio del producto: ");
         double precioProducto = input.nextDouble();
         
         System.out.println("Ingrese el peso del paquete (kg): ");
         double peso = input.nextDouble();
         
         input.nextLine();
         System.out.println("Ingrese la zona de envío (Nacional/Internacionale): ");
         String zona = input.nextLine();
         
         
         double costoEnvio = calcularCostoEnvio( peso , zona);
         
         double total = calcularTotalCompra(precioProducto, costoEnvio);
         
         System.out.println("\n ---Resumen de compra ---");
         System.out.println("Precio del produto: " + precioProducto);
         System.out.println("Costo de envío: " + costoEnvio);
         System.out.println("TOTAL a pagar: " + total);
     }
}
