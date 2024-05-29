package recuperatorio2020ejemplo;

public class Recuperatorio2020Ejemplo {

    public static void main(String[] args) {
        //Creando deptos
        Departamento dep1 = new Departamento(3, "Departamento de Marketing");
        Departamento dep2 = new Departamento(2, "Departamento de Arte y Diseño");
        Departamento dep3 = new Departamento(5, "Departamento de Contabilidad");

        //Creando empresa
        Empresa empresa = new Empresa("Ariel SA");
        //Dep1
        empresa.agregarEmpleado("Matias Fernandez", "44.516.969", dep1, 30000);
        empresa.agregarEmpleado("Jose Hernandez", "49.810.002", dep1, 70000);
        empresa.agregarContratado(1000, 100, dep1, "Tomas Gonzalez", "40.329.410");
        //Dep2
        empresa.agregarEmpleado("Manuel Herrera", "27.567.091", dep2, 1000000);
        //Dep3
        empresa.agregarContratado(1000, 120, dep3, "Mariano Rivero", "37.620.913");

        System.out.println("Total a pagar:");

        System.out.println(empresa.calcularSueldo());

        System.out.println("Total a pagar depto 1:");
        System.out.println(empresa.calcularSueldo(dep1));

        System.out.println("Total a pagar depto 2:");
        System.out.println(empresa.calcularSueldo(dep2));

        System.out.println("Total a pagar depto 3:");
        System.out.println(empresa.calcularSueldo(dep3));

    }
}
