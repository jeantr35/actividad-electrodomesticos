package com.sofka.factura;

class Nevera extends Electrodomesticos {
    int capacidad;

    public Nevera(char consumo, String procedencia, int capacidad) {
        this.consumo = consumo;
        this.procedencia = procedencia;
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double valorExtra(double precio){
        if (this.capacidad > 120){
            int extra = (this.capacidad - 120) / 10;
            return precio * 0.05 * extra;
        }
        else{return 0.00;}
    }

    public double calcularPrecio(){
        return super.calcularPrecio() + valorExtra(getPrecio());
    }

}
