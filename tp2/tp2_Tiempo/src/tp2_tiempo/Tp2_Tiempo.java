package tp2_tiempo;

import java.util.Scanner;

public class Tp2_Tiempo {

    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();
        Scanner teclado = new Scanner(System.in);
        //Seg y min deben estar entre 60
        System.out.println("Ingrese las horas");
        int horas = teclado.nextInt();
        tiempo.setHoras(horas);
        System.out.println("Ingrese los minutos");
        int minutos = teclado.nextInt();

        while (minutos >= 60) {
            System.out.println("Ingrese un numero valido (del 1 hasta 59)");
            minutos = teclado.nextInt();
        }

        tiempo.setMinutos(minutos);
        System.out.println("Ingrese los segundos");
        int segundos = teclado.nextInt();
        
        while (segundos >= 60) {
            System.out.println("Ingrese un numero valido (del 1 hasta 59)");
            segundos = teclado.nextInt();
        }
        tiempo.setSegundos(segundos);

        System.out.println("Ingrese el numero de operacion que desea realizar");
        System.out.println("1.Incrementar un segundo");
        System.out.println("2.Incrementar un minuto");
        System.out.println("3.Incrementar una hora");

        int numOpe = teclado.nextInt();
        teclado.nextLine();

        switch (numOpe) {

            case 1:
                tiempo = incrementarSegundo(tiempo);
                System.out.println("Su tiempo incrementado un segundo es: " + tiempo);
                break;

            case 2:
                tiempo = incrementarMinuto(tiempo);
                System.out.println("Su tiempo incrementado un minuto es: " + tiempo);
                break;
            case 3:
                tiempo = incrementarHora(tiempo);
                System.out.println("Su tiempo incrementado un minuto es: " + tiempo);
                break;

            default:
                System.out.println("Operacion no permitida, por favor ingrese un número del 1 al 4.");
                System.out.println("\n Programa finalizado");
                break;
        }
    }

    public static Tiempo incrementarSegundo(Tiempo tiempo) {
        int horas = tiempo.getHoras();
        int minutos = tiempo.getMinutos();
        int segundos = tiempo.getMinutos();
        if (segundos + 1 >= 60) {
            segundos = 0;
            return new Tiempo(horas, minutos + 1, segundos);
        } else {
            return new Tiempo(horas, minutos, segundos + 1);
        }

    }

    public static Tiempo incrementarMinuto(Tiempo tiempo) {
        int horas = tiempo.getHoras();
        int minutos = tiempo.getMinutos();
        int segundos = tiempo.getMinutos();
        if (minutos + 1 >= 60) {
            minutos = 0;
            return new Tiempo(horas + 1, minutos, segundos);
        } else {
            return new Tiempo(horas, minutos + 1, segundos);
        }
    }

    public static Tiempo incrementarHora(Tiempo tiempo) {
        int horas = tiempo.getHoras();
        int minutos = tiempo.getMinutos();
        int segundos = tiempo.getMinutos();
        return new Tiempo(horas + 1, minutos, segundos);
    }

}
