/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 Crea un programa que declare las siguientes variables con valores asignados: 
a. String nombre  
b. int edad  
c. double altura  
d. boolean estudiante 
Imprime los valores en pantalla usando System.out.println().
 */
public class variablesDeclaracion {
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
    
        String nombre = "Daiana";
        int edad = 28;
        double altura = 1.55;
        boolean estudiante = true;
        
       
        
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("altura: " + altura );
        System.out.println("estudiante: " + estudiante);
      
              

    }
}
