package ifsc.poo;

public class Retangulo {
    private float largura;
    private float altura;

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return this.largura * this.altura;
    }

    public float getPerimetro() {
        return 2 * (this.largura + this.altura);
    }
}
