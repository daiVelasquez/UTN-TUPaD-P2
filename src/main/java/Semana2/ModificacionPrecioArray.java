/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

/*
 Modificación de un array de precios y visualización de resultados.  
Crea un programa que: 
a. Declare e inicialice un array con los precios de algunos productos. 
b. Muestre los valores originales de los precios. 
c. Modifique el precio de un producto específico. 
d. Muestre los valores modificados. 
 */
public class ModificacionPrecioArray {
    public static void main (String [] args){
       
        
        double [] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales");
        for (int i = 0; i < precios.length; i++){
            System.out.println("Precio " + (i + 1)+ ": $" + precios [i]);
        }
        
        precios[2]= 129.99;
        
        System.out.println("\nPrecios modificados: ");
        for (int i =0; i < precios.length; i++ ){
              System.out.println("Precio " + (i + 1)+ ": $" + precios [i]);
            
            
        }
    }
}
