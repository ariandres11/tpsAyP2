package parcialejemplo2023;

import java.util.Objects;

public abstract class Bien {
    public Titular titular;
    private String fechaAlta;

    public Bien(String fechaAlta, Titular titular) {
        this.fechaAlta = fechaAlta;
        this.titular = titular;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    
    public abstract double calcularImpuesto();

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
        final Bien other = (Bien) obj;
        return Objects.equals(this.fechaAlta, other.fechaAlta);
    }

    @Override
    public String toString() {
        return "Bien{" + "fechaAlta=" + fechaAlta + '}';
    }

}
