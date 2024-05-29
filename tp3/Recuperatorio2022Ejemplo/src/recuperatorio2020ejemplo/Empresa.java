package recuperatorio2020ejemplo;

public class Empresa {

    private String nombre;
    private static final int MAX_PERSONAL = 100;
    public Personal personal[] = new Personal[MAX_PERSONAL];
    private int cantidadPersonal;

    
    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personal agregarEmpleado(String nombre, String dni, Departamento departamento, double sueldo) {
        if (cantidadPersonal < MAX_PERSONAL) {
            Empleado empleado1 = new Empleado(sueldo, departamento, nombre, dni);
            personal[cantidadPersonal++] = empleado1;
            return empleado1;
        } else {
            System.out.println("No se pudo agregar el empleado porque supera el máximo permitido");
            return null;
        }
    }

    public Personal agregarContratado(double valorHora, double cantHoras, Departamento departamento, String nombre, String dni) {
        if (cantidadPersonal < MAX_PERSONAL) {
            Contratado contratado1 = new Contratado(valorHora, cantHoras, departamento, nombre, dni);
            personal[cantidadPersonal++] = contratado1;
            return contratado1;
        } else {
            System.out.println("No se pudo agregar el contratado porque supera el máximo permitido");
            return null;
        }
    }

    public double calcularSueldo() {
        double total = 0;

        for (int i = 0; i < cantidadPersonal; i++) {
            total += personal[i].calcularSueldo();
        }

        return total;
    }

    public double calcularSueldo(Departamento departamento) {
        double total = 0;
        for (int i = 0; i < cantidadPersonal; i++) {
            if (personal[i].getDepartamento().equals(departamento)) {
                total += personal[i].calcularSueldo();
            }
        }
        return total;
    }
}
