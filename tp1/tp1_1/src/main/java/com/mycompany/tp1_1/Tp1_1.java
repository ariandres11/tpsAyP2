package com.mycompany.tp1_1;

import java.util.Scanner;

public class Tp1_1 {

    public static void main(String[] args) {
        int n1;
        int n2;
        int numOp;
        int res;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        n1 = verificarInt(teclado);
        //teclado.nextLine();
        System.out.println("Ingrese otro número");
        n2 = verificarInt(teclado);
        //teclado.nextLine();

        System.out.println("Ingrese el número de operación requerida");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División entera");
        numOp = obtenerInt(teclado);
        teclado.nextLine();
        
        switch (numOp) {
            case 0:
            case 1:
                res = n1 + n2;
                System.out.println("El resultado es " + res);
                break;
            case 2:
                res = n1 - n2;
                System.out.println("El resultado es " + res);
                break;
            case 3:
                res = n1 * n2;
                System.out.println("El resultado es " + res);
                break;
            case 4:
                res = n1 / n2;
                System.out.println("El resultado es " + res);
                break;
            default:
                System.out.println("Inserte un numero valido ");
        }

    }
    
    public static int obtenerInt(Scanner scanner){
        int numero;
        do {            
            System.out.println("Por favor ingrese un número entero entre 1 y 4");
            while(!scanner.hasNextInt()){
                System.out.println("No es un numero valido, intente nuevamente");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 4);
        return numero;
    }
    
    public static int verificarInt(Scanner scanner){
        int numero;
        do {            
            System.out.println("Por favor ingrese un número entero");
            scanner.next();
        }while(!scanner.hasNextInt());
        numero = scanner.nextInt();
        return numero;
    }
}


