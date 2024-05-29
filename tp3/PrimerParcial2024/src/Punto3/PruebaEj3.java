package Punto3;

public class PruebaEj3 {

    public static void main(String[] args) {

        SinglyLinkedList<String> list = new SinglyLinkedList<String>();

        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");

       list.reverse();
        System.out.println(list);
    }

}
