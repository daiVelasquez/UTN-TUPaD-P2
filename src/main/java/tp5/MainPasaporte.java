/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;
import java.util.Date;
/*
1) Pasaporte - Foto - Titular 
  a. Composición: Pasaporte → Foto 
  b. Asociación bidireccional: Pasaporte ↔ Titular 
  Clases y atributos: 
  -Pasaporte: numero, fechaEmision 
  -Foto: imagen, formato 
  -Titular: nombre, dni 
 */

class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto [imagen=" + imagen + ", formato=" + formato + "]";
    }
}

// Clase Titular (Asociación bidireccional con Pasaporte)
class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociación bidireccional

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

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
}

// Clase Pasaporte (Asociación ↔ Titular, Composición → Foto)
class Pasaporte {
    private String numero;
    private Date fechaEmision;
    private Foto foto;          // Composición
    private Titular titular;    // Asociación bidireccional

    public Pasaporte(String numero, Date fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        titular.setPasaporte(this); // establecer la relación bidireccional
    }

    public String getNumero() {
        return numero;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void mostrarInfo() {
        System.out.println("=== Datos del Pasaporte ===");
        System.out.println("Número: " + numero);
        System.out.println("Fecha de emisión: " + fechaEmision);
        System.out.println("Foto: " + foto);
        System.out.println("Titular: " + titular.getNombre() + " (DNI: " + titular.getDni() + ")");
    }
}


public class MainPasaporte {
    public static void main(String[] args) {
        Foto foto = new Foto("foto123.jpg", "JPEG");
        Titular titular = new Titular("Juan Pérez", "32145678");
        Pasaporte pasaporte = new Pasaporte("AR123456", new Date(), foto, titular);

        pasaporte.mostrarInfo();
        System.out.println("El titular accede a su pasaporte: " + titular.getPasaporte().getNumero());
    }
}

/*
Composición:
Pasaporte contiene a Foto. Si el pasaporte se elimina, la foto no tiene sentido fuera de él.

Asociación bidireccional:
Pasaporte conoce a su Titular, y el Titular conoce su Pasaporte.
Esto se logra asignando titular.setPasaporte(this) dentro del constructor del Pasaporte.
 */