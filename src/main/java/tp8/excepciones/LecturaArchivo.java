/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LecturaArchivo {
    public static void main(String[] args) {

        try {
            File archivo = new File("archivo.txt"); // Debe existir en el proyecto
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        }
    }
}
