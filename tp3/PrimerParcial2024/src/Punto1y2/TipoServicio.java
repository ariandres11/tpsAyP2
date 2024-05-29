
package Punto1y2;

/**
 *
 * @author Ariel Sebastián Andrés
 */
public class TipoServicio {
    private int id;
    private String descripcion;

    public TipoServicio() {
    }

    public TipoServicio(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoServicio{" + "id=" + id + ", descripcion=" + descripcion + '}';
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
        final TipoServicio other = (TipoServicio) obj;
        return this.id == other.id;
    }
    
    
}
