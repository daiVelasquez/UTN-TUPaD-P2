/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.Ej.DependenciaDeUso;

/**
12) Impuesto - Contribuyente - Calculadora 
    a. Asociación unidireccional: Impuesto → Contribuyente 
    b. Dependencia de uso: Calculadora.calcular(Impuesto) 
    Clases y atributos: 
    -Impuesto: monto. 
    -Contribuyente: nombre, cuil. 
    -Calculadora->método: void calcular(Impuesto impuesto)
 */

class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }

    @Override
    public String toString() {
        return "Contribuyente [nombre=" + nombre + ", cuil=" + cuil + "]";
    }
}

// Clase Impuesto (asociación unidireccional con Contribuyente)
class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    @Override
    public String toString() {
        return "Impuesto [monto=" + monto + ", contribuyente=" + contribuyente.getNombre() + "]";
    }
}

// Clase Calculadora (dependencia de uso: calcular)
class Calculadora {
    // Método que usa Impuesto como parámetro (dependencia de uso)
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto para " + impuesto.getContribuyente().getNombre() +
                           " - Monto: $" + impuesto.getMonto());
    }
}


public class MainImpuesto {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Ana Torres", "20322111");
        Impuesto impuesto = new Impuesto(15000.50, contribuyente);
        Calculadora calculadora = new Calculadora();

        System.out.println(impuesto); 
        calculadora.calcular(impuesto); // Dependencia de uso
    }
}


/*
Asociación unidireccional (→):
Impuesto → Contribuyente
Cada impuesto está asociado a un único contribuyente. El contribuyente no necesita saber sobre el impuesto.
Cardinalidad (1 a 1)

Dependencia de uso (..>):
Calculadora ..> Impuesto
La calculadora usa un impuesto como parámetro del método calcular(), pero no lo almacena como atributo. 
Es una relación temporal de uso, no permanente.
*/