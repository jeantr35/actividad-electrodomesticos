package com.sofka.factura;

import java.util.Scanner;

public class Controlador {
    public double seleccionTelevisor(char consumo, String procedencia) {

        int pulgadas; double precio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las pulgadas: ");
        pulgadas = scanner.nextInt();
        System.out.println("¿Tiene sintonizador de TDT? (si/no)");
        char esTDT = scanner.next().charAt(0);
        boolean tdt = tieneSintonizador(esTDT);
        Televisor televisor = new Televisor(consumo, procedencia, pulgadas, tdt);
        precio = televisor.calcularPrecio();

        return precio;
    }
    public boolean tieneSintonizador(char esTDT){

        boolean tdt = false;
        if (esTDT == 's') {
            tdt = true;
        } else if (esTDT == 'n') {
            tdt = false;
        }
        return tdt;
    }
        public double seleccionNevera(char consumo, String procedencia){

        int capacidad; double precio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la capacidad (lt): ");
        capacidad = scanner.nextInt();
        Nevera nevera = new Nevera(consumo, procedencia, capacidad);
        precio = nevera.calcularPrecio();

        return precio;
    }
    public double seleccionElectrodomesticos(char consumo, String procedencia){

        double precio;
        Scanner scanner = new Scanner(System.in);
        Electrodomesticos electrodomestico = new Electrodomesticos(consumo,procedencia);
        precio = electrodomestico.calcularPrecio();

        return precio;
    }
}
