/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomapas;

/**
 *
 * @author ariel
 */
public class EjemploMapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<Integer, String> map = new UnsortedTableMap<Integer, String>();
        map.put(50, "Juan");
        map.put(30, "Ariel");
        map.put(23, null);
        map.put(24, "Maria");

        //Imprimir un valor de la clave de parametro
        //System.out.println(map.get(30));

        System.out.println("\nImprimiendo claves");

        for (Integer i : map.keySet()) {
            System.out.println(i);
        }

        System.out.println("\nImprimiendo valores");

        for (String v : map.values()) {
            System.out.println(v);
        }

        System.out.println("\nImprimiendo claves y valores asociados");

        for (Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

}
