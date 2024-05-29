
package recuperatorio2020ejemplo;

public class Empleado extends Personal{
    private double sueldo;


    public Empleado(double sueldo, Departamento departamento, String nombre, String dni) {
        super(departamento, nombre, dni);
        this.sueldo = sueldo;
    }

    @Override
    public double calcularSueldo() {
        return sueldo;
    }
    
    
}
