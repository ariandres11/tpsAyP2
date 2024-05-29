/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3_5;

/**
 *
 * @author Mariano
 */
public class PruebaLista {

    public static void main(String[] args) {
        System.out.println("addCombineAfter");
        pruebaPunto3();
        System.out.println();
        System.out.println("addCombineBefore");
        pruebaPunto4();
    }

    public static void pruebaPunto3() {
        SinglyLinkedList<String> lista = new SinglyLinkedList<>();
        lista.addLast("A");
        lista.addLast("B");
        lista.addLast("C");
        lista.addLast("D");
        System.out.println(lista.toString());
        SinglyLinkedList<String> l = new SinglyLinkedList<>();
        l.addLast("W");
        l.addLast("X");
        l.addLast("Y");
        l.addLast("Z");
        System.out.println(l);
        System.out.println("Res esperado: (A, W, B, X, C, Y, D, Z)");

        lista.addCombineAfter(l);

        System.out.println("Res obtenido: " + lista);

        lista = new SinglyLinkedList<>();
        lista.addLast("A");
        lista.addLast("B");
        lista.addLast("C");
        lista.addLast("D");

        l = new SinglyLinkedList<>();
        l.addLast("W");
        l.addLast("X");
        System.out.println("Res esperado: (A, W, B, X, C, D)");

        lista.addCombineAfter(l);
        System.out.println("Res obtenido: " + lista);

        lista = new SinglyLinkedList<>();
        lista.addLast("A");
        lista.addLast("B");

        l = new SinglyLinkedList<>();
        l.addLast("W");
        l.addLast("X");
        l.addLast("Y");
        l.addLast("Z");

        System.out.println("Res esperado: (A, W, B, X, Y, Z)");
        lista.addCombineAfter(l);
        System.out.println("Res obtenido: " + lista);

        lista = new SinglyLinkedList<>();
        lista.addLast("A");
        lista.addLast("B");
        lista.addLast("C");
        lista.addLast("D");

        //Vacia
        lista.addCombineAfter(new SinglyLinkedList<>());

        lista = new SinglyLinkedList<>();
        l = new SinglyLinkedList<>();
        l.addLast("W");
        l.addLast("X");
        l.addLast("Y");
        l.addLast("Z");
        System.out.println(lista);

        lista.addCombineAfter(l);
        System.out.println(lista);

        System.out.println("Ambos vacios");
        lista = new SinglyLinkedList<>();
        l = new SinglyLinkedList<>();
        lista.addCombineAfter(l);
        System.out.println(lista);
    }

    public static void pruebaPunto4() {
        SinglyLinkedList<String> lista = new SinglyLinkedList<>();
        lista.addLast("A");
        lista.addLast("B");
        lista.addLast("C");
        lista.addLast("D");
        System.out.println(lista);
        SinglyLinkedList<String> l = new SinglyLinkedList<>();
        l.addLast("W");
        l.addLast("X");
        l.addLast("Y");
        l.addLast("Z");
        System.out.println(l);

        System.out.println("Res esperado: (W, A, X, B, Y, C, Z, D)");

        lista.addCombineBefore(l);
        System.out.println("Res obtenido: " + lista);


        lista = new SinglyLinkedList<>();
        lista.addLast("A");
        lista.addLast("B");
        lista.addLast("C");
        lista.addLast("D");
        l = new SinglyLinkedList<>();
        l.addLast("W");
        l.addLast("X");
        lista.addCombineBefore(l);
        System.out.println(lista);

        lista = new SinglyLinkedList<>();
        lista.addLast("A");
        lista.addLast("B");
        l = new SinglyLinkedList<>();
        l.addLast("W");
        l.addLast("X");
        l.addLast("Y");
        l.addLast("Z");
        lista.addCombineBefore(l);
        System.out.println(lista);

        lista = new SinglyLinkedList<>();
        lista.addLast("A");
        lista.addLast("B");
        lista.addLast("C");
        lista.addLast("D");
        lista.addCombineBefore(new SinglyLinkedList<>());
        System.out.println(lista);

        lista = new SinglyLinkedList<>();
        l = new SinglyLinkedList<>();
        l.addLast("W");
        l.addLast("X");
        l.addLast("Y");
        l.addLast("Z");
        lista.addCombineBefore(l);
        System.out.println(lista);

        System.out.println("Ambos vacios");
        lista = new SinglyLinkedList<>();
        l = new SinglyLinkedList<>();
        lista.addCombineBefore(l);
        System.out.println(lista);
    }
}
