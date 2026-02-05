public class Main {
    public static void main(String[] args) {

        Carrito carritoJuan= new Carrito("Juan");
        Carrito carritoMaria= new Carrito("Maria");

        carritoJuan.agregarProducto(new Producto("Manzana", 1.0));
        carritoMaria.agregarProducto(new Producto("Pera", 1.2));

        System.out.println("Productos de Juan: ");
        for (Producto p: Carrito.listaProductos){
            System.out.println(p);
        }
    }
}
