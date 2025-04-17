package ifsc.poo;

public class Produto {

    // A modelagem proposta pelo exercício não é adequada, já que os atributos preco e desconto devem ser do tipo
    // float ou double e não do tipo int. Além disso, seria interessante ter um méto do para exibir o valor do produto com o
    // desconto aplicado.

    private String nome = "";
    private double preco = 0;
    private double desconto = 0;

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public double getPreco() {
        return this.preco;
    }

    public void setDesconto(double desconto) {
        if (desconto > 0 && desconto < 100) {
            this.desconto = desconto;
        }
    }

    public double getDesconto() {
        return this.desconto;
    }

    public double getPrecoComDesconto() {
        return (100 - this.desconto)/100 * this.preco;
    }

    public String anuncio() {
        return this.nome + ": de R$ " + this.getPreco() + " por APENAS R$ " + this.getPrecoComDesconto() + "!";
    }
}
