package ifsc.poo;

public class Livro {
    private String nome = "";
    private String autor = "";
    private int[] generos = new int[2];
    private int paginas = 0;
    private int paginaAtual = 0;

    private String[] generosPossiveis = new String[] {"Fantasia", "Aventura",
            "Romance", "Mistério", "Terror", "Auto-ajuda", "Pedagógico"};

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setAutor(String autor) {
        if(autor != null && !autor.isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Autor inválido.");
        }
    }

    public void setGeneros(String generos) {
        String[] vetorGeneros = generos.split(" ");
        int[] flag = {-1, -1};

        if (vetorGeneros.length == 1 || vetorGeneros.length == 2) {
            for (int i = 0; i < vetorGeneros.length; i++) {
                for (int j = 0; j < this.generosPossiveis.length; j++) {
                    if (vetorGeneros[i].equals(this.generosPossiveis[j])) {
                        flag[i] = j;
                        break;
                    }
                }
            }
            if (flag[0] != -1 && flag[1] != -1) {
                for (int i = 0; i < 2; i++) {
                    this.generos[i] = flag[i];
                }
            } else {
                System.out.println("Generos literarios invalidos.");
            }
        } else {
            System.out.println("Informe 2 generos literarios.");
        }
    }
}
