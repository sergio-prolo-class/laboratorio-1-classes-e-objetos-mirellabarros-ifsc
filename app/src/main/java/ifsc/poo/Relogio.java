package ifsc.poo;

public class Relogio {
    private byte hora;
    private byte minuto;
    private byte segundo;

    public void ajustarHora(byte hora, byte minuto, byte segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String getHora() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public void avancaHora(byte hora) {
        this.hora++;
    }

    public void avancaMinuto(byte minuto) {
        this.minuto++;
    }

    public void avancaSegundo(byte segundo) {
        this.segundo++;
    }
}
