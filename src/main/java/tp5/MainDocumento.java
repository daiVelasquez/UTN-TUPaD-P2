/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/*
7)  Documento - FirmaDigital - Usuario 
    a. Composición: Documento → FirmaDigital 
    b. Agregación: FirmaDigital → Usuario 
    Clases y atributos:  
    -Documento: titulo, contenido 
    -FirmaDigital: codigoHash, fecha 
    -Usuario: nombre, email
 */

// Clase Usuario (agregada en FirmaDigital)
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

// Clase FirmaDigital (Composición con Documento y Agregación con Usuario)
class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; // Agregación → la firma usa un usuario, pero no lo posee

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital [codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario.getNombre() + "]";
    }
}

// Clase Documento (Composición → FirmaDigital)
class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composición

    public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = firmaDigital;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    public void mostrarInfo() {
        System.out.println("=== Documento ===");
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Firma: " + firmaDigital);
        System.out.println("Firmado por: " + firmaDigital.getUsuario().getNombre());
    }
}

public class MainDocumento {
     public static void main(String[] args) {
        Usuario usuario = new Usuario("Laura Gómez", "laura.gomez@example.com");
        FirmaDigital firma = new FirmaDigital("HASH-ABCD1234", "2025-10-18", usuario);
        Documento documento = new Documento("Contrato de Servicios", "Contenido del contrato...", firma);

        documento.mostrarInfo();
    }
}

/*
Composición: Documento → FirmaDigital
La FirmaDigital pertenece al Documento.
Si el documento se elimina, también desaparece su firma digital.
Representado con un rombo negro.

Agregación: FirmaDigital → Usuario
La FirmaDigital usa un Usuario, pero no lo posee.
El usuario puede existir sin la firma (por ejemplo, un usuario que aún no ha firmado nada).
Representado con un rombo blanco.

Multiplicidad:

1 Documento contiene 1 FirmaDigital.
1 FirmaDigital se asocia a 1 Usuario.
1 Usuario puede estar vinculado a varias firmas digitales.
*/