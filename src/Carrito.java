import java.util.ArrayList;

public class Carrito {

    /*Error intencionado*/
    public static ArrayList<Producto> listaProductos= new ArrayList<>();

    private String cliente;

    public Carrito(String cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p){
        listaProductos.add(p);
    }
}
