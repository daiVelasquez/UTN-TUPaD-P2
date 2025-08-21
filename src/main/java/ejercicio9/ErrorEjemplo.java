/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 Corrige el siguiente código para que funcione correctamente. Explica qué error 
tenía y cómo lo solucionaste. 
import java.util.Scanner; 
public class ErrorEjemplo { 
public static void main(String[] args) { 
Scanner inpu = new Scanner(System.in); 
System.out.print("Ingresa tu nombre: "); 
String nombre = input.nextInt(); // ERROR 
System.out.println("Hola, " + nombre); 
} 
}
 */
public class ErrorEjemplo {
    public static void main (String[] args){
            Scanner input = new Scanner(System.in);  
            System.out.println("Ingresa tu nombre");
            
            String nombre = input.nextLine(); // Remplacé nextInt por nextLine ya que estamos recibiendo un String y no un Integer.
            
            System.out.println("Hola, " + nombre);
    }
    
}
