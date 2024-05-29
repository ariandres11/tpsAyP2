package tp7_2;

import java.util.Stack;

public class Tp7_2 {

    static LinkedBinaryTree<String> arbol = new LinkedBinaryTree<>();
    static Position<String>[] pos = new Position[19];

    public static void main(String[] args) {
        crearArbol();
        recorrerPostOrder();
    }

    public static void crearArbol() {

        pos[0] = arbol.addRoot("*");

        pos[1] = arbol.addRight(pos[0], "8");
        pos[2] = arbol.addLeft(pos[0], "/");

        pos[3] = arbol.addRight(pos[2], "+");
        pos[4] = arbol.addLeft(pos[2], "*");

        pos[5] = arbol.addRight(pos[4], "-");
        pos[6] = arbol.addLeft(pos[4], "+");
        pos[7] = arbol.addRight(pos[3], "-");
        pos[8] = arbol.addLeft(pos[3], "+");

        pos[9] = arbol.addRight(pos[5], "1");
        pos[10] = arbol.addLeft(pos[5], "2");
        pos[11] = arbol.addRight(pos[6], "2");
        pos[12] = arbol.addLeft(pos[6], "5");
        pos[13] = arbol.addRight(pos[7], "1");
        pos[14] = arbol.addLeft(pos[7], "-");
        pos[15] = arbol.addRight(pos[8], "9");
        pos[16] = arbol.addLeft(pos[8], "2");

        pos[17] = arbol.addRight(pos[14], "2");
        pos[18] = arbol.addLeft(pos[14], "7");
    }

    //Obtener la notacion postfija
    public static void recorrerPostOrder() {
        Stack stack = new Stack();
        for (Position<String> i : arbol.postorder()) {
            System.out.println(i.getElement());
        }

        for (Position<String> i : arbol.postorder()) {
            chequearOperador(i, stack);
        }
        System.out.println("Res: " + stack.pop());
    }

    public static void chequearOperador(Position<String> i, Stack<String> stack) {
        switch (i.getElement().charAt(0)) {
            case '+':
                operar(0, stack);
                break;
            case '-':
                operar(1, stack);
                break;
            case '*':
                operar(2, stack);
                break;
            case '/':
                operar(3, stack);
                break;
            default:
                stack.push(i.getElement());
        }
    }

    public static void operar(int op, Stack<String> stack) {
        double op2 = Double.parseDouble(stack.pop());
        double op1 = Double.parseDouble(stack.pop());

        switch (op) {
            case 0:
                stack.push("" + (op1 + op2));
                break;
            case 1:
                stack.push("" + (op1 - op2));
                break;
            case 2:
                stack.push("" + (op1 * op2));
                break;
            case 3:
                stack.push("" + (op1 / op2));
                break;
        }

    }

}
