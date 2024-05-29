package tp4_6;

import java.util.Scanner;

public class QuicksortPrueba {

    private final static int SIZE = 7000;
    private final static int MAX = 20;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int []nums =  { 4, 2, 8, 7, 1, 9, 5 };
        
        Quicksort qs = new Quicksort();
        
        qs.sort(nums);
        System.out.println("\nFinal: ");
        for (int num : nums) {
                    System.out.print(num);

        }

    }

}
