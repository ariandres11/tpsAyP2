package tp_1_14_fact;

import javax.swing.JOptionPane;

public class Tp_1_14_fact {

    public static void main(String[] args) {
        
        int numFact;
        
        String dato = JOptionPane.showInputDialog(null, "Ingrese un numero entero no negativo y el programa calculara su factorial");
        int num = Integer.parseInt(dato);
        
        numFact = factorial(num);
        
        JOptionPane.showMessageDialog(null, "El factorial del numero " + num + " es : " + numFact);
        
    }

    public static int factorial(int num) {
        int factorial = 1;

        while (num != 0) {
            factorial = factorial * num;
            num--;
        }
        return factorial;
    }

}
