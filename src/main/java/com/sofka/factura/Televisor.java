package com.sofka.factura;

public class Televisor extends Electrodomesticos{
    int pulgadas; boolean TDT;

    public Televisor(char consumo, String procedencia, int pulgadas, boolean TDT) {
        super(consumo, procedencia);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }
    public int getPulgadas() {
        return pulgadas;
    }
    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
    public boolean isTDT() {
        return TDT;
    }
    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    public double calcularPrecio(){
        return super.calcularPrecio() + impuesto(this.TDT, this.pulgadas);
    }
    public double impuesto(boolean esTDT, int tamanoPulgadas) {
        precio = super.getPrecio();
        if(esTDT == true){
            precio += 250000;
        }
        if(tamanoPulgadas > 40){
            precio += this.precio * 0.3;
        }
        return precio;
    }
}

