package tp_1_16;

import javax.swing.JOptionPane;

public class Tp_1_16 {

    public static void main(String[] args) {
        double res;
        int veces = 1000;
        
        JOptionPane.showMessageDialog(null, "El siguiente programa calcula el numero pi a partir de una aproximación usando la serie 4 - 4/3 + 4/5 - 4/7...");
        res = 0.0;
        //pi = 4;
        
        for (int i = 0; i < veces; i++) {
            double termino = 4.0/(2*i+1);
            
            if (i % 2 == 0) {
                res += termino; // Suma si es un término par
            } else {
                res -= termino; // Resta si es un término impar
            }
        }
        
        JOptionPane.showMessageDialog(null, "El numero pi es aproximadamente " + res + "                    ");
    }


}
