package tp4_2;

import java.util.Arrays;
import java.util.Scanner;

public class Tp4_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long ejecucion;
        long tiempoInicio;
        long tiempoFinal;

        //System.out.println("Ingrese la cantidad de numeros que va a contener el array: ");

        //int maximo = input.nextInt();
        //int numeros[] = new int[maximo];
        /*
        for (int i = 0; i < maximo; i++) {
            System.out.println("Ingrese el numero de la posicion ");
            int num = input.nextInt();
            numeros[i] = num;
        }*/

        int numeros[] = {1,2,4,8,16,32,64,128,256,512,1024, 1048576, 2097152};

        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println("\nIngrese el numero a buscar en el array: ");
        int target = input.nextInt();
        System.out.println("\nSi el numero no se encuentra en el array el algoritmo devuelve -1 ");
        System.out.println("\nSi el numero se encuentra en el array el algoritmo devuelve la posicion en la que se encuentra ");

        System.out.println("iterativa: ");
        tiempoInicio = System.nanoTime();
        int indice = Busqueda.busquedaBinIte(numeros, target);
        tiempoFinal = System.nanoTime();
        ejecucion = tiempoFinal - tiempoInicio;
        System.out.println("Tiempo de ejecucion: " + ejecucion);

        System.out.println("El número se encuentra en la posicion: " + indice);

        System.out.println("Recursiva: ");
        tiempoInicio = System.nanoTime();
        boolean index1 = Busqueda.binarySearch(numeros, target, 0, numeros.length);
        tiempoFinal = System.nanoTime();
        ejecucion = tiempoFinal - tiempoInicio;
        System.out.println("Tiempo de ejecucion: " + ejecucion);

        System.out.println("El número se encuentra en la posicion: " + index1);
    }
}
