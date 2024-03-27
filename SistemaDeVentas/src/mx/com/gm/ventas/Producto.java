package mx.com.gm.ventas;

public class Producto {

    private final int idProducto;
    private String Nombre;
    private double precio;
    private static int contadoProductos;

    private Producto() {
        this.idProducto = ++Producto.contadoProductos;
    }

    public Producto(String nombre, double precio) {
        this();
        this.Nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", Nombre=").append(Nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

}
