package Clase04Ejercicio03;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String carrito1 = "src/Clase04Ejercicio03/productos01.txt";
        String carrito2 = "src/Clase04Ejercicio03/productos02.txt";
        String carrito3 = "src/Clase04Ejercicio03/productos03.txt";
        String carrito4 = "src/Clase04Ejercicio03/productos04.txt";
        String carrito5 = "src/Clase04Ejercicio03/productos05.txt";
        String[] listaCarrito = new String[]{carrito1,carrito2,carrito3,carrito4,carrito5};

        Persona persona = new Persona("Carlos Jorge","Gramajo",28919989);

        System.out.println("Cliente : " + persona.getNombre() + " " +persona.getApellido());
        System.out.println("DNI: " + persona.getDni());
        System.out.println("Total a pagar: $" + persona.compras(listaCarrito));

    }

}
