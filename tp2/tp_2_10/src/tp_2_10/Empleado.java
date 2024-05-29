
package tp_2_10;


public abstract class Empleado{
    int dni;
    String nombre;

    public Empleado(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public Empleado() {
    }

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
    
    public abstract double calcularSalario();
    
    
}
