package Punto1y2;

/**
 *
 * @author Ariel Sebastián Andrés
 */
public abstract class Cliente {

    private int id;
    private static final double IVA = 21;
    private String direccion;
    //Un cliente tiene un plan
    private Plan plan;

    public Cliente() {
    }

    public Cliente(int id, String direccion, Plan plan) {
        super();
        this.id = id;
        this.direccion = direccion;
        this.plan = plan;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public static double getIVA() {
        return IVA;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", plan=" + plan + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        final Cliente other = (Cliente) obj;
        return this.id == other.id;
    }

    public abstract double calcularFactura();
}
