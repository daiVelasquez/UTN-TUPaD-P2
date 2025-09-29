/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana4;

/**
 *
 * @author feliz
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    //Atributos estáticos 
    private static int contadorId  = 1;
    private static int totalEmpleados = 0;
    
    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;                 // uso de this
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;             // incrementa total
    }

    // Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = contadorId++;       // id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000;         // salario por defecto
        totalEmpleados++;             // incrementa total
    }

    // Métodos sobrecargados para actualizarSalario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // toString()
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre +
               ", Puesto=" + puesto + ", Salario=$" + salario + "]";
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
    

