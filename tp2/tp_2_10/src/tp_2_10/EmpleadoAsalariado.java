package tp_2_10;

public class EmpleadoAsalariado extends Empleado {

    double salarioMensual;

    public EmpleadoAsalariado(double salarioMensual, int dni, String nombre) {
        super(dni, nombre);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " Salario: " + "$" + getSalarioMensual();
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;

    }

}
