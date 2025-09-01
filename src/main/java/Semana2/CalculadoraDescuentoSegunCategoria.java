/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

/*Escribe un programa que solicite al usuario el precio de un producto y 
su categoría (A, B o C). 
Luego, aplique los siguientes descuentos: 
Categoría A: 10% de descuento 
Categoría B: 15% de descuento  
Categoría C: 20% de descuento 
El programa debe mostrar el precio original, el descuento aplicado y el 
precio final
 */
public class CalculadoraDescuentoSegunCategoria {
     public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        double precio,descAplicado, precioFinal;
        double descuento = 0;
        char categoria;
        
         System.out.println("Ingrese precio del producto: ");
         precio = input.nextDouble();
         
         System.out.println("Ingrese la categoría del producto: ");
         categoria = input.next().charAt(0);
         
         
         switch (categoria){
             case 'a','A' :
                 descuento = 0.10;
                 break;
             case 'b', 'B':
                 descuento = 0.15;
                 break;
             case 'c', 'C':
                 descuento =  0.20;
                 break;
            default:
                 System.out.println("La categoría ingresada en inválida");
                 
         }
          descAplicado = precio * descuento;
          precioFinal= precio - descAplicado;
          System.out.print("Precio original :" +precio+ "\nDescuento aplicado : "+ descAplicado + "\nPrecio Final: " + precioFinal);
         }
         
         
    
}
