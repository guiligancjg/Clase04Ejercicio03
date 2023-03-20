package Clase04Ejercicio03;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(){

    }

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
