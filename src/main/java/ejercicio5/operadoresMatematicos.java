/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/*Escribe un programa que solicite dos números enteros y realice las siguientes 
operaciones:   
a. Suma   
b. Resta   
c. Multiplicación   
d. División  
Muestra los resultados en la consola.*/

public class operadoresMatematicos {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
       int num1,num2, suma, resta, multip,division;
       
        System.out.println("Ingrese dos números enteros");
        System.out.println("Ingese el primer Número");
        num1= input.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = input.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multip = num1* num2;
        division = num1/num2;
        
        System.out.println("Resultado: " + "\nSuma:" + suma + "\nResta: " + resta + "\nMultiplicación: " + multip + "\nDivisión: " + division) ;
             
        
    }
    
}
