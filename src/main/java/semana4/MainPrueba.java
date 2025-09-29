/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana4;

/**
 *
 * @author feliz
 */
public class MainPrueba {
    
     public static void main(String[] args) {
        // Usando constructor con todos los atributos
        Empleado e1 = new Empleado(101, "Carla", "Desarrolladora", 80000);
        Empleado e2 = new Empleado(102, "Diego", "Analista", 75000);

        // Usando constructor con nombre y puesto
        Empleado e3 = new Empleado("Sofía", "Tester");
        Empleado e4 = new Empleado("Luis", "Administrador");

        // Actualizar salarios
        e1.actualizarSalario(10.0);      // +10%
        e3.actualizarSalario(5000);    // +$5000

        // Imprimir información
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar total empleados
        System.out.println("Total de empleados creados: " +
                           Empleado.mostrarTotalEmpleados());
    }
    
}
