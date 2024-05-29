package Punto1y2;

/**
 *
 * @author Ariel Sebastián Andrés
 */
public class Prueba {

    public static void main(String[] args) {

        Cliente clientes[] = new Cliente[8];

        //Asignacion de servicios
        Servicio servicio1 = new Servicio(1, "25 mbits fibra +optica");
        Servicio servicio2 = new Servicio(2, "50 mbits fibra óptica");
        Servicio servicio3 = new Servicio(3, "50 mbits fibra óptica");
        Servicio servicio4 = new Servicio(4, "100 mbits fibra óptica");

        //Asignacion tipos de servicios
        TipoServicio tipoServicio1 = new TipoServicio(1, "Basico");
        TipoServicio tipoServicio2 = new TipoServicio(2, "Premium");

        //Asignacion planes
        Plan plan1 = new Plan(18500, tipoServicio1, servicio1);
        Plan plan2 = new Plan(21700, tipoServicio1, servicio2);

        Plan plan3 = new Plan(37100, tipoServicio2, servicio3);
        Plan plan4 = new Plan(54500, tipoServicio2, servicio4);

        //Asignacion clientes
        Persona persona1 = new Persona("Lucia", 429, plan1);
        Persona persona2 = new Persona("Mariano", 982, plan2);
        Persona persona3 = new Persona("Ariel", 473, plan3);
        Persona persona4 = new Persona("Tomas", 493, plan4);

        //Asignacion empresas
        Empresa empresa1 = new Empresa("Red Uno", false, 402, plan1);
        Empresa empresa2 = new Empresa("Universidad de la Patagonia", true, 450, plan2);
        Empresa empresa3 = new Empresa("Almacen Juancito", false, 480, plan3);
        Empresa empresa4 = new Empresa("Universidad del Chubut", true, 471, plan4);

        //Asignacion de planes a distintos clientes
        //Personas
        clientes[0] = persona1;
        clientes[1] = persona2;
        clientes[2] = persona3;
        clientes[3] = persona4;

        clientes[4] = empresa1;
        clientes[5] = empresa2;
        clientes[6] = empresa3;
        clientes[7] = empresa4;

        //Punto c
        double totalClientes = 0;
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("\n ID del cliente: " + clientes[i].getId());
            System.out.println("Factura: " + clientes[i].calcularFactura());
            totalClientes += clientes[i].calcularFactura();
        }
        //Luego de recorrer el array imprimo el total a pagar de todos los clientes
        System.out.println("\nTotal a pagar de todos los clientes: " + totalClientes);

        //Punto D
        System.out.println("\nMostrando datos de los clientes que tienen serivicio de 50 mbits de fibra optica ");
        double totalClientes50Mbits = 0;
        for (int i = 0; i < clientes.length; i++) {
            //Planes 2 y 3 son los de 50 mbits fibra optica
            if (clientes[i].getPlan().getServicio().equals(servicio2) || clientes[i].getPlan().getServicio().equals(servicio3)) {
                //Es de los planes de 50 mbits
                System.out.println("\n ID del cliente: " + clientes[i].getId());
                System.out.println("Factura: " + clientes[i].calcularFactura());
                totalClientes50Mbits += clientes[i].calcularFactura();
            }
        }
        System.out.println("\nTotal a pagar por clientes que tienen el servicio de 50 mbits de fibra optica: " + totalClientes50Mbits);
    }

}
