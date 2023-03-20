package Clase04Ejercicio03;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo {

    private List<String> lista;
    private Producto producto;
    private ArrayList<Producto> productos;
    private String archivo;

    public LeerArchivo(String archivo){
        this.productos = new ArrayList<Producto>();
        this.archivo = archivo;
    }

    public ArrayList<Producto> leerProductos(){
        String[] listaProductos;
        try {
            this.lista = Files.readAllLines(Paths.get(this.archivo));

            for (String s: this.lista) {
                listaProductos = s.split(";");
                this.producto = new Producto(listaProductos[0],Double.parseDouble(listaProductos[1]),Integer.parseInt(listaProductos[2]));
                productos.add(producto);
            }
        } catch (Exception e) {
            System.out.println("Archivo no encontrado...");
        }
        return productos;
    }
}
