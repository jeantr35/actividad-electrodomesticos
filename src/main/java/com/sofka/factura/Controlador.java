package com.sofka.factura;

import java.util.Scanner;

public class Controlador {
    public double seleccionTelevisor() {

        char consumo; String procedencia; int pulgadas; double precio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el consumo (A,B,C): ");
        consumo = scanner.next().charAt(0);
        System.out.println("Ingrese la procedencia (nacional,importado): ");
        procedencia = scanner.next();
        System.out.println("Ingrese las pulgadas: ");
        pulgadas = scanner.nextInt();
        System.out.println("¿Tiene sintonizador de TDT? (si/no)");
        String esTDT = scanner.next();
        boolean tdt = tieneSintonizador(esTDT);
        Televisor televisor = new Televisor(consumo, procedencia, pulgadas, tdt);
        precio = televisor.calcularPrecio();

        return precio;
    }
    public boolean tieneSintonizador(String esTDT){

        boolean tdt = false;
        if (esTDT == "si") {
            tdt = true;
        } else if (esTDT == "no") {
            tdt = false;
        }
        return tdt;
    }

    public double seleccionElectrodomesticos(){

        char consumo; String procedencia; double precio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el consumo (A,B,C): ");
        consumo = scanner.next().charAt(0);
        System.out.println("Ingrese la procedencia (nacional,importado): ");
        procedencia = scanner.next();
        Electrodomesticos electrodomestico = new Electrodomesticos(consumo,procedencia);
        precio = electrodomestico.calcularPrecio();

        return precio;
    }
}
