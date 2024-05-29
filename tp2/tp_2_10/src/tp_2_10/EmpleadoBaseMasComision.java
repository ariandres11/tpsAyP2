package tp_2_10;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    double salarioBase;

    public EmpleadoBaseMasComision(double salarioBase, double porcentajeComision, double ventasBrutas, int dni, String nombre) {
        super(porcentajeComision, ventasBrutas, dni, nombre);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    /*
    @Override
    public String toString() {
        return "Empleado: " + nombre + " Salario: ";
    }*/

}
