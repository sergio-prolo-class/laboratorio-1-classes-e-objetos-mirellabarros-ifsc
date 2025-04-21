package ifsc.poo;

import java.util.Arrays;

public class Produto {
    //Você acha que a modelagem desse produto é boa? Se não, onde você mudaria algo, e por
    //quê? Faça um comentário no seu código-fonte incluindo essa resposta.
    // A modelagem proposta pelo exercício pode ser melhorada. O atributo preço é do tipo inteiro e o retorno do méto do
    // getPreco() é do tipo float. O ideal é que fossem do mesmo tipo. Os atributos preco e desconto poderiam ser do
    // tipo double para aceitar valores com casas decimais com maior precisão. Além disso, poderia ter um méto do para
    // exibir o valor do produto com o desconto aplicado.

    // Armazena os atributos básicos de um produto
    private String nome = "";
    private int preco = 0;
    private int desconto = 0;
    private final String codigo;

    // Armazena o total de produtos criados
    private static int produtosCriados = 0;
    // Armazena os produtos criados no vetor
    private static Produto[] registroProdutos = new Produto[50];

    // Méto do construtor da classe
    public Produto(String nome, int preco) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setDesconto(0);
        String c1 = Integer.toString(produtosCriados % 1000);
        String c2 = Integer.toString((produtosCriados + 1) / 1000);
        while (c1.length() < 3) {
            c1 = "0" + c1;
        }
        while (c2.length() < 3) {
            c2 = "0" + c2;
        }
        this.codigo = "CD:" + c2 + "-" + c1;
        this.atualizaRegistroProdutos();
        produtosCriados++;
    }

    // Define o nome do produto
    // Retorna true caso o nome não seja nulo ou vazio
    public boolean setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }

    // Retorna o nome do produto
    public String getNome() {
        return this.nome;
    }

    // Define o preço do produto
    // Retorna true caso o preço seja maior que 0
    public boolean setPreco(int preco) {
        if (preco > 0) {
            this.preco = preco;
            return true;
        } else {
            return false;
        }
    }

    // Retorna o preço do produto
    public float getPreco() {
        return this.preco;
    }

    // Define o desconto do produto
    // Retorna true caso o desconto seja maior ou igual a 0 e menor do que 100
    public boolean setDesconto(int desconto) {
        if (desconto >= 0 && desconto < 100) {
            this.desconto = desconto;
            return true;
        } else {
            return false;
        }
    }

    // Retorna o desconto do produto
    public int getDesconto() {
        return this.desconto;
    }

    // Retorna o código do produto
    public String getCodigo() {
        return this.codigo;
    }

    // Atualiza o vetor de registro dos produtos de forma circular, conforme solicitado na questão
    // Quando novos produtos são criados, o produto mais antigo é esquecido para dar
    // espaço ao mais novo.
    private void atualizaRegistroProdutos() {
        int posicao = produtosCriados % registroProdutos.length;
        registroProdutos[posicao] = this;
    }

    // Retorna um vetor de strings com as informações dos produtos
    public static String[] listaDeProdutos() {
        // vetor de produtos com tamanho de registroProdutos + cabeçalho
        String[] listaDeProdutos = new String[registroProdutos.length + 1];
        String l1 = "Código;Nome;Preço;Desconto";
        listaDeProdutos[0] = l1;
        String linha = "";
        for (int i = 0; i < registroProdutos.length; i++) {
            // Sai do laço de repetição se não houver mais elementos no vetor
            if (registroProdutos[i] != null) {
                linha = registroProdutos[i].getCodigo() + ";" + registroProdutos[i].getNome() + ";" + String.format("%.2f", registroProdutos[i].getPreco()) + ";" + registroProdutos[i].getDesconto();
                listaDeProdutos[i + 1] = linha;
            } else {
                break;
            }
        }
        return listaDeProdutos;
    }

    public String anuncio() {
        float precoComDesconto = (((float) (100 - this.getDesconto()) / 100) * this.getPreco());
        return this.nome + ": de R$ " +String.format("%.2f", this.getPreco()) + " por APENAS R$ " + precoComDesconto + "!";
    }
}
