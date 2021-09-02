public class electrodomesticos {
    char consumo;
    String procedencia;
    double precio;

    public electrodomesticos(char consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
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

}

public class Televisor extends electrodomesticos{
    int pulgadas;
    boolean TDT;

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
    public void sintonizador(boolean esTDT) {
        if(esTDT == true){

        }
    }
}


