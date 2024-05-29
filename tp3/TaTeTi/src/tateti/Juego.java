package tateti;

import java.util.Scanner;

public class Juego {

    private int tamTablero;
    private int[][] tablero;

    public Juego(int tamTablero) {
        this.tamTablero = tamTablero;
        this.tablero = new int[tamTablero][tamTablero];
    }

    public void jugar() {
        Scanner input = new Scanner(System.in);
        int jugador = 1;

        //Bucle
        while (true) {
            mostrarTablero();
            System.out.println("Turno del jugador numero " + jugador);
            System.out.println("Fila : ");
            int fila = input.nextInt() - 1;
            System.out.println("Columna : ");
            int columna = input.nextInt() - 1;

            if (fila >= 0 && fila < tamTablero && columna >= 0 && columna <= tamTablero) {
                if (tablero[fila][columna] == 0) {
                    tablero[fila][columna] = jugador;
                    jugador = 3 - jugador; // Alternar entre 1 y 2
                } else {
                    System.out.println("¡Esa celda ya está ocupada!");
                }

            } else {
                System.out.println("Jugada inválida. Inténtalo de nuevo.");
            }

        }
    }

    private void mostrarTablero() {
        for (int[] fila : tablero) {
            for (int celda : fila) {
                char simbolo = (celda == 1) ? 'X' : (celda == 2) ? 'O' : '-';
                System.out.print(simbolo + " ");
            }
            System.out.println();
        }
    }

}
