package tp4_1;

import java.util.Scanner;

public class Tp4_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero para calcular su factorial");
        int num = input.nextInt();
        System.out.println("\nFactorial recursivo: " + Factorial.calcularFactorialRecursivo(num));
        System.out.println("\nFactorial iterativo: " + Factorial.calcularFactorialIterativo(num));

    }

}
