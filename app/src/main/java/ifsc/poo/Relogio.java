package ifsc.poo;

public class Relogio {
    private byte hora = 0;
    private byte minuto = 0;
    private byte segundo = 0;
    private boolean ampm = false;

    public void ajustarHora(byte hora, byte minuto, byte segundo) {
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            System.out.println("Erro ao ajustar hora");
        }
    }

    public void setAmpm(boolean ampm) {
        this.ampm = ampm;
    }

    public String getHora() {
        String hora = "";
        String resultado;

        if (ampm) {
            // Para manter o padrão com dois dígitos
            String horaCalculada = (this.hora % 12 == 0) ? "12" : String.valueOf(this.hora % 12);
            hora = horaCalculada.length() == 1 ? "0" + horaCalculada : horaCalculada;
        } else {
            hora = this.hora < 10 ? "0" + this.hora : String.valueOf(this.hora);
        }

        String minuto = this.minuto < 10 ? "0" + this.minuto : String.valueOf(this.minuto);
        String segundo = this.segundo < 10 ? "0" + this.segundo : String.valueOf(this.segundo);

        if (ampm) {
            String complementoHora = this.hora < 12 ? "am" : "pm";
            resultado = hora + complementoHora + " " + minuto + "m " + segundo + "s";
        } else {
            resultado = hora + ":" + minuto + ":" + segundo;
        }

        return resultado;
    }

    public void avancaHora() {
        this.hora++;
        if (this.hora == 24) {
            this.hora = 0;
        }
    }

    public void avancaMinuto() {
        this.minuto++;
        if (this.minuto == 60) {
            this.minuto = 0;
            this.avancaHora();
        }
    }

    public void avancaSegundo() {
        this.segundo++;
        if (this.segundo == 60) {
            this.segundo = 0;
            this.avancaMinuto();
        }
    }
}
