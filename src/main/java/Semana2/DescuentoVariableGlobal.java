/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

/*
 Cálculo de descuento especial usando variable global. 
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un 
método calcularDescuentoEspecial(double precio) que use la variable global para 
calcular el descuento especial del 10%. 
Dentro del método, declara una variable local descuentoAplicado, almacena 
el valor del descuento y muestra el precio final con descuento. 
 */
public class DescuentoVariableGlobal {
    
    //Variable global
    static double DESCUENTO_ESPECIAL = 0.10;
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("Descuento aplicado: " + descuentoAplicado);
        System.out.println("Precio final con descuento: " + precioFinal);
    }
     
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        
        calcularDescuentoEspecial(precio);
        
     }
}
