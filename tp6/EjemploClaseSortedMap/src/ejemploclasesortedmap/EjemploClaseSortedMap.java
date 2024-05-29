package ejemploclasesortedmap;


/**
 *
 * @author ariel
 */
public class EjemploClaseSortedMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empleado e1 = new Empleado(44947428, "Lucia");
        Empleado e2 = new Empleado(44516969, "Ariel");
        Empleado e3 = new Empleado(41127031, "Mariano");

        Empleado[] empleados = new Empleado[3];

        empleados[0] = e1;
        empleados[1] = e2;
        empleados[2] = e3;

        Map<Integer, String> map = new SortedTableMap<Integer, String>();

        for (Empleado empleado : empleados) {
            map.put(empleado.dni, empleado.nombre);
        }
        for (Entry<Integer, String> entry : map.entrySet()) {
                    System.out.println(map.get(entry.getKey()));

        }

    }

}
