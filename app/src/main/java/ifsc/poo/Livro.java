package ifsc.poo;

public class Livro {
    private String nome = "";
    private String autor = "";
    private int[] generos = new int[2];
    private int[] numCapitulos = new int[30];
    private String[] titCapitulos = new String[30];
    private int[] pagCapitulos = new int[30];
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

    public String getAutor() {
        return autor;
    }

    public void setGeneros(String generos) {
        String[] vetorGeneros = generos.split(" ");
        int[] flag = {-1, -1};

        if (vetorGeneros.length == 1 || vetorGeneros.length == 2) {
            for (int i = 0; i < vetorGeneros.length; i++) {
                for (int j = 0; j < this.generosPossiveis.length; j++) {
                    if (vetorGeneros[i].equalsIgnoreCase(this.generosPossiveis[j])) {
                        flag[i] = j;
                        break;
                    }
                }
                // Se algum não for encontrado
                if (flag[i] == -1) {
                    System.out.println("Gênero '" + vetorGeneros[i] + "' inválido.");
                    return;
                }
            }
            // Limpa o vetor atual de gêneros
            for (int i = 0; i < this.generos.length; i++) {
                this.generos[i] = -1;
            }

            // Atribui os valores válidos encontrados
            for (int i = 0; i < vetorGeneros.length; i++) {
                this.generos[i] = flag[i];
            }
        } else {
            System.out.println("Informe um ou dois gêneros literários.");
        }
    }

    public String getGeneros() {
        String resultado = "";
        for (int i = 0; i < this.generos.length; i++) {
            if (this.generos[i] != -1 && this.generos[i] < this.generos.length) {
                if (!resultado.isEmpty()) {
                    resultado += ", ";
                }
                resultado += this.generosPossiveis[this.generos[i]];
            }
        }
        return resultado.isEmpty() ? "Nenhum gênero definido" : resultado;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setCapitulos(int numCapitulo, String titCapitulo, int pagCapitulo) {
        for (int i = 0; i < this.numCapitulos.length; i++) {
            if (this.numCapitulos[i] == 0) {
                this.numCapitulos[i] = numCapitulo;
                this.titCapitulos[i] = titCapitulo;
                this.pagCapitulos[i] = pagCapitulo;
                break;
            }
        }
    }

    public void passarPagina() {
        if(paginaAtual < this.paginas) {
            this.paginaAtual++;
        }
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public String getCapitulos(int pagina) {
        String resultado = "";
        int indice = -1;
        for (int i = 0; i < this.pagCapitulos.length; i++) {
            if (this.pagCapitulos[i] < pagina) {
                indice = i;
            } else {
                break;
            }
        }
        if (indice != -1) {
            resultado = this.numCapitulos[indice] + " | " + this.titCapitulos[indice] + " | " + this.pagCapitulos[indice];
            return resultado;
        } else {
            return "Nenhum capitulo encontrado.";
        }
    }
}
