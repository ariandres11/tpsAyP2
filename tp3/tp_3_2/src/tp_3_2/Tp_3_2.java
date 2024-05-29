package tp_3_2;

import java.util.Arrays;

public class Tp_3_2 {

    public static void main(String[] args) {
        int numsA[] = {0, 1, 2, 3, 5, 4, 6, 7};
        int numsB[] = {0, 1, 2, 3, 5, 4, 6};
        int numsC[] = {10, 1, 2, 3, 5, 4, 6, 7};

        //equals
        boolean iguales = Arrays.equals(numsA, numsB);
        System.out.println("Iguales :" + iguales);

        //fill
        System.out.println("Array cargado con num 3:");
        Arrays.fill(numsA, 3);
        for (int i = 0; i < numsA.length; i++) {
            System.out.println(numsA[i]);
        }

        //copyOf
        //Copio los primeros 4 nums de numsA en el array nuevo
        System.out.println("Copy of :");
        int arrayNuevo[] = Arrays.copyOf(numsA, 4);
        for (int i = 0; i < arrayNuevo.length; i++) {
            System.out.println(arrayNuevo[i]);
        }

        //copyOfRange
        System.out.println("Copy of range : ");
        int arrayNuevo2[] = Arrays.copyOfRange(numsC, 4, 7);
        for (int i = 0; i < arrayNuevo2.length; i++) {
            System.out.println(arrayNuevo2[i]);
        }

        //toString
        System.out.println("toString :");
        System.out.println(Arrays.toString(numsA));

        //Sort
        System.out.println("Sort:");
        Arrays.sort(numsC);
        for (int i = 0; i < numsC.length; i++) {
            System.out.println(numsC[i]);
        }

        System.out.println("Binary search:");
        int indiceDe10 = Arrays.binarySearch(numsC, 10);
        System.out.println("Indice del numero 10: " + indiceDe10);

    }

}
