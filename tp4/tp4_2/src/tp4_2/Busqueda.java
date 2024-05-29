package tp4_2;

public class Busqueda {
    
    public static boolean binarySearch(int [] data, int target, int low, int high){
        if (low > high) {
            return false;
        }else{
            int mid = (low + high)/2;
            if (target == data[mid]) {
                return true;
            }else if (target <= data[mid]) {
                return binarySearch(data, target, low, mid-1);
            }else{
                return binarySearch(data, target, mid+1, high);
            }
        }
        
    }

    public static int busquedaBinIte(int[] array, int num) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int mitad = (inicio + fin) / 2;

            if (num == array[mitad]) {
                return mitad+1; // El número se encuentra en la mitad
            } else if (num < array[mitad]) {
                fin = mitad - 1; // Buscar en la parte baja
            } else {
                inicio = mitad + 1; // Buscar en la parte alta
            }
        }
        return -1; // El número no se encuentra en el arreglo
    }
}
/*Busqueda binaria traza
Arreglo = [0,80,9]
Arreglo ordenado = [0,9,80]


Num a buscar = 80
----
Iter: 
inicio = 0;
fin = 2;
primera iter
mientras inicio<=fin
    mitad  = 0 + 2 /2
    el numero en la mitad es 9, 80 es MAYOR a 9, entonces se toma inicio = mitad + 1;

segunda iter
inicio == fin, es la ultima iteracion
    mitad = inicio = fin;
    num == array[mitad]
    return mitad (2);

----
Recur:
    primera vez se llama con el array, inicio = 0, fin = 2, num = 80
mitad = 1 (9)
el num es mayor a 9 asi que va al ultimo caso,retorna
busqueda bin recur(array, inicio = mitad + 1, fin, 80)
mitad + 1 = 2
el numero esta en la pos 2 asi que solamente hacen falta 2 iteraciones


Crecimiento = 
el crecimiento de la func recursiva es O(log N)
el crecimiento de la func iterativa es 0(log N) 

pero la funcion iterativa ocupa menos memoria al tener un solo llamado
*/
