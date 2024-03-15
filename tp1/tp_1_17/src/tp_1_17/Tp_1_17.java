package tp_1_17;

import javax.swing.JOptionPane;

public class Tp_1_17 {

    public static void main(String[] args) {
        float hipotenusa;

        JOptionPane.showMessageDialog(null, "El siguiente programa calculara la medida de la hipotenusa de un triangulor rectangulo por favor ingrese los siguientes datos.");
        String dato1 = JOptionPane.showInputDialog(null, "Longitud del primer cateto");
        float primerCateto = Float.parseFloat(dato1);
        
        
        

        String dato2 = JOptionPane.showInputDialog(null, "Longitud del segundo cateto");
        float segundoCateto = Float.parseFloat(dato2);
        
        hipotenusa  = (float) Math.sqrt((float) (Math.pow(primerCateto, 2.0) + Math.pow(segundoCateto, 2.0)));

        JOptionPane.showMessageDialog(null, "La hipotenusa del triangulo mide aproximadamente " + hipotenusa);
    }

}
