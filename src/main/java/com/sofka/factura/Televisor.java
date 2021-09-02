package com.sofka.factura;

public class Televisor extends electrodomesticos{
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
    public void calcularPrecio(boolean esTDT, int tamanoPulgadas) {
        if(esTDT == true){
            this.precio += 250000;
        }
        if(tamanoPulgadas > 40){
            this.precio += this.precio * 0.3;
        }
    }
}

