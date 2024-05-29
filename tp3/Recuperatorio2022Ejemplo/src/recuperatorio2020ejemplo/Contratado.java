package recuperatorio2020ejemplo;

public class Contratado extends Personal {

    private double valorHora;
    private double cantHoras;

    public Contratado(double valorHora, double cantHoras, Departamento departamento, String nombre, String dni) {
        super(departamento, nombre, dni);
        this.valorHora = valorHora;
        this.cantHoras = cantHoras;
    }

    @Override
    public double calcularSueldo() {
        double total = valorHora * cantHoras;
        return total;
    }
    
    
}
