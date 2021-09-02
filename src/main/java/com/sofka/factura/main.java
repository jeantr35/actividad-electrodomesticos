package com.sofka.factura;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        electrodomesticos electro = new electrodomesticos('A', "nacional");
        System.out.println("El precio base es: " + electro.calcularPrecio());

        Televisor stevi = new Televisor('A', "nacional", 45,true);
        double precio = stevi.calcularPrecio();
        System.out.println("El precio con el impuesto es: " + stevi.getPrecio());
    }
}
