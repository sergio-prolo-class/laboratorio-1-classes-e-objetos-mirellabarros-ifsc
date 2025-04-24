package ifsc.poo;

public class Navio {
    private int tamanho = 0;
    private int orientacao = 0; // 0 para horizontal e 1 para vertical
    private int linha = 0;
    private int coluna = 0;
    private char simbolo = ' ';
    private int[] posicaoAtingido = new int[5];
    private boolean afundado = false;

    public Navio(int tamanho, int orientacao, int linha, int coluna, char simbolo) {
        this.tamanho = tamanho;
        this.orientacao = orientacao;
        this.linha = linha;
        this.coluna = coluna;
        this.simbolo = simbolo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getOrientacao() {
        return orientacao;
    }

    public boolean verificaPosicao(int linha, int coluna) {
        if (this.orientacao == 0) {
            return this.linha == linha && this.coluna >= coluna + this.tamanho && this.coluna <= coluna + this.tamanho;
        } else {
            return this.coluna == coluna && this.linha >= linha + this.tamanho && this.linha <= linha + this.tamanho;
        }
    }

    public char getSimbolo() {
        return simbolo;
    }

}
