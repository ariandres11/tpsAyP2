package tp_1_18;

import java.util.Scanner;
// Trabajo Práctico n°1 ejercicio 18
public class Tp_1_18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float grados, resC, resF;
        int op;

        System.out.println("Ingrese los grados a convertir con los decimales luego de una coma");

        grados = input.nextFloat();

        System.out.println("Ingrese la conversion que desea hacer");
        System.out.println("1. De Fahrenheit a Centigrados");
        System.out.println("2. De Centigrados a Fahrenheit");
        
        
        //[DEBUG]
        //System.out.println("3. Ambas");
        

        op = input.nextInt();

        switch (op) {
            case 1:
                //f a c
                resC = fahrToCent(grados);
                System.out.printf("Conversion: %.2f grados centigrados. \n", resC);

                break;
            case 2:
                // c a f
                resF = centToFahr(grados);
                System.out.printf("Conversion: %.2f grados centigrados. \n", resF);

                break;
            case 3:
                // ambos [DEB]
                resC = fahrToCent(grados);
                System.out.printf("Conversion: %.2f grados centigrados. \n", resC);
                //System.out.println("Conversion: " + resC + " grados centigrados.");
                resF = centToFahr(grados);
                System.out.printf("Conversion: %.2f grados centigrados. \n", resF);

                break;
            default:
                System.out.println("Ingrese un numero valido");
                break;
        }
    }

    public static float fahrToCent(float gradosF) {
        float gradosC = (float) (5.0 / 9.0 * (gradosF - 32));

        return gradosC;
    }

    public static float centToFahr(float gradosC) {
        float gradosF = (float) (9.0 / 5.0 * gradosC + 32);

        return gradosF;
    }

}
