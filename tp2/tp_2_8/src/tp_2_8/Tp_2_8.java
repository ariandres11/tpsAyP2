package tp_2_8;

import java.util.Scanner;

/* crear la clase cuentaBancaria que debe registrar num de cuenta, titular y saldo
crear la clase caja de ahorro que extiende de cuenta bancaria  en la misma se pueden hacer depositos
y extracciones siempre que el saldo sea mayor o igual a 0

crear la clase cuenta corriente que extiende y puede hacer extraciones y depositos, en este caso puedee tener saldo negativo hasta determinado monto fijado por cada cliente

de cada cliente se registra su nombre, cuit, direccion y email

crear un programa que cree instancias de cada objeto para cada clase y realizar depositos y extracciones*/
public class Tp_2_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //imprimirCajaAhorro
        System.out.println("Ingrese la operacion que desea hacer: ");
        System.out.println(" ");
        System.out.println("    CAJA DE AHORRO:");
        System.out.println("    1. Extraccion ");
        System.out.println("    2. Deposito");
        System.out.println(" ");
        System.out.println("    CUENTA CORRIENTE:");
        System.out.println("    1. Extraccion ");
        System.out.println("    2. Deposito");
        

    }
    
    public void imprimirCajaAhorro(CajaAhorro cajaAhorro){
        double saldo = cajaAhorro.getSaldo();
        
        
        
    }

}
