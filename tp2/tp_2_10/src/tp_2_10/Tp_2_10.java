package tp_2_10;

public class Tp_2_10 {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[10];
        EmpleadoAsalariado empleadoAsalariado1 = new EmpleadoAsalariado(500000, 44516969, "Ariel");
        EmpleadoBaseMasComision empleadoBaseMasComision1 = new EmpleadoBaseMasComision(500000, 30, 600000, 44000458, "Juan");
        EmpleadoPorComision empleadoPorComision1 = new EmpleadoPorComision(40, 400000, 29394819, "Marcos");
        EmpleadoPorHora empleadoPorHora1 = new EmpleadoPorHora(3000, 120, 30902563, "Tomas");

        EmpleadoAsalariado empleadoAsalariado2 = new EmpleadoAsalariado(700500, 45036989, "Mariano");
        EmpleadoBaseMasComision empleadoBaseMasComision2 = new EmpleadoBaseMasComision(750000, 20, 600000, 49033454, "Alexis");
        EmpleadoPorComision empleadoPorComision2 = new EmpleadoPorComision(45, 600000, 29394834, "Martin");
        EmpleadoPorHora empleadoPorHora2 = new EmpleadoPorHora(4000, 180, 30902563, "Lucia");

        EmpleadoPorComision empleadoPorComision3 = new EmpleadoPorComision(20, 1000000, 20332864, "Raul");
        EmpleadoAsalariado empleadoAsalariado3 = new EmpleadoAsalariado(150000, 69238921, "Agustin");

        double salario;

        empleados[0] = empleadoAsalariado1;
        empleados[1] = empleadoBaseMasComision1;
        empleados[2] = empleadoPorComision1;
        empleados[3] = empleadoPorHora1;
        empleados[4] = empleadoAsalariado2;
        empleados[5] = empleadoBaseMasComision2;
        empleados[6] = empleadoPorComision2;
        empleados[7] = empleadoPorHora2;
        empleados[8] = empleadoAsalariado3;
        empleados[9] = empleadoPorComision3;


        /*System.out.println(empleadoPorComision.toString());
        System.out.println(empleadoPorHora.toString());
        System.out.println(empleadoAsalariado.toString());*/
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision empleadoASumar10 = (EmpleadoBaseMasComision) empleados[i];
                salario = empleadoASumar10.getSalarioBase();
                salario += ((salario / 100) * 10);
                System.out.println(empleadoASumar10.toString());
                System.out.println("Salario total (+ %10): " + "$" + salario);
                System.out.println(" ");
            } else {
                System.out.println(empleados[i].toString());
                System.out.println(" ");
            }
        }

    }

}
