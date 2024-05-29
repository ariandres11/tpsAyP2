package tp_2_11;

public class ClasePrueba {

    public static void main(String[] args) {
        //Facturas
        Factura factura1 = new Factura("Ariel y Hnos ", 44516, "11/03/2024");
        Factura factura2 = new Factura("Martinez y asociados ", 44510, "09/11/2023");
        Factura factura3 = new Factura("DEL insumos en gral ", 44520, "23/03/2024");
        Factura factura4 = new Factura("Fabri SA ", 45470, "30/04/2024");
        Factura factura5 = new Factura("Arrecife SA ", 44518, "16/03/2024");

        //Empleados
        Empleado empleado1 = new Empleado(1201, "Lucia", null, 120, 2000);
        Empleado empleado2 = new Empleado(1380, "Rodrigo", empleado1, 140, 1200);
        Empleado empleado3 = new Empleado(1593, "Agustin", empleado1, 135, 1200);
        Empleado empleado4 = new Empleado(2043, "Sebastian", empleado2, 140, 800);
        Empleado empleado5 = new Empleado(2043, "Juan", null, 120, 1900);

        //Factura 1
        factura1.agregarItem("Tornillos", 20, 150);
        factura1.agregarItem("Alambre", 30, 100);
        //Factura 2
        factura2.agregarItem("Cemento", 10, 2500);
        factura2.agregarItem("Madera", 60, 1000);
        factura2.agregarItem("Cal", 20, 500);
        //Factura 3
        factura3.agregarItem("Varillas", 100, 450);
        factura3.agregarItem("Madera", 60, 1000);
        //Factura 4
        factura4.agregarItem("Alambre", 25, 100);
        factura4.agregarItem("Madera", 50, 1000);
        factura4.agregarItem("Machimbre", 50, 500);
        factura4.agregarItem("Cemento", 100, 450);
        //Factura 5
        factura5.agregarItem("Varillas", 100, 450);
        factura5.agregarItem("Tornillos", 150, 150);
        factura5.agregarItem("Vigas", 10, 900);
        factura5.agregarItem("Alambre", 25, 100);
        factura5.agregarItem("Machimbre", 5, 500);
        factura5.agregarItem("Cemento", 100, 450);
        factura5.agregarItem("Cal", 10, 500);
        factura5.agregarItem("Madera", 100, 1000);

        PorPagar pagos[] = new PorPagar[10];
        pagos[0] = factura1;
        pagos[1] = factura2;
        pagos[2] = factura3;
        pagos[3] = factura4;
        pagos[4] = factura5;
        pagos[5] = empleado1;
        pagos[6] = empleado2;
        pagos[7] = empleado3;
        pagos[8] = empleado4;
        pagos[9] = empleado5;

        //Escribir pagos
        System.out.println("Montos a pagar: ");
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            if (pagos[i] instanceof Empleado) {
                //Es un empleado
                Empleado empleado = (Empleado) pagos[i];
                System.out.println(pagos[i]);
                System.out.println("Total a pagar: $ " + empleado.obtenerPago());
                System.out.println(" ");

            } else {
                //Es una factura
                Factura factura = (Factura) pagos[i];
                System.out.println(pagos[i]);
                System.out.println("Total a pagar: $ " + factura.obtenerPago());
                System.out.println(" ");
            }
        }
    }

}
