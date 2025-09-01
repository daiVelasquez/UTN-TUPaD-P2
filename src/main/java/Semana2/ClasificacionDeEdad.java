/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

/* Escribe un programa en Java que solicite al usuario su edad y clasifique su 
etapa de vida según la siguiente tabla: 
Menor de 12 años: "Niño" 
Entre 12 y 17 años: "Adolescente" 
Entre 18 y 59 años: "Adulto" 
60 años o más: "Adulto mayor" 
 */
public class ClasificacionDeEdad {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();
        
        if (edad < 12){
            System.out.println("Eres un niño");
        } else if (edad <= 17 ){
            System.out.println("Eres un adolecente");
        } else if (edad  <=59) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        } 
        
    }
        
}
