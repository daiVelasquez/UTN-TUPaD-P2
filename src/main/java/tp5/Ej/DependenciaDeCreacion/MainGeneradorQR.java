/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.Ej.DependenciaDeCreacion;

/**
13) GeneradorQR - Usuario - CódigoQR 
    a. Asociación unidireccional: CódigoQR → Usuario 
    b. Dependencia de creación: GeneradorQR.generar(String, Usuario) 
    Clases y atributos: 
    -CodigoQR: valor. 
    -Usuario: nombre, email. 
    -GeneradorQR->método: void generar(String valor, Usuario usuario) 
 */

class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", email=" + email + "]";
    }
}

// Clase CodigoQR (asociación unidireccional con Usuario)
class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR [valor=" + valor + ", usuario=" + usuario.getNombre() + "]";
    }
}

// Clase GeneradorQR (dependencia de creación)
class GeneradorQR {

    // Método que crea un CódigoQR usando Usuario y valor
    public CodigoQR generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario); // Dependencia de creación
        System.out.println("QR generado: " + codigo);
        return codigo;
    }
}

public class MainGeneradorQR {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Laura Gómez", "laura@gmail.com");
        GeneradorQR generador = new GeneradorQR();

        // Generar un código QR (dependencia de creación)
        CodigoQR qr = generador.generar("QR12345", usuario);
    }
}

/*
Asociación unidireccional (→):
CódigoQR → Usuario
Cada código QR está asociado a un único usuario. El usuario no conoce sus códigos generados.
Cardinalidad (1 a 1)

Dependencia de creación (..>):
GeneradorQR ..> CodigoQR
El generador crea instancias de CódigoQR dentro del método generar(). 
La relación es temporal: el generador usa al usuario como parámetro para crear el QR, pero no lo almacena como atributo.
*/