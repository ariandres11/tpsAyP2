package tp_1_15;

import javax.swing.JOptionPane;

public class Tp_1_15 {
    /*calcular e
    1+ 1/1! + 1/2!...*/

    public static void main(String[] args) {
        float e;
        
        JOptionPane.showMessageDialog(null, "El siguiente programa calcula el numero e a partir de una aproximación usando la serie 1 + 1/1! + 1/2!...");
        
        e= 1;
        
        for (int i = 0; i < 10; i++) {
            e  = 1/factorial(i+1);
        }
        JOptionPane.showMessageDialog(null, "El numero e es aproximadamente " + e);
        
    }

    public static float factorial(int num) {
        float factorial = 1;

        while (num != 0) {
            factorial = factorial * num;
            num--;
        }
        return factorial;
    }
}
