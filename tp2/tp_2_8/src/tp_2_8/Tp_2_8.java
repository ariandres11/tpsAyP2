package tp_2_8;

import java.util.Scanner;

public class Tp_2_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cliente cliente = new Cliente("Ariel", 2345168, "Chubut 1000", "ariel@gmail.com");
        CajaAhorro cajaAhorro = new CajaAhorro(126789, "Ariel", 30000);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(0, 129067, "Ariel", 40000);
        
        
        System.out.println(cliente);
        System.out.println("A que cuenta desea acceder?: ");
        System.out.println(" ");
        System.out.println("    0. CAJA DE AHORRO:");
        System.out.println(" ");
        System.out.println("    1. CUENTA CORRIENTE:");
        System.out.println(" ");
        int numOp = input.nextInt();
        switch (numOp) {
            case 0:
                System.out.println(cajaAhorro.toString());
                
                
                break;
            case 1:
                System.out.println(cuentaCorriente.toString());
                break;
            default:
                break;
        }
        

    }


    public void imprimirCliente(Cliente cliente) {
        String nombre = cliente.getNombre();
        String direccion = cliente.getDireccion();
        String email = cliente.getEmail();
        int cuit = cliente.getCuit();

        
    }

}
