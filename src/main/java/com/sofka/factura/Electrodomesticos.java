package com.sofka.factura;

public class Electrodomesticos {
    char consumo;
    String procedencia;
    double precio;

    public Electrodomesticos() {
        this.consumo = 'A';
        this.procedencia = "nacional";
        this.precio = 0.00;
    }

    public Electrodomesticos(char consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
        this.precio = 0.00;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public char getConsumo() {
        return consumo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecio(){
        switch (this.consumo){
            case 'A': {
                this.precio += 450000;
                break;
            }
            case 'B': {
                this.precio += 350000;
                break;
            }
            case 'C': {
                this.precio += 250000;
                break;
            }
        }
        switch (procedencia){
            case "nacional":{
                this.precio += 250000;
                break;
            }
            case "importado":{
                this.precio += 350000;
                break;
            }
        }
        return this.precio;
    }
}
