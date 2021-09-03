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
//    public double calcularPrecio(){
//        return  impuesto(this.TDT, this.pulgadas);
//    }
    public double calcularPrecio() {
        int tamanoPulgadas; boolean esTDT;
        precio = super.calcularPrecio();
        tamanoPulgadas = getPulgadas();
        esTDT = isTDT();
        if(tamanoPulgadas > 40){
            precio += this.precio * 0.3;
            System.out.println("Se adiciona el 30%");
        }
        if(esTDT == true){
            precio += 250000;
            System.out.println("Se adiciona 250.000");
        }

        return precio;
    }
}

