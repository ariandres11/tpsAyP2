package com.mycompany.tp1_2;
import java.util.Scanner;

public class Tp1_2 {

    public static void main(String[] args) {
        double diametro;
        double circunferencia;
        double area;
        int numOp;
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159;
        System.out.println("Ingrese el radio del círculo y el programa calculará su diametro, circunferencia y área.");
        double radio = teclado.nextDouble();
        System.out.println("Ingrese el número del dato que requiere.");
        System.out.println("1.Diámetro");
        System.out.println("2.Circunferencia");
        System.out.println("3.Área");
        System.out.println("4.Todos los anteriores");
    
        numOp = teclado.nextInt();
        switch(numOp){
            case 1 -> {
                diametro = radio*2;
                System.out.println("El perímetro del círculo de radio "+ radio +" es: "+ diametro);
            }
            case 2 -> { 
                circunferencia = 2*pi*radio;
                System.out.println("La circunferencia del círculo de radio "+ radio +" es: "+ circunferencia);
            }
            case 3 -> {
                area = pi*(Math.pow(radio, 2));
                System.out.println("El área del círculo de radio "+ radio +" es: "+ area);
            }
            case 4 -> {
                diametro = radio*2;
                circunferencia = 2*pi*radio;
                area = pi*(Math.pow(radio, 2));
                System.out.println("Los datos del círculo son: ");
                System.out.println("Diametro: "+ diametro);
                System.out.println("Circunferencia: "+ circunferencia);
                System.out.println("Área: "+ area);
            }
            default -> System.out.println("Por favor introduzca un número de operación válido");
        }
    }
}
