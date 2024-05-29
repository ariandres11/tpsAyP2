package tp_2_11;

import java.util.Arrays;

public class Factura implements PorPagar {

    String nombreProveedor;
    int numFactura;
    String fechaCompra;
    Item[] articulos = new Item[10];
    int itemsCargados = 0;

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public Factura(String nombreProveedor, int numFactura, String fechaCompra) {
        this.nombreProveedor = nombreProveedor;
        this.numFactura = numFactura;
        this.fechaCompra = fechaCompra;
    }

    public void agregarItem(String descripcion, int cantidad, int precioUnitario) {
        Item item = new Item(descripcion, precioUnitario, cantidad);
        articulos[itemsCargados] = item;
        itemsCargados++;
    }

    /*StringBuilder sb = new StringBuilder();
    for (Item item : articulos

    
        ) {
        if (item != null) {
            sb.append(item.toString());
            sb.append(", ");
        }
    }*/
    @Override
    public double obtenerPago() {
        double total = 0;
        for (int i = 0; i < itemsCargados - 1; i++) {
            int precioUnitario = articulos[i].getPrecioUnitario();
            int cantidadComprada = articulos[i].getCantidadComprada();

            total += precioUnitario * cantidadComprada;
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : articulos) {
            if (item != null) {
                sb.append(item.toString());
                sb.append(", ");
            }
        }

        // Elimino la ult coma y espacio
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }

        return "Factura \nProveedor: " + nombreProveedor + ", Numero de factura: " + numFactura + ", Fecha de compra: " + fechaCompra + ", Cantidad de articulos: "
                + itemsCargados + ", Articulos: " + sb.toString();
    }

    private class Item {

        String descripcion;
        int precioUnitario;
        int cantidadComprada;

        public Item(String descripcion, int precioUnitario, int cantidadComprada) {
            this.descripcion = descripcion;
            this.precioUnitario = precioUnitario;
            this.cantidadComprada = cantidadComprada;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public int getPrecioUnitario() {
            return precioUnitario;
        }

        public void setPrecioUnitario(int precioUnitario) {
            this.precioUnitario = precioUnitario;
        }

        public int getCantidadComprada() {
            return cantidadComprada;
        }

        public void setCantidadComprada(int cantidadComprada) {
            this.cantidadComprada = cantidadComprada;
        }

        @Override
        public String toString() {
            return "\nItem Descripcion: " + descripcion + ", Cantidad: " + cantidadComprada + ", Precio unitario: " + precioUnitario
                   ;
        }
    }
}
