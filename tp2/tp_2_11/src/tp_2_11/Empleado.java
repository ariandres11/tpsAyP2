package tp_2_11;

public class Empleado implements PorPagar {

    int legajo;
    String nombre;
    Empleado supervisor;
    int horasTrabajadas;
    double valorHora;

    public Empleado() {
    }

    public Empleado(int legajo, String nombre, Empleado supervisor, int horasTrabajadas, double valorHora) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.supervisor = supervisor;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double obtenerPago() {
        double salario = horasTrabajadas * valorHora;
        return salario;
    }

    @Override
    public String toString() {
        if (supervisor != null) {
            return "\nEmpleado Legajo numero " + legajo + ", \n Nombre: " + nombre + ", \nHoras trabajadas: " + horasTrabajadas
                    + ", \nValor por hora: " + valorHora + ", \nSupervisor a cargo: " + supervisor.getNombre();
        }
        return "\nEmpleado Legajo numero " + legajo + ", \nNombre: " + nombre + ", \nHoras trabajadas: " + horasTrabajadas
                + ", \nValor por hora: " + valorHora;
    }
}
