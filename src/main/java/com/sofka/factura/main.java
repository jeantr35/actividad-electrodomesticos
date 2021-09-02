package com.sofka.factura;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor ingrese el numero de items a comprar: ");
        int cantidad = scanner.nextInt();

        System.out.print("Por favor ingrese el tipo de electrodomestico: \n" +
                "1) Televisor \n" +
                "2) Nevera\n" +
                "3) Otros\n" +
                "");

        char tipoElectro = scanner.next().charAt(0);
//        if(tipoElectro == 1){
//
//        }


    }
    public double seleccionTelevisor() {

        char consumo; String procedencia; int pulgadas;
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
        double precio = televisor.calcularPrecio();

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


}
