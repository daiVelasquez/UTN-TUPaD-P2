/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.KATA4;

import java.util.List;


public class MainKata4 {
     public static void main(String[] args) {
     
         List<Animal> animales = List.of(
        new Perro("Bobby"),
        new Gato("Michi"),
        new Vaca("Lola")
        );

        for (Animal a : animales) {
        a.describirAnimal();
        a.hacerSonido();
        System.out.println();
        }
         
     }
}
