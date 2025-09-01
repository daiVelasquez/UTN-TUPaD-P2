/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

/*
Escribe un programa en Java que solicite al usuario un año y determine si es 
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea 
divisible por 400.
 */
public class AnioBisiesto {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un año: ");
        int anio= input.nextInt();
        
        if ((anio % 4 == 0 && anio % 100 != 0 ) || (anio % 400 == 0)){
            System.out.println(anio + " es un año bisiesto");
        } else {
            System.out.println(anio + " no es un año bisiesto");
        }
        
        
    }
    
}
