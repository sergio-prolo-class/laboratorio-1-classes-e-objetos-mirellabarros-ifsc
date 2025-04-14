package ifsc.poo;

public class Retangulo {
    private float largura = 0;
    private float altura = 0;

    public void setLargura(float largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("A largura deve ser maior que zero.");
        }
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("A altura deve ser maior que zero.");
        }
    }

    public float getArea() {
        return this.largura * this.altura;
    }

    public float getPerimetro() {
        return 2 * (this.largura + this.altura);
    }
}
