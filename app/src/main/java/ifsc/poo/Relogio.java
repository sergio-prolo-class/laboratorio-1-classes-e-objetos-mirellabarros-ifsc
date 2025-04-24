package ifsc.poo;

public class Relogio {
    private byte hora = 0;
    private byte minuto = 0;
    private byte segundo = 0;
    private boolean ampm = false;

    // Inicializa o relógio somente determinando as horas
    public Relogio(byte hora) {
        this.setHora(hora);
        this.minuto = 0;
        this.segundo = 0;
    }

    // Inicializa o relógio determinando as horas e os minutos
    public Relogio(byte hora, byte minuto) {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.segundo = 0;
    }

    // Inicializa o relógio determinando as horas, os minutos e os segundos
    public Relogio(byte hora, byte minuto, byte segundo) {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    // Ajusta o formato do horário para 12h ou 24h
    public void setAmpm(boolean ampm) {
        this.ampm = ampm;
    }

    // Retorna o horário do relógio conforme o formato 12h ou 24h.
    public String getHorario() {
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

    // Ajusta as horas, os minutos e os segundos de uma só vez.
    public void ajustarHora(byte hora, byte minuto, byte segundo) {
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            System.out.println("Erro ao ajustar hora");
        }
    }

    // Ajusta somente as horas do horário do relógio
    public boolean setHora(byte hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            return true;
        } else {
            this.hora = 0;
            return false;
        }
    }

    // Retorna as horas do relógio
    public byte getHora() {
        return hora;
    }

    // Ajusta somente os minutos do horário do relógio
    public boolean setMinuto(byte minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
            return true;
        } else {
            this.minuto = 0;
            return false;
        }
    }

    // Retorna os minutos do relógio
    public byte getMinuto() {
        return minuto;
    }

    // Ajusta somente os segundos do horário do relógio
    public boolean setSegundo(byte segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
            return true;
        } else {
            this.segundo = 0;
            return false;
        }
    }

    // Retorna os segundos do relógio
    public byte getSegundo() {
        return segundo;
    }

    // Avança o relógio em 1 hora
    public void avancaHora() {
        this.hora++;
        if (this.hora == 24) {
            this.hora = 0;
        }
    }

    // Avança o relógio em 1 minuto
    public void avancaMinuto() {
        this.minuto++;
        if (this.minuto == 60) {
            this.minuto = 0;
            this.avancaHora();
        }
    }

    // Avança o relógio em 1 segundo
    public void avancaSegundo() {
        this.segundo++;
        if (this.segundo == 60) {
            this.segundo = 0;
            this.avancaMinuto();
        }
    }

    // Sincroniza o relógio atual com outro relógio.
    public void sync(Relogio r) {
        this.ajustarHora(r.getHora(), r.getMinuto(), r.getSegundo());
    }

    // Retorna a diferença, em segundos, entre o relógio 1 e o relógio 2.
    public int diferenca(Relogio r) {
        int segundos = this.getSegundo() - r.getSegundo();
        int minutos = (this.getMinuto() - r.getMinuto()) * 60;
        int horas = (this.getHora() - r.getHora()) * 360;
        return segundos + minutos + horas;
    }
}
