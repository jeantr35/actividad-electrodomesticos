public class electrodomesticos {
    char consumo;
    String procedencia;
    double precio;

    public electrodomesticos() {
        this.consumo = 'A';
        this.procedencia = "nacional";
        this.precio = 0.00;
    }

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

class Nevera extends electrodomesticos{
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
            return precio * 0.05 * (extra);
        }
        else{return 0.00;}
    }
}