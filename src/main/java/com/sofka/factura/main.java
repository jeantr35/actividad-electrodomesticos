package com.sofka.factura;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        boolean salir = false;
        double precioTotal = 0.0;
        Controlador controlador = new Controlador();
        Scanner scanner = new Scanner(System.in);

        while (!salir){
            double precioItem = 0;
            System.out.print("Por favor ingrese el tipo de electrodomestico: \n" +
                    "1) Televisor \n" +
                    "2) Nevera\n" +
                    "3) Otros\n" +
                    "");
            char tipoElectro = scanner.next().charAt(0);
            System.out.println("Ingrese el consumo (A,B,C): ");
            char consumo = scanner.next().charAt(0);
            System.out.println("Ingrese la procedencia (nacional,importado): ");
            String procedencia = scanner.next();

            switch (tipoElectro){
                case '1':
                    precioItem = controlador.seleccionTelevisor(consumo, procedencia);
                    precioTotal += precioItem;
                    System.out.println(precioItem);
                    break;
                case '2':
                    precioItem = controlador.seleccionNevera(consumo,procedencia);
                    precioTotal += precioItem;
                    System.out.println(precioItem);
                    break;
                case '3':
                    precioItem = controlador.seleccionElectrodomesticos(consumo,procedencia);
                    precioTotal += precioItem;
                    System.out.println(precioItem);
                    break;
            }

            System.out.print("Desea finalizar?:\n" +
                    "1) Si \n" +
                    "2) No");
            char decision = scanner.next().charAt(0);
            if (decision == '1'){salir=true;}

        }


    }
}
