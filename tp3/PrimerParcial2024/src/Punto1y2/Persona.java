package Punto1y2;

import java.util.Objects;

/**
 *
 * @author Ariel Sebastián Andrés
 */
public class Persona extends Cliente {

    private String nombre;

    public Persona(String nombre, int id, Plan plan) {
        super(id, nombre, plan);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Plan getPlan() {
        return super.getPlan();
    }

    public void setPlan(Plan plan) {
        super.setPlan(plan);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }


    @Override
    public double calcularFactura() {
        double tarifa = super.getPlan().getTarifa();
        double total = tarifa + tarifa/100*Cliente.getIVA();
        return total;
    }

}
