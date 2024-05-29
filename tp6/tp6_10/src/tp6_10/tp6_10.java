package tp6_10;

public class tp6_10 {

    public static void main(String[] args) {
        LinkedPositionalList<String> list = new LinkedPositionalList<>();

        list.addLast("A");
        list.addLast("B");
        list.addLast("C");

        Position<String> pos = list.addLast("D");
        int index = list.indexOf(pos);

        System.out.println("Indice encontrado: " + index);
        list.remove(pos);


        Position<String> pos1 = list.addFirst("E");
        list.addFirst("X");
        int index1 = list.indexOf(pos1);

        System.out.println("Indice encontrado: " + index1);

    }
}
