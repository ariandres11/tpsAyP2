package tp4_7;

import java.util.Scanner;

public class TowersOfHanoi {

    static int llamadas = 0;

    public void solve(int n, String start, String auxiliary, String end) {
        llamadas++;
            System.out.println("n: " + n + " Num de llamada: " + llamadas  + " Start: " + start + " End: " + end + " Auxiliary: " + auxiliary);
        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            

            solve(n - 1, start, end, auxiliary);

            System.out.println(start + " -> " + end);

            solve(n - 1, auxiliary, start, end);
        }
    }

    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        towersOfHanoi.solve(discs, "A", "B", "C");
    }
}
