
package modelo;

/**
 *
 * @author Erika
 */
public class Directivo extends Empleado{
    private String categoria;
    public Directivo(long id, String nombre, String apellido, String cedula, String direccion, double sueldoBruto) {
        super(id, nombre, apellido, cedula, direccion, sueldoBruto);
    }

    public Directivo(long id, String nombre,String apellido, String cedula, String direccion, double sueldoBruto, String categoria) {
        super(id, nombre, apellido, cedula, direccion, sueldoBruto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Directivo{" + "categoria=" + categoria + super.toString() +'}';
    }
    
}
