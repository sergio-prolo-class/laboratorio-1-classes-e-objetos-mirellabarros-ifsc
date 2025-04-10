package ifsc.poo;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }

    }

    public int getIdade() {
        return idade;
    }

    public void felizAniversario() {
        this.idade++;
    }
}
