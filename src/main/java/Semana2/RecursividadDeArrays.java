/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

/*
 Impresión recursiva de arrays antes y después de modificar un elemento. 
Crea un programa que: 
a. Declare e inicialice un array con los precios de algunos productos. 
b. Use una función recursiva para mostrar los precios originales. 
c. Modifique el precio de un producto específico. 
d. Use otra función recursiva para mostrar los valores modificados.
 */
public class RecursividadDeArrays {
    
    //Funcion recursiva que imprime erl array
    public static void imprimirArray(double[] precios, int indice){
        if (indice < precios.length){
            System.out.println("Precios: $" + precios[indice]);
            imprimirArray(precios, indice + 1);
        }
    }
    
    public static void main(String[] args){
        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        imprimirArray(precios, 0 );
        
        
        precios[2]= 129.99;
        
        System.out.println("\nPrecios modificados: ");
        imprimirArray(precios,0);
    }
}
