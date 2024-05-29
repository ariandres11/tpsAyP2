
package tp5_7;

/**
 *
 * @author ariel Consigna: 7. Utilizar una cola para cargar empleados y facturas (ejercicio 2.11). Calcular los importes a pagar.
 */
public class Tp5_7 {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue<>();

        //Crear empleados
        Empleado e1 = new Empleado(4562, "Ariel", null, 180, 6000);
        Empleado e2 = new Empleado(7618, "Lucas", e1, 120, 3500);
        Empleado e3 = new Empleado(902, "Matias", null, 130, 7000);

        //Crear facturas
        Factura f1 = new Factura("Ariel S.A", 78234, "12/05/2024");
        Factura f2 = new Factura("Caracoles", 90231, "10/08/2023");
        Factura f3 = new Factura("Carlos Gimenez", 89126, "15/01/2021");

        
        //Agregar items
        f1.agregarItem("Tornillos", 100, 15);
        f1.agregarItem("Sommier", 1, 1500);
        f1.agregarItem("Machimbre", 120, 500);

        f2.agregarItem("Madera", 160, 500);
        f2.agregarItem("Alambre", 150, 350);

        f3.agregarItem("Madera", 120, 500);

        //Agregar a la cola
        queue.enqueue(e1);
        queue.enqueue(e2);
        queue.enqueue(e3);
        queue.enqueue(f1);
        queue.enqueue(f2);
        queue.enqueue(f3);


        for (int i = 0; !queue.isEmpty() ;i++) {
            //busco el objeto
            PorPagar porPagar = (PorPagar) queue.dequeue();
            System.out.println(" Pagar: " + porPagar.obtenerPago());
        }

    }

}
