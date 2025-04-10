package ifsc.poo;

public class Lampada {
    private boolean ligada = false;

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public boolean verEstado() {
        return this.ligada;
    }
}
