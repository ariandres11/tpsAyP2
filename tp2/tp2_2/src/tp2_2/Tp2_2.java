package tp2_2;

import java.util.Scanner;

public class Tp2_2 {

    public static void main(String[] args) {
        Complejo complejo1 = new Complejo();
        Complejo complejo2 = new Complejo();
        Complejo complejoRes = new Complejo();
        //Debug
        Complejo complejoSum = new Complejo();
        Complejo complejoMult = new Complejo();
        //Debug
        int numOpe;
        float escalar;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor indique si quiere realizar division escalar:");
        System.out.println("1 para 'SI'");
        System.out.println("0 para 'NO'");
        int divONo = teclado.nextInt();
        teclado.nextLine();
        if (divONo == 0) {
            //Num 3
            System.out.println("Ingrese el primer numero complejo de la forma 'real,imaginario' , sin necesidad de escribir el numero imaginario.");
            String[] numeros = teclado.nextLine().split(",");
            complejo1.setpReal(Float.parseFloat(numeros[0]));
            complejo1.setpImag(Float.parseFloat(numeros[1]));
            //Num 2
            System.out.println("Ingrese el segundo numero complejo de la forma real, imaginario, sin necesidad de escribir el numero imaginario.");
            String[] numeros2 = teclado.nextLine().split(",");
            complejo2.setpReal(Float.parseFloat(numeros2[0]));
            complejo2.setpImag(Float.parseFloat(numeros2[1]));

            System.out.println("Ingrese el numero de la operacion que le gustaría realizar: ");
            System.out.println("1. Suma ");
            System.out.println("3. Resta ");
            System.out.println("3. Multiplicacion ");
            System.out.println("4. Division ");
            numOpe = teclado.nextInt();
            switch (numOpe) {
                //Debug
                case 0:
                    complejoSum = SumarComplejos(complejo1, complejo2);
                    System.out.println("Res suma: " + complejoSum);
                    complejoRes = RestarComplejos(complejo1, complejo2);
                    System.out.println("Res resta: " + complejoRes);
                    complejoMult = MultiplicarComplejos(complejo1, complejo2);
                    System.out.println("Res multiplicacion: " + complejoMult);
                    System.out.println("-------FIN DEBUG--------");
                    break;
                //Debug
                case 1:
                    complejoRes = SumarComplejos(complejo1, complejo2);
                    System.out.println("Resultado de la suma: " + complejoRes);
                    System.out.println("\n Programa finalizado");
                    break;
                case 2:
                    complejoRes = RestarComplejos(complejo1, complejo2);
                    System.out.println("Resultado de la Resta: " + complejoRes);
                    System.out.println("\n Programa finalizado");
                    break;
                case 3:
                    complejoRes = MultiplicarComplejos(complejo1, complejo2);
                    System.out.println("Resultado de la Multiplicacion : " + complejoRes);
                    System.out.println("\n Programa finalizado");
                    break;
                case 4:
                    System.out.println("Operación no definida aún.");
                    System.out.println("\n Programa finalizado");
                    break;
                default:
                    System.out.println("Operacion no permitida, por favor ingrese un número del 1 al 4.");
                    System.out.println("\n Programa finalizado");
                    break;
            }
        } else {
            if ( divONo == 1) {
                System.out.println("Ingrese el numero complejo de la 'forma real,imaginario'.");
                String[] numeros3 = teclado.nextLine().split(",");
                complejo1.setpReal(Float.parseFloat(numeros3[0]));
                complejo1.setpImag(Float.parseFloat(numeros3[1]));
                System.out.println("Ingrese el escalar por el cual quiere dividir al numero complejo.");
                escalar = teclado.nextFloat();
                complejoRes = DividirComplejos(complejo1, escalar);
                System.out.println("Resultado de la Division escalar : " + complejoRes);
                System.out.println("\n Programa finalizado");
            } else {
                System.out.println("Numero no valido.");
            }
        }
    }

    public static Complejo SumarComplejos(Complejo complejo1, Complejo complejo2) {
        float real = complejo1.getpReal() + complejo2.getpReal();
        float imag = complejo1.getpImag() + complejo2.getpImag();
        return new Complejo(real, imag);
    }

    public static Complejo RestarComplejos(Complejo complejo1, Complejo complejo2) {
        float real = complejo1.getpReal() - complejo2.getpReal();
        float imag = complejo1.getpImag() - complejo2.getpImag();
        return new Complejo(real, imag);
    }

    public static Complejo MultiplicarComplejos(Complejo complejo1, Complejo complejo2) {
        float real = complejo1.getpReal() * complejo2.getpReal() - complejo1.getpImag() * complejo2.getpImag();
        float imag = complejo1.getpReal() * complejo2.getpImag() + complejo1.getpImag() * complejo2.getpReal();
        return new Complejo(real, imag);
    }

    public static Complejo DividirComplejos(Complejo complejo1, float escalar) {
        float real = complejo1.getpReal() / escalar;
        float imag = complejo1.getpImag() / escalar;
        return new Complejo(real, imag);
    }
}
