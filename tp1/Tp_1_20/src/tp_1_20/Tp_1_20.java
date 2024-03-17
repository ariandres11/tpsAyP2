package tp_1_20;

import java.util.Scanner;

//Trabajo Práctico n°1 ejercicio 20
public class Tp_1_20 {

    public static void main(String[] args) {
        int rango, numIngresado, intentos, quiereSeguir;
        boolean ganado, seguir;
        Scanner input = new Scanner(System.in);
        
        //1 a 1000 incluyendo el 0
        rango = 1001;

        do {
            int ranNum = (int) (Math.random() * rango);
            intentos = 0;
            ganado = false;
            //DEBUG
            //System.out.println(ranNum);
            while (!ganado) {
                intentos++; //Para llevar cuenta de los intentos
                System.out.println("Ingrese un numero");
                numIngresado = input.nextInt();
                ganado = Comparar(numIngresado, ranNum, intentos);
            }
            System.out.println("Felicitaciones, ganaste.");
            System.out.println("Desea seguir jugando? 0.No 1.Si");
            quiereSeguir = input.nextInt();
            seguir = (quiereSeguir == 1);
        } while (seguir);
        System.out.println("Programa finalizado.");
    }

    public static boolean Comparar(int numIngresado, int ranNum, int intentos) {
        //Demasiado alto
        if (numIngresado > ranNum) {
            System.out.println("Demasiado alto");
            return false;
        } else {
            //Demasiado bajo
            if (numIngresado < ranNum) {
                System.out.println("Demasiado bajo");
                return false;
            } else {
                //Es igual
                System.out.println("Adivinaste en " + intentos + " intentos!");
                return true;
            }
        }
    }
}
