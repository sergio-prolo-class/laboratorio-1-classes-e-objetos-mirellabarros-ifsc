package ifsc.poo;

public class Lampada {
    private boolean ligada = false;
    private static int contagem = 0;

    public Lampada() {
        this.ligada = false;
        contagem++;
    }

    public Lampada(boolean valor) {
        this.ligada = valor;
        contagem++;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public boolean verEstado() {
        return this.ligada;
    }

    public static int getContagem() {
        return contagem;
    }
}
