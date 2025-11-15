/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
10) CuentaBancaria - ClaveSeguridad - Titular 
    a. Composición: CuentaBancaria → ClaveSeguridad 
    b. Asociación bidireccional: CuentaBancaria ↔ Titular 
    Clases y atributos:  
    -CuentaBancaria: cbu, saldo 
    -ClaveSeguridad: codigo, ultimaModificacion 
    -Titular: nombre, dni. 
 */

// Clase Titular (asociación bidireccional con CuentaBancaria)
class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    private CuentaBancaria cuenta; // referencia bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public Pasaporte getPasaporte() {
    return pasaporte;
}

    public void setPasaporte(Pasaporte pasaporte) {
    this.pasaporte = pasaporte;
    }
    
    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
}

// Clase ClaveSeguridad (composición dentro de CuentaBancaria)
class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad [codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + "]";
    }
}

// Clase CuentaBancaria
class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // composición
    private Titular titular; // asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad claveSeguridad, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = claveSeguridad;
        this.titular = titular;
        titular.setCuenta(this); // vínculo bidireccional
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    public void mostrarInfo() {
        System.out.println("=== Cuenta Bancaria ===");
        System.out.println("CBU: " + cbu);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Titular: " + titular.getNombre() + " - DNI: " + titular.getDni());
        System.out.println("Clave de seguridad: " + claveSeguridad);
    }
}

public class MainCuentaBancaria {
    public static void main(String[] args) {
        Titular titular = new Titular("Carlos Pérez", "40322110");
        ClaveSeguridad clave = new ClaveSeguridad("A1B2C3", "2025-10-15");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 250000.50, clave, titular);

        cuenta.mostrarInfo();

        // Verificación de la relación bidireccional
        System.out.println("\nDesde el Titular: " + titular.getCuenta().getCbu());
    }
    
}

/*
Asociación unidireccional (→):
CuentaBancaria → ClaveSeguridad Composicion Unidirecional 
La clave de seguridad pertenece exclusivamente a la cuenta bancaria. Si la cuenta se elimina, la clave también desaparece.

cardinalidad(1 a 1)
CuentaBancaria ↔ Titular Asociacion Bidireccional.
El titular conoce su cuenta, y la cuenta conoce a su titular. Ambos mantienen referencias entre sí.

*/