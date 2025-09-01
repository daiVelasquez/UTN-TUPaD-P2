/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana1;

import java.util.Scanner;

/**
  Manejar conversiones de tipo y división en Java.  
a. Escribe un programa que divida dos números enteros ingresados por el 
usuario.  
b. Modifica el código para usar double en lugar de int y compara los 
resultados.
 */
public class ConversionesDeTipo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        int num1,num2,division;
        
        System.out.println("Ingrese dos números enteros");
        System.out.println("Ingese el primer número: ");
        num1= input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        
        division = num1/num2;
        double  divisionConDecimal = (double) num1/num2;
         
         System.out.println("Division con Int: "+division+ "\nDivision con double: "+divisionConDecimal);
           
    }
}
