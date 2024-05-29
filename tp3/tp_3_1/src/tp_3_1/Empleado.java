package tp_3_1;

/**
 * Esta es la clase Empleado en la cual se define la estructura de un objeto Empleado y sus métodos
 * @author Ariel Sebastian Andres
 * @version 1.0
 */
public class Empleado {

    int dni;
    String nombre;

    /**
     * Constructor
     */
    public Empleado(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    /**
     * Constructor vacio
     */
    public Empleado() {
    }

    /**
     * Metodos getters y setters
     */
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return objeto mediante un unico string
     */
    public String toString() {
        return "\nNombre: " + nombre + "\nDNI: " + dni;
    }

}
