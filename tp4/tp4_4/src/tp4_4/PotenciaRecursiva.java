package tp4_4;

public class PotenciaRecursiva {

    /*
    4. Realizar dos implementaciones recursivas para 
    calcular la potencia de un número. 
    Optimizar la segunda implementación multiplicando 
    los resultados parciales. Probar con distintos números y 
    medir el tiempo en obtener el resultado de cada algoritmo. 
    Realizar una traza de ambos algoritmos para un número dado. 
    Indicar la complejidad de ambos algoritmos. 
     */
    public static int metodo1(int num, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return num;
        }
        num *= num;
        exp--;
        return metodo1(num, exp);
    }

    public static long potenciaOptimizada(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente % 2 == 0) {
            long mitad = potenciaOptimizada(base, exponente / 2);
            return mitad * mitad;
        } else {
            long mitad = potenciaOptimizada(base, (exponente - 1) / 2);
            return base * mitad * mitad;
        }
    }
}
