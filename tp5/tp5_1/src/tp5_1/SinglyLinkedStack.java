package tp5_1;

public class SinglyLinkedStack<E> implements Stack<E> {

    SinglyLinkedList<E> list = new SinglyLinkedList<>();

    public SinglyLinkedStack(){
        
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
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }
    
    public String toString(){
        return list.toString();
    }

}
