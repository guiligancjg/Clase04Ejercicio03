package Clase04Ejercicio03;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;
    private LeerArchivo leerArchivo;


    public Carrito(String nombreArchivo){
        this.productos = new ArrayList<>();
        leerArchivo = new LeerArchivo(nombreArchivo);
        this.productos = leerArchivo.leerProductos();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public double precio(){
        double total = 0;
        for (Producto lista: this.productos) {
            total += lista.getPrecio() * lista.getCantidad();
        }
        return total;
    }

}




