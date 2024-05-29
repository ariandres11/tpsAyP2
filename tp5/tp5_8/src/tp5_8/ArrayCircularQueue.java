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
package tp5_8;

/**
 * Implementation of the queue ADT using a fixed-length array. All operations are performed in constant time. An exception is thrown if an enqueue operation is attempted when the size of the queue is equal to the length of the array.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class ArrayCircularQueue<E> implements CircularQueue<E>{

    ArrayQueue<E> arrayQ;
    
    public ArrayCircularQueue(){
        arrayQ = new ArrayQueue<>();
    }
    
    public ArrayCircularQueue(int capacity){
        arrayQ = new ArrayQueue<>(capacity);
    }
    
    
    @Override
    public void rotate() {
        arrayQ.enqueue(arrayQ.dequeue());
    }

    @Override
    public int size() {
        return arrayQ.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayQ.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        arrayQ.enqueue(e);
    }

    @Override
    public E first() {
        return arrayQ.first();
    }

    @Override
    public E dequeue() {
        return arrayQ.dequeue();
    }
    
    @Override
    public String toString(){
        return arrayQ.toString();
    }
    
    
}
