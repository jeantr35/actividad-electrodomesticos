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

        int tipoElectro = scanner.nextInt();
    }
}
