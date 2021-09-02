public class electrodomesticos {
    char consumo;
    String procedencia;

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
}
