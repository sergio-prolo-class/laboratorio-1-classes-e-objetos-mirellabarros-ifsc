package ifsc.poo;

public class Pessoa {
    private String nome = "";
    private int idade = 0;
    private final String CPF;

    public Pessoa(String CPF) {
        if (CPF != null && !CPF.isEmpty()) {
            this.CPF = CPF;
        } else {
            this.CPF = "123.456.789-00";
        }
        this.setNome("");
        this.setIdade(-1);
    }

    public Pessoa(String nome, String CPF) {
        this.setNome(nome);
        if (CPF != null && !CPF.isEmpty()) {
            this.CPF = CPF;
        } else {
            this.CPF = "123.456.789-00";
        }
    }

    public Pessoa(String nome, int idade, String CPF) {
        this.setNome(nome);
        this.setIdade(idade);
        if (CPF != null && !CPF.isEmpty()) {
            this.CPF = CPF;
        } else {
            this.CPF = "123.456.789-00";
        }
    }

    public boolean setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
            return true;
        } else {
            this.nome = "Sem nome";
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
            return true;
        } else {
            this.idade = -1;
            return false;
        }
    }

    public int getIdade() {
        return idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void felizAniversario() {
        if (idade >= 0) {
            this.idade++;
        }
    }
}
