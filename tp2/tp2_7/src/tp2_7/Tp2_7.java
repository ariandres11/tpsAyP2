package tp2_7;

/*Crear instancais y mostrar info asociada*/
public class Tp2_7 {

    public static void main(String[] args) {
        Empleado empleado = new Empleado(44516969, "Ariel");

        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora(1000, 500, 44516969, "Ariel");

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(500000, 44516969, "Ariel");

        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(50, 1000000, 44516969, "Ariel");

        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(500000, 50, 10000000, 44516969, "Ariel");

        //Imprimir la informacion de todos los tipos de empleado
        imprimirEmpleado(empleado);
        System.out.println("    ");
        imprimirEmpleadoPorHora(empleadoPorHora);
        System.out.println("    ");
        imprimirEmpleadoAsalariado(empleadoAsalariado);
        System.out.println("    ");
        imprimirEmpleadoPorComision(empleadoPorComision);
        System.out.println("    ");
        imprimirEmpleadoBaseMasComision(empleadoBaseMasComision);
        System.out.println("    ");
    }

    public static void imprimirEmpleado(Empleado empleado) {
        String nombre = empleado.getNombre();
        int dni = empleado.getDni();

        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("DNI del empleado: " + dni);

    }

    public static void imprimirEmpleadoPorHora(EmpleadoPorHora empleado) {
        String nombre = empleado.getNombre();
        int dni = empleado.getDni();
        double valorHora = empleado.getValorHora();
        double horasTrabajadas = empleado.getHorasTrabajadas();

        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("DNI del empleado: " + dni);
        System.out.println("Valor de la hora: " + valorHora);
        System.out.println("Horas trabajadas: " + horasTrabajadas);

        /*double valorHora, double horasTrabajadas, int dni, String nombre*/
    }

    public static void imprimirEmpleadoAsalariado(EmpleadoAsalariado empleado) {
        String nombre = empleado.getNombre();
        int dni = empleado.getDni();
        double salarioMensual = empleado.getSalarioMensual();

        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("DNI del empleado: " + dni);
        System.out.println("Salario mensual del empleado: " + salarioMensual);

    }

    public static void imprimirEmpleadoPorComision(EmpleadoPorComision empleado) {
        String nombre = empleado.getNombre();
        int dni = empleado.getDni();
        double porcentajeComision = empleado.getPorcentajeComision();
        double ventasBrutas = empleado.getVentasBrutas();

        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("DNI del empleado: " + dni);
        System.out.println("Porcentaje por comision: : " + porcentajeComision);
        System.out.println("Ventas Brutas : " + ventasBrutas);

    }

    public static void imprimirEmpleadoBaseMasComision(EmpleadoBaseMasComision empleado) {
        String nombre = empleado.getNombre();
        int dni = empleado.getDni();
        double salarioBase = empleado.getSalarioBase();
        double porcentajeComision = empleado.getPorcentajeComision();
        double ventasBrutas = empleado.getVentasBrutas();

        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("DNI del empleado: " + dni);
        System.out.println("Porcentaje por comision: : " + porcentajeComision);
        System.out.println("Ventas Brutas : " + ventasBrutas);
        System.out.println("Salario base: " + salarioBase);
        
    }

}
