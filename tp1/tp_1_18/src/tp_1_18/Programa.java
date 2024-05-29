package tp_1_18;

import java.util.Scanner;
// Trabajo Práctico n°1 ejercicio 18
public class Programa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float grados, resC, resF;
        int op;

        System.out.println("Ingrese los grados a convertir con los decimales luego de una coma");

        grados = input.nextFloat();

        System.out.println("Ingrese la conversion que desea hacer");
        System.out.println("1. De Fahrenheit a Centigrados");
        System.out.println("2. De Centigrados a Fahrenheit");
          

        op = input.nextInt();

        switch (op) {
            case 1:
                //f a c
                resC = MetodosConversion.fahrToCent(grados);
                System.out.printf("Conversion: %.2f grados centigrados. \n", resC);
                break;
            case 2:
                // c a f
                resF = MetodosConversion.centToFahr(grados);
                System.out.printf("Conversion: %.2f grados centigrados. \n", resF);
                break;
            default:
                System.out.println("Ingrese un numero valido");
                break;
        }
    }

}
