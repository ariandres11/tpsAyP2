package tp5_1;

public class DoublyLinkedStack<E> implements Stack<E> {

    private DoublyLinkedList list = new DoublyLinkedList<>();

    public DoublyLinkedStack() {
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(Object e) {
        list.addLast(e);
    }

    @Override
    public E top() {
        return (E) list.last();
    }

    @Override
    public E pop() {
        return (E) list.removeLast();
    }

    public String toString() {
        return list.toString();
    }

}
