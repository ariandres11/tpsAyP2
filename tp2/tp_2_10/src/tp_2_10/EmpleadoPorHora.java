package tp_2_10;

public class EmpleadoPorHora extends Empleado {

    double valorHora;
    double horasTrabajadas;

    public EmpleadoPorHora(double valorHora, double horasTrabajadas, int dni, String nombre) {
        super(dni, nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public double calcularSalario(){
        double salario = horasTrabajadas*valorHora;
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " Salario: " +  "$" + this.calcularSalario();
    }

}
