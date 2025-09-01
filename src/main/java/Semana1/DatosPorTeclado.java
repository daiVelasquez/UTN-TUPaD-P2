/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Semana1;

/*Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego 
los muestre en pantalla. Usa Scanner para capturar los datos.*/ 

import java.util.Scanner;

/**
 *
 * @author feliz
 */
public class DatosPorTeclado {

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    String nombre;
    int edad;
    
    System.out.print("Ingrese nombre: ");
    nombre= input.nextLine();
    System.out.print("Ingrese edad: ");
    edad= input.nextInt();
    
    System.out.println("Datos ingresados :\n" + nombre + "\n" + edad);
    
}
}
