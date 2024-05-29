package parcialejemplo2023;

import java.util.ArrayList;

public class ParcialEjemplo2023 {

    public static void main(String[] args) {

        Bien bienes[] = new Bien[6];

        //Instancias de bienes
        //Titulares
        Titular titular1 = new Titular("Hernan Gonzalez", "27-44516969-8");
        Titular titular2 = new Titular("Lucia Rivero", "27-46612911-9");
        Titular titular3 = new Titular("Hernan Gonzalez", "22-32512819-1");

        //Vehiculos
        Vehiculo auto1 = new Vehiculo("KLV 611", "Chevrolet", 2011, 1000000, "03/12/2011", titular1);
        Vehiculo auto2 = new Vehiculo("AA 891 OL", "Toyota", 2017, 3000000, "11/03/2017", titular2);
        Vehiculo auto3 = new Vehiculo("24/12/2010", "Ford", 2014, 1500000, "19/05/2014", titular3);
        //Inmuebles
        Inmueble terreno1 = new Inmueble("1783", 8000000, false, "07/08/2009", titular1);
        Inmueble terreno2 = new Inmueble("0982", 5000000, true, "27/10/2003", titular2);
        Inmueble terreno3 = new Inmueble("2834", 10000000, true, "08/03/2010", titular3);
        //

        bienes[0] = auto1;
        bienes[1] = auto2;
        bienes[2] = auto3;

        bienes[3] = terreno1;
        bienes[4] = terreno2;
        bienes[5] = terreno3;

        double totalImpuestos = 0;
        for (int i = 0; i < bienes.length; i++) {
            System.out.println(bienes[i].toString());
            //Calcular imp
            System.out.println("Impuesto: " + bienes[i].calcularImpuesto());
            totalImpuestos += bienes[i].calcularImpuesto();
        }
        System.out.println("Total de los impuestos: " + totalImpuestos);
        
        bienesPorTitular(bienes, titular1);

    }
    
    public static void bienesPorTitular(Bien[] bienes, Titular titular){
        double totalImpuestos = 0;
        System.out.println("Mostrando bienes del titular: " + titular.getNombre());
        for (int i = 0; i < bienes.length; i++) {
            if (bienes[i].titular == titular) {
                //Es un bien del titular elegido
                System.out.println("Bien del titular: " + bienes[i]);
                totalImpuestos += bienes[i].calcularImpuesto();
            }
        }
        if (totalImpuestos != 0) {
            //Si tiene al menos impuestos
            System.out.println("Total impuestos: " + totalImpuestos);
        }
    }

}
