
package Punto1y2;

import java.util.Objects;

/**
 *
 * @author Ariel Sebastián Andrés
 */
public class Plan {
    private double tarifa;
    private TipoServicio tipoServicio;
    private  Servicio servicio;

    public Plan() {
    }

    public Plan(double tarifa, TipoServicio tipoServicio, Servicio servicio) {
        this.tarifa = tarifa;
        this.tipoServicio = tipoServicio;
        this.servicio = servicio;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    

    @Override
    public String toString() {
        return "Plan{" + "tarifa=" + tarifa + ", tipoServicio=" + tipoServicio + ", servicio=" + servicio + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plan other = (Plan) obj;
        if (!Objects.equals(this.tipoServicio, other.tipoServicio)) {
            return false;
        }
        return Objects.equals(this.servicio, other.servicio);
    }

   

    
}
