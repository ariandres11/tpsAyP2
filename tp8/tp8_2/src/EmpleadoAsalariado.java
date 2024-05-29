public class EmpleadoAsalariado extends Empleado{
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
    
    
    
    
    
    
}
