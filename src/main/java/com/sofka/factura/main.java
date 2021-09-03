package com.sofka.factura;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {

        Controlador controlador = new Controlador();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese el numero de items a comprar: ");
        int cantidad = scanner.nextInt();
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
            case '1': controlador.seleccionTelevisor();
//            case '2': controlador.seleccionNevera();
            case '3': controlador.seleccionElectrodomesticos();
        }
    }
}
