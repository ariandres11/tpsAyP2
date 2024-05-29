package tp4_1;


public class Factorial {

    public static int calcularFactorialIterativo(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("EL numero seleccionado para calcular el factorial es menor a 0, intente nuevamente con otro numero");
        }
        int res = 0;
        if (num == 0) {
            return 0;
        }
        res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    
    public static int calcularFactorialRecursivo(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("EL numero seleccionado para calcular el factorial es menor a 0, intente nuevamente con otro numero");
        }
        if (num == 0 || num == 1) {
            return 1; //El factorial de 0 y 1 es 1
        }
        else{
            return num* calcularFactorialRecursivo(num-1);
        }
        //Calcular el factorial anterior y el actual
        
    }
    

}
/*Factorial traza
Fac de 1  
Recur: segundo if, devuelve 1
Iter: res(1)*1 = 1, devuelve res = 1
Fac de 2
Recur: else, calcula 2 * 1!(2) devuelve 2
Iter: res = 1, res*=2 (2*1) = 2<

Ambas funciones son de orden lineal en su complejidad temporal

Pero la funcion recursiva en su complejidad espacial es de orden O(N), es decir lineal DEBIDO A LA PILA DE LLAMADAS
Mientras que la funcion iterativa es de complejidad espacial de orden O(1)
*/
