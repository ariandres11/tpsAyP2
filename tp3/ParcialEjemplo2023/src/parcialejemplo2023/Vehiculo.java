
package parcialejemplo2023;

import java.util.Objects;


public class Vehiculo extends Bien {
    private String patente;
    private String marca;
    private int modelo;
    private static final int ANTIGUEDAD = 20;
    private static double alicuotaVehiculo = 0.004;
    private double valuacionFiscal;

    public Vehiculo(String fechaAlta, Titular titular) {
        super(fechaAlta, titular);
    }

    public Vehiculo(String patente, String marca, int modelo, double valuacionFiscal, String fechaAlta, Titular titular) {
        super(fechaAlta, titular);
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.valuacionFiscal = valuacionFiscal;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public static double getAlicuotaVehiculo() {
        return alicuotaVehiculo;
    }

    public static void setAlicuotaVehiculo(double alicuotaVehiculo) {
        Vehiculo.alicuotaVehiculo = alicuotaVehiculo;
    }

    public double getValuacionFiscal() {
        return valuacionFiscal;
    }

    public void setValuacionFiscal(double valuacionFiscal) {
        this.valuacionFiscal = valuacionFiscal;
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
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.patente, other.patente);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", valuacionFiscal=" + valuacionFiscal + '}';
    }
    
    @Override
    public double calcularImpuesto() {
        double impuesto = valuacionFiscal * alicuotaVehiculo;
        return impuesto;
    }
    
}
