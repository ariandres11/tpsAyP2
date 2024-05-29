package tp5_2;

import java.util.Stack;

public class Tp5_2 {

    /*Consigna:
    2. Utilizar una pila para cargar una nómina de empleados (ejercicio 2.10).
    Calcular el sueldo para cada uno de ellos. */
    public static void main(String[] args) {
        Stack stack = new Stack();

        //Creacion de empleados
        EmpleadoAsalariado e1 = new EmpleadoAsalariado(20000, 89234109, "Lucia");
        EmpleadoBaseMasComision e3 = new EmpleadoBaseMasComision(40000, 30, 90000, 80234165, "Luis");
        EmpleadoPorComision e4 = new EmpleadoPorComision(50, 50000, 23451892, "Maria");
        EmpleadoPorHora e5 = new EmpleadoPorHora(8000, 100, 25725911, "Jose");

        stack.add(e1);
        stack.add(e3);
        stack.add(e4);
        stack.add(e5);

        for (int i = 0; !stack.isEmpty(); i++) {
            Empleado empleado = (Empleado) stack.firstElement();
            System.out.println("Nombre del empleado : " + empleado.getNombre() + " Sueldo : " + empleado.calcularSalario());
            stack.remove(empleado);
        }
        
    }

}
