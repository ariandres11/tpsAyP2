/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tp5_1;

/**
 * A basic singly linked list implementation.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class SinglyLinkedList<E> implements Cloneable {

    //---------------- nested Node class ----------------
    /**
     * Node of a singly linked list, which stores a reference to its element and to the subsequent node in the list (or null if this is the last node).
     */
    private static class Node<E> {

        /**
         * The element stored at this node
         */
        private E element;            // reference to the element stored at this node

        /**
         * A reference to the subsequent node in the list
         */
        private Node<E> next;         // reference to the subsequent node in the list

        /**
         * Creates a node with the given element and next node.
         *
         * @param e the element to be stored
         * @param n reference to a node that should follow the new node
         */
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        // Accessor methods
        /**
         * Returns the element stored at the node.
         *
         * @return the element stored at the node
         */
        public E getElement() {
            return element;
        }

        /**
         * Returns the node that follows this one (or null if no such node).
         *
         * @return the following node
         */
        public Node<E> getNext() {
            return next;
        }

        // Modifier methods
        /**
         * Sets the node's next reference to point to Node n.
         *
         * @param n the node that should follow this one
         */
        public void setNext(Node<E> n) {
            next = n;
        }

    } //----------- end of nested Node class -----------

    // instance variables of the SinglyLinkedList
    /**
     * The head node of the list
     */
    private Node<E> head = null;               // head node of the list (or null if empty)

    /**
     * The last node of the list
     */
    private Node<E> tail = null;               // last node of the list (or null if empty)

    /**
     * Number of nodes in the list
     */
    private int size = 0;                      // number of nodes in the list

    /**
     * Constructs an initially empty list.
     */
    public SinglyLinkedList() {
    }              // constructs an initially empty list

    // access methods
    /**
     * Returns the number of elements in the linked list.
     *
     * @return number of elements in the linked list
     */
    public int size() {
        return size;
    }

    /**
     * Tests whether the linked list is empty.
     *
     * @return true if the linked list is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns (but does not remove) the first element of the list
     *
     * @return element at the front of the list (or null if empty)
     */
    public E first() {             // returns (but does not remove) the first element
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    /**
     * Returns (but does not remove) the last element of the list.
     *
     * @return element at the end of the list (or null if empty)
     */
    public E last() {              // returns (but does not remove) the last element
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    // update methods
    /**
     * Adds an element to the front of the list.
     *
     * @param e the new element to add
     */
    public void addFirst(E e) {                // adds element e to the front of the list
        head = new Node<>(e, head);              // create and link a new node
        if (size == 0) {
            tail = head;                           // special case: new node becomes tail also
        }
        size++;
    }

    /**
     * Adds an element to the end of the list.
     *
     * @param e the new element to add
     */
    public void addLast(E e) {                 // adds element e to the end of the list
        Node<E> newest = new Node<>(e, null);    // node will eventually be the tail
        if (isEmpty()) {
            head = newest;                         // special case: previously empty list
        } else {
            tail.setNext(newest);                  // new node after existing tail
        }
        tail = newest;                           // new node becomes the tail
        size++;
    }

    /**
     * Añade un elemento en una posicion determinada de la lista
     *
     * @exception IndexOutOfBoundsException
     * @param (E) el elemento a añadir y la posición (int) en la cual se añade
     */
    public void addPos(E e, int n) throws IndexOutOfBoundsException {
        if (n < 0 || n > size) {
            throw new IndexOutOfBoundsException();
        }
        if (n == 0) {
            addFirst(e);
        } else {
            if (n == size) {
                addLast(e);

            } else {
                Node<E> walk = head;
                for (int i = 0; i < n - 1; i++) {
                    walk = walk.getNext();
                }
                Node<E> aux = new Node<>(e, walk.getNext());
                walk.setNext(aux);
                size++;

            }
        }
    }

    /**
     * Removes and returns the first element of the list.
     *
     * @return the removed element (or null if empty)
     */
    public E removeFirst() {                   // removes and returns the first element
        if (isEmpty()) {
            return null;              // nothing to remove
        }
        E answer = head.getElement();
        head = head.getNext();                   // will become null if list had only one node
        size--;
        if (size == 0) {
            tail = null;                           // special case as list is now empty
        }
        return answer;
    }

    /**
     * Remueve un elemento de la lista a partir del elemento a eliminar
     *
     * @param (E) el elemento a eliminar en formato E
     * @return Retorna el elemento eliminado si lo encuentra, sino null
     */
    public E removeElement(E e) {
        Node<E> walk = head;
        Node<E> prev = null;

        if (isEmpty()) {
            return null;
        }
        while (walk != null) {
            if (walk.getElement() == e) {
                if (prev == null) {
                    return removeFirst();
                } else {
                    if (walk.getNext() == null) {
                        tail = prev;
                    }
                    prev.setNext(walk.getNext());
                    size--;
                    return (E) walk;
                }
            }
            prev = walk;
            walk = walk.getNext();
        }
        return null;
    }

    /**
     * Remueve el elemento de la posición indicada como entero
     *
     * @param (int) la posicion como entero
     * @exception IndexOutOfBoundsException
     * @return e si encontró el elemento y null si no lo encontró
     */
    public E removePos(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            return removeFirst();
        } else {
            Node<E> walk = head;
            E elim;
            for (int j = 0; j < i - 1; j++) {
                walk = walk.getNext();
            }
            elim = walk.getNext().getElement();
            walk.setNext(walk.getNext().getNext());
            if (i == size - 1) {
                tail = walk;
            }
            size--;
            return elim;
        }
    }

    /**
     * Busca un elemento en la lista
     *
     * @param (E) el elemento a buscar de tipo E
     * @return e si encontró el elemento y null si no lo encontró
     */
    public E search(E e) {
        Node<E> walk = head;

        if (isEmpty()) {
            return null;
        }

        while (walk != null) {
            if (walk.getElement().equals(e)) {
                //Lo encontró, lo devuelve
                return e;
            }
            walk = walk.getNext();
        }
        return null;
    }

    /**
     * Concatena una lista al final de la actual
     *
     * @param (SinglyLinkedList) la lista a agregar
     */
    public void concatenate(SinglyLinkedList l) {
        //Dada una lista, la agrega el final de la actual
        tail.setNext(l.head);
        tail = l.tail;
        size += l.size();

    }

    /**
     * Dada otra lista, permite definir si son iguales
     *
     * @param (SinglyLinkedList) la lista a comparar con la actual
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            //Si no son del mismo tipo, no son iguales
            return false;
        }
        SinglyLinkedList other = (SinglyLinkedList) o;
        if (size != other.size) {
            //Si no son del mismo tamaño no son iguales
            return false;
        }
        Node walkA = head;
        Node walkB = other.head;
        while (walkA != null) {
            if (!walkA.getElement().equals(walkB.getElement())) {
                //Si al menos un elemento no es igual, las listas no son iguales
                return false;
            }
            walkA = walkA.getNext();
            walkB = walkB.getNext();
        }
        return true;
    }

    /**
     * Clona una lista creando una nueva lista
     *
     * @param (SinglyLinkedList) la lista a clonar
     */
    public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
        SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone();
        if (size > 0) {
            //"inicializa" a la lista nueva
            other.head = new Node<>(head.getElement(), null);
            Node<E> walk = head.getNext();
            Node<E> otherTail = other.head;
            while (walk != null) {
                //Copia elemento a elemento
                Node<E> newest = new Node<>(walk.getElement(), null);
                otherTail.setNext(newest);
                otherTail = newest;
                walk = walk.getNext();
            }
        }
        return other;
    }

    public int hashCode() {
        int h = 0;
        for (Node walk = head; walk != null; walk = walk.getNext()) {
            h ^= walk.getElement().hashCode();      // bitwise exclusive-or with element's code
            h = (h << 5) | (h >>> 27);              // 5-bit cyclic shift of composite code
        }
        return h;
    }

    /**
     * Produces a string representation of the contents of the list. This exists for debugging purposes only.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        Node<E> walk = head;
        while (walk != null) {
            sb.append(walk.getElement());
            if (walk != tail) {
                sb.append(", ");
            }
            walk = walk.getNext();
        }
        sb.append(")");
        return sb.toString();
    }
}
