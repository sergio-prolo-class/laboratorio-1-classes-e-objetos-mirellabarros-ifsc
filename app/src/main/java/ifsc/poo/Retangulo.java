package ifsc.poo;

public class Retangulo {
    private float largura = 0;
    private float altura = 0;
    private static float maiorArea = 0;
    private static float menorPerimetro = Float.MAX_VALUE;
    private static Retangulo retanguloMaiorArea = null;
    private static Retangulo retanguloMenorPerimetro = null;

    public Retangulo(float largura, float altura) {
        setLargura(largura);
        setAltura(altura);
        atualizaValores(this);
    }

    public boolean setLargura(float largura) {
        if (largura > 0) {
            this.largura = largura;
            return true;
        } else {
            this.largura = 1;
            return false;
        }
    }

    public boolean setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
            return true;
        } else {
            this.altura = 1;
            return false;
        }
    }

    public float getArea() {
        return this.largura * this.altura;
    }

    public float getPerimetro() {
        return 2 * (this.largura + this.altura);
    }

    public static Retangulo getRetanguloMaiorArea() {
        return retanguloMaiorArea;
    }

    public static Retangulo getRetanguloMenorPerimetro() {
        return retanguloMenorPerimetro;
    }

    private static void atualizaValores(Retangulo retangulo) {
        if (retanguloMaiorArea == null || retangulo.getArea() > maiorArea) {
            maiorArea = retangulo.getArea();
            retanguloMaiorArea = retangulo;
        }
        if (retanguloMenorPerimetro == null || retangulo.getPerimetro() < menorPerimetro) {
            menorPerimetro = retangulo.getPerimetro();
            retanguloMenorPerimetro = retangulo;
        }
    }
}
