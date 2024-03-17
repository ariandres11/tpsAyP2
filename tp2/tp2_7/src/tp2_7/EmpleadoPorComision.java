
package tp2_7;


public class EmpleadoPorComision extends Empleado{
    double porcentajeComision;
    double ventasBrutas;

    public EmpleadoPorComision() {
    }
    
    
    public EmpleadoPorComision(double porcentajeComision, double ventasBrutas, int dni, String nombre) {
        super(dni, nombre);
        this.porcentajeComision = porcentajeComision;
        this.ventasBrutas = ventasBrutas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }
    
    
}


