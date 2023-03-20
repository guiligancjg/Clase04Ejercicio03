package Clase04Ejercicio03;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private Carrito[] carrito;

    public Persona(String nombre, String apellido, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.carrito = new Carrito[5];
    }

    public double compras(String[] nombreArchivo){
        double total = 0;
        for (int i = 0; i < carrito.length; i++) {
            carrito[i] = new Carrito(nombreArchivo[i]);
            total += carrito[i].precio();
            mostrarCompras(carrito[i].getProductos(), i, carrito[i].precio());
        }

        return total;
    }

    public void mostrarCompras(ArrayList<Producto> productos, int i, double precio){
        System.out.println("---------- Carrito "+ ++i +" ----------");
        System.out.println("cant\tprecioUnitario\tproducto");
        for (Producto producto : productos) {
            System.out.println(producto.getCantidad() + "\t\t$"+ producto.getPrecio() + "\t\t\t" + producto.getNombre());

        }
        System.out.println("Monto $" + precio +"\n");
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }
}