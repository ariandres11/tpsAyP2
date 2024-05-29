/**
 *
 * @author ariel
 */
public class tp8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Empleado[] empleados = new Empleado[]{
                new EmpleadoBaseMasComision(80000, 50, 230000, 44516727, "Lucia"),
                new EmpleadoAsalariado(40000, 44516969, "Ariel"),
                new EmpleadoPorHora(120,130 ,42516810, "Mariano"),
                new EmpleadoPorComision(30, 40000, 44198208, "Fernando")
        };
        probeHashMap(empleados);


    }

    public static void probeHashMap(Empleado[] empleados){
        ProbeHashMap<String, Empleado> mapa = new ProbeHashMap<>();
        for (Empleado empleado: empleados){
            mapa.put(empleado.getNombre(), empleado);
        }
        System.out.println("Empleados");
        for (Empleado e: mapa.values()){
            System.out.println(e);
            System.out.println("--");
        }
        System.out.println("Empleados con key");
        for(Entry<String, Empleado> e : mapa.entrySet()){
            System.out.println(e);
            System.out.println("--");
        }
        System.out.println("Empleado eliminado" + mapa.remove("Lucia"));
        System.out.println("Keys empleados");
        for (String e: mapa.keySet()){
            System.out.println(e);
            System.out.println("--");
        }

    }

}
