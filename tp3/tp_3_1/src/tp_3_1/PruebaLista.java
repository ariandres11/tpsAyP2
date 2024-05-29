package tp_3_1;

/**
 * Esta es la clase de prueba de la clase Lista. En esta clase se prueban todos los métodos agregados a la clase Lista
 *
 * @author Ariel Sebastian Andres
 * @version 1.0
 */
public class PruebaLista {

    public static void main(String[] args) {

        Lista<Empleado> lista = new Lista<>(5);

        Empleado e1 = new Empleado(49562049, "Agostina");
        Empleado e2 = new Empleado(44516969, "Ariel");
        Empleado e3 = new Empleado(94239103, "Matias");
        Empleado e4 = new Empleado(25725911, "Agustin");

        lista.add(e1);
        lista.add(e2);
        lista.add(e3);

        //Prueba método add(elemento) que inserta por la cola de la lista
        System.out.println("\nLista original: ");
        System.out.println(lista.toString());
        
        //Prueba método add(posicion, elemento)
        System.out.println("\nAgregando un objeto a la lista en la posicion 2: ");
        lista.add(2, e4);
        System.out.println("Resultado: ");
        System.out.println(lista.toString());

        //Prueba método get(posicion)
        System.out.println("\nObteniendo el objeto que esta en la posicion 2 de la lista: ");
        System.out.println("Resultado: ");
        System.out.println(lista.get(2));

        //Prueba método remove(elemento)
        System.out.println("\nEliminando el objeto Empleado = 44516969, Ariel");
        lista.remove((Empleado) e1);
        System.out.println("Resultado: ");
        System.out.println(lista.toString());

        //Prueba método remove(posicion)
        System.out.println("\nEliminando el objeto Empleado que ocupa la primera posicion en la lista");
        lista.remove(0);
        System.out.println("Resultado: ");
        System.out.println(lista.toString());
    }

}
