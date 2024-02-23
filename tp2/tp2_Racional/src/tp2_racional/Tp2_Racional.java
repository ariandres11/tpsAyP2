package tp2_racional;

import java.util.Scanner;
//

public class Tp2_Racional {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Racional racionalRes = new Racional();
        Racional racional1 = new Racional();
        Racional racional2 = new Racional();
        //Deb
        Racional racionalSum = new Racional();
        Racional racionalMul = new Racional();
        Racional racionalDiv = new Racional();

        int numOpe;

        System.out.println("Ingrese un numero racional");
        String[] numeros = teclado.nextLine().split("/");
        racional1.setNumerador(Integer.parseInt(numeros[0]));
        racional1.setDenominador(Integer.parseInt(numeros[1]));

        System.out.println("Ingrese otro numero racional");
        String[] numeros1 = teclado.nextLine().split("/");
        racional2.setNumerador(Integer.parseInt(numeros1[0]));
        racional2.setDenominador(Integer.parseInt(numeros1[1]));

        System.out.println("Ingrese el numero de la operacion que le gustaria realizar: ");
        System.out.println("1. Suma ");
        System.out.println("3. Resta ");
        System.out.println("3. Multiplicacion ");
        System.out.println("4. Division ");

        numOpe = teclado.nextInt();

        switch (numOpe) {
            //Debug
            case 0:
                racionalSum = SumarRacionales(racional1, racional2);
                System.out.println("Res suma: " + racionalSum);
                racionalRes = RestarRacionales(racional1, racional2);
                System.out.println("Res resta: " + racionalRes);
                racionalMul = MultiplicarRacionales(racional1, racional2);
                System.out.println("Res multiplicacion: " + racionalMul);
                racionalDiv = DividirRacionales(racional1, racional2);
                System.out.println("Resultado de la division: " + racionalDiv);
                System.out.println("-------FIN DEBUG--------");
                break;
            //Debug
            case 1:
                racionalRes = SumarRacionales(racional1, racional2);
                System.out.println("Resultado de la suma: " + racionalRes);
                System.out.println("\n Programa finalizado");
                break;
            case 2:
                racionalRes = RestarRacionales(racional1, racional2);
                System.out.println("Resultado de la Resta: " + racionalRes);
                System.out.println("\n Programa finalizado");
                break;
            case 3:
                racionalRes = MultiplicarRacionales(racional1, racional2);
                System.out.println("Resultado de la Multiplicacion : " + racionalRes);
                System.out.println("\n Programa finalizado");
                break;
            case 4:
                racionalRes = DividirRacionales(racional1, racional2);
                System.out.println("Resultado de la division: " + racionalRes);
                System.out.println("\n Programa finalizado");
                break;
            default:
                System.out.println("Operacion no permitida, por favor ingrese un número del 1 al 4.");
                System.out.println("\n Programa finalizado");
                break;
        }
    }

    public static Racional SumarRacionales(Racional racional1, Racional racional2) {
        //Proceso para hallar mcd
        //Nums
        int num1 = racional1.getNumerador();
        int num2 = racional2.getNumerador();
        //Dens
        int den1 = racional1.getDenominador();
        int den2 = racional2.getDenominador();
        int denominador = HallarMCM(den1, den2);

        int numerador = (denominador / den1) * num1 + (denominador / den2) * num2;
        //Cambiar por num
        return new Racional(numerador, denominador);
    }

    public static Racional RestarRacionales(Racional racional1, Racional racional2) {
        //Proceso para hallar mcd
        //Nums
        int num1 = racional1.getNumerador();
        int num2 = racional2.getNumerador();
        //Dens
        int den1 = racional1.getDenominador();
        int den2 = racional2.getDenominador();
        int denominador = HallarMCM(den1, den2);

        int numerador = (denominador / den1) * num1 - (denominador / den2) * num2;
        //Cambiar por num
        return new Racional(numerador, denominador);
    }

    public static Racional MultiplicarRacionales(Racional racional1, Racional racional2) {
        int num1 = racional1.getNumerador();
        int num2 = racional2.getNumerador();
        int numerador = num1 * num2;

        int den1 = racional1.getDenominador();
        int den2 = racional2.getDenominador();
        int denominador = den1 * den2;
        return new Racional(numerador, denominador);

    }

    public static Racional DividirRacionales(Racional racional1, Racional racional2) {
        //Dar vuelta el racional2

        int num2 = racional2.getDenominador();
        int den2 = racional2.getNumerador();

        Racional racionalInvertido = new Racional(num2, den2);
        return MultiplicarRacionales(racional1, racionalInvertido);
    }

    public static int HallarMCM(int denominador1, int denominador2) {
        int mcm = (denominador1 > denominador2) ? denominador1 : denominador2;
        while (true) {

            if (mcm % denominador1 == 0 && mcm % denominador2 == 0) {
                break;
            }
            ++mcm;
        }
        return mcm;
    }

}
