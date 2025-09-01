/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

/*Escribe un programa en Java que pida al usuario tres números enteros y 
determine cuál es el mayor. 
 */
public class MayorDeTresNum {
    public static void main (String[] args ){
      Scanner input = new Scanner (System.in);
        System.out.println("Ingresar 3 números enteros");
        
        int num= 0;
        int mayor=0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese número:");
            num= input.nextInt();
            if (num > mayor){
                mayor = num;
            }
               
        }
        System.out.println("El número mayor ingresado es: " + mayor);
    }
}
