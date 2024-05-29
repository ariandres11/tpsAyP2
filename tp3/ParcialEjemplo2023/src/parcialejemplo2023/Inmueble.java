package parcialejemplo2023;

import java.util.Objects;

public class Inmueble extends Bien {

    private String partida;
    private double valuacionFiscal;
    private static double alicuotaBaldio = 0.006;
    private static double alicuotaEdificado = 0.002;
    private boolean baldio;

    public Inmueble(String fechaAlta, Titular titular) {
        super(fechaAlta, titular);
    }

    public Inmueble(String partida, double valuacionFiscal, boolean baldio, String fechaAlta, Titular titular) {
        super(fechaAlta, titular);
        this.partida = partida;
        this.valuacionFiscal = valuacionFiscal;
        this.baldio = baldio;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public double getValuacionFiscal() {
        return valuacionFiscal;
    }

    public void setValuacionFiscal(double valuacionFiscal) {
        this.valuacionFiscal = valuacionFiscal;
    }

    public static double getAlicuotaBaldio() {
        return alicuotaBaldio;
    }

    public static void setAlicuotaBaldio(double alicuotaBaldio) {
        Inmueble.alicuotaBaldio = alicuotaBaldio;
    }

    public boolean isBaldio() {
        return baldio;
    }

    public void setBaldio(boolean baldio) {
        this.baldio = baldio;
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
        final Inmueble other = (Inmueble) obj;
        if (Double.doubleToLongBits(this.valuacionFiscal) != Double.doubleToLongBits(other.valuacionFiscal)) {
            return false;
        }
        if (this.baldio != other.baldio) {
            return false;
        }
        return Objects.equals(this.partida, other.partida);
    }

    @Override
    public String toString() {
        return "Inmueble{" + "partida=" + partida + ", valuacionFiscal=" + valuacionFiscal + ", baldio=" + baldio + '}';
    }

    @Override
    public double calcularImpuesto() {
        if (baldio) {
            double impuesto = valuacionFiscal * alicuotaBaldio;
            return impuesto;
        } else {
            double impuesto = valuacionFiscal * alicuotaEdificado;
            return impuesto;
        }
    }
}
