
package recuperatorio2020ejemplo;

import java.util.Objects;


public abstract class Personal{
    public Departamento departamento;
    private String nombre;
    private String dni;

    public Personal(Departamento departamento, String nombre, String dni) {
        this.departamento = departamento;
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Personal{" + "departamento=" + departamento + ", nombre=" + nombre + ", dni=" + dni + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personal other = (Personal) obj;
        return Objects.equals(this.dni, other.dni);
    }
    
    
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public abstract double calcularSueldo();
}
