package mx.com.gm.ventas;

public class Orden {

    private int idOrden;
    private static int contadorOrdenes;
    private Producto productos[];
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos" + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostarOrden() {
        double totalOrden = this.calcularTotal();
        System.out.println("Id Orden: " + this.idOrden + " " + "Total Orden: $" + totalOrden);
         System.out.println("Productos de la orden: ");
         for (int i = 0; i < this.contadorProductos; i++) {
             System.out.println(this.productos[i]);
        }
    }

}
