/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7.KATA3;

import java.util.List;

/**
 *
 * @author feliz
 */
public class MainKata4 {
    public static void main(String[] args) {
    
        List<Empleado> empleados = List.of(
        new EmpleadoPlanta("Ana", 300000),
        new EmpleadoTemporal("Luis", 80, 1500)
    );

        for (Empleado e : empleados) {
        System.out.println("Empleado: " + e.nombre +
                       ", Sueldo = " + e.calcularSueldo());

        if (e instanceof EmpleadoPlanta) {
        System.out.println(" → Es un empleado de planta");
        } else if (e instanceof EmpleadoTemporal) {
        System.out.println(" → Es un empleado temporal");
        }
        }
        
    }
}
