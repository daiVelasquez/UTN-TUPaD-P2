/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

/*Suma de Números Pares (while).  
Escribe un programa que solicite números al usuario y sume solo los 
números pares. El ciclo debe continuar hasta que el usuario ingrese el número 
0, momento en el que se debe mostrar la suma total de los pares ingresados.
 */
public class SumaNumerosPares {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int num;
        int sumaPares= 0;
        
        System.out.println("Ingrese números.Solo se sumarán los pares. Ingrese 0 para terminar.");
        System.out.print("Número: ");
        num = input.nextInt();
        
        while(num != 0){
            if (num % 2 == 0){
                sumaPares = sumaPares + num;
            }
            System.out.print("Número: ");
            num = input.nextInt(); //actualizamos la variable dentro de bucle. asi se evalua la condición.
    }
        System.out.println("La suma de los números es: " + sumaPares);
    }
}
