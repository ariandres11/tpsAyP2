package tateti;

import java.util.Scanner;

public class TaTeTi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del tablero (número de filas y columnas): ");
        int tamTablero = scanner.nextInt();

        Juego juego = new Juego(tamTablero);
        juego.jugar();

    }

}
