package tp_3_1;

/**
 * Esta es la clase Lista, que acepta todo tipo de objetos genéricos.
 * Se agregaron especialmente los métodos add, get y remove según la consigna.
 * @author Ariel Sebastian Andres
 * @version 1.0
 */
public class Lista<E> {

    private E lista[];
    private int indice;
    private final int MAXELEM;

    /**
     * Constructor
     */
    public Lista(int n) {
        lista = (E[]) new Object[n];
        MAXELEM = n;
        indice = 0;
    }

    /**
     * Agrega un elemento al final de la lista
     *
     * @param e elemento que va a agregar a la lista
     * @exception IndexOutOfBoundsException
     */
    public void add(E e) throws IndexOutOfBoundsException {
        if (indice == MAXELEM) {
            throw new IndexOutOfBoundsException("Lista llena");
        }
        lista[indice++] = e;
    }

    /**
     * Agrega un elemento a la lista en la posicion p
     *
     * @param p posicion en la que se va a agregar el elemento
     * @param e elemento a agregar
     * @exception IndexOutOfBoundsException
     */
    public void add(int p, E e) throws IndexOutOfBoundsException {
        if (p < 0 || p > indice || p >= MAXELEM) {
            throw new IndexOutOfBoundsException("Posicion no valida: " + p);
        }
        if (indice == 0 || p == indice) {
            //Añado en la cola
            add(e);
        } else {
            for (int i = indice; i > p; i--) {
                // Desplazo la lista un lugar a la derecha
                lista[i] = lista[i - 1];
            }
            // Inserto el elemento
            lista[p] = e;
            if (indice != MAXELEM) {
                indice++;
            }
        }
    }

    /**
     * Retorna el elemento que se encuentra en p
     *
     * @return El objeto que ocupa la posicion p en la lista
     * @exception IndexOutOfBoundsException
     */
    public E get(int p) throws IndexOutOfBoundsException {
        if (p < 0 || p >= indice) {
            throw new IndexOutOfBoundsException("Indice invalido: " + p);
        }
        return lista[p];
    }

    /**
     * Remueve el elemento E de la lista.
     *
     * @return remover según su posición en la lista con el otro método remove
     */
    public E remove(E e) {
        boolean encontrado = false;
        int i;
        for (i = 0; i < indice && !encontrado; i++) {
            if (lista[i].equals(e)) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            return null;
        }
        return remove(i);
    }

    /**
     * Remueve el elemento que se encuentra en la posicion p
     * @exception IndexOutOfBoundsException
     */
    public E remove(int p) throws IndexOutOfBoundsException {
        if (p < 0 || p >= MAXELEM) {
            throw new IndexOutOfBoundsException("Indice invalido: " + p);
        } else {
            E elementoEliminado = lista[p];
            for (int i = p; i < indice; i++) {
                lista[i] = lista[i + 1];
            }
            indice--; //Para no mostrar el null que queda despues de sacar un objeto
            return elementoEliminado;
        }
    }

    /**
     * @return el objeto mediante un unico string
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < indice; i++) {
            s += lista[i] + "\n";
        }
        return s;

    }
}
