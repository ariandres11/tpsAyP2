package Punto1y2;

import java.util.Objects;

/**
 *
 * @author Ariel Sebastián Andrés
 */
public class Empresa extends Cliente {

    private String razonSocial; //Nombre de la empresa
    private boolean ivaExento;

    public Empresa(String razonSocial, boolean ivaExento, int id, Plan plan) {
        super(id, razonSocial, plan);
        this.razonSocial = razonSocial;
        this.ivaExento = ivaExento;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public boolean isIvaExento() {
        return ivaExento;
    }

    public void setIvaExento(boolean ivaExento) {
        this.ivaExento = ivaExento;
    }

    public Plan getPlan() {
        return super.getPlan();
    }

    public void setPlan(Plan plan) {
        super.setPlan(plan);
    }

    @Override
    public String toString() {
        return "Empresa{" + "razonSocial=" + razonSocial + ", ivaExento=" + ivaExento + '}';
    }


    @Override
    public double calcularFactura() {
        double tarifa = super.getPlan().getTarifa();
        double res = 0;
        if (ivaExento) {
            res = tarifa;
            return res;
        }else{
            res = tarifa + (tarifa/100 * 21);
            return res;
        }
    }
}
