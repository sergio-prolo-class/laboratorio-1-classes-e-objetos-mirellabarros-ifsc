/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        // 1. Lâmpada -----------------------------------------------------------
        System.out.println("1. Lâmpada -------------------------------------");
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada(true);

        String estadoLampada1 = lampada1.verEstado() ? "ligada" : "desligada";
        String estadoLampada2 = lampada2.verEstado() ? "ligada" : "desligada";

        System.out.println("Lampada 1: " + estadoLampada1);
        System.out.println("Lampada 2: " + estadoLampada2);

        lampada1.ligar();
        lampada2.desligar();

        estadoLampada1 = lampada1.verEstado() ? "ligada" : "desligada";
        estadoLampada2 = lampada2.verEstado() ? "ligada" : "desligada";

        System.out.println("Lampada 1: " + estadoLampada1);
        System.out.println("Lampada 2: " + estadoLampada2);
        System.out.println("Total de lâmpadas: " + Lampada.getContagem());
        System.out.println("\n");

        // 2. Pessoa -----------------------------------------------------------
        System.out.println("2. Pessoa -------------------------------------");
        Pessoa p1 = new Pessoa("11122233344");
        Pessoa p2 = new Pessoa("Maria", "");
        Pessoa p3 = new Pessoa("Jane", 26,"00012345600");

        p2.felizAniversario();
        p2.felizAniversario();
        p2.felizAniversario();

        boolean resultado_pessoa = p1.setIdade(-44);
        System.out.println("p1.setIdade(-44): " + resultado_pessoa);
        resultado_pessoa = p2.setNome("");
        System.out.println("p1.setNome(\"\"): " + resultado_pessoa);

        System.out.println(p1.getNome() + " tem " + p1.getIdade() + " anos e CPF " + p1.getCPF());
        System.out.println(p2.getNome() + " tem " + p2.getIdade() + " anos e CPF " + p2.getCPF());
        System.out.println(p3.getNome() + " tem " + p3.getIdade() + " anos e CPF " + p3.getCPF());
        System.out.println("\n");

        // 3. Retângulo -----------------------------------------------------------
        System.out.println("3. Retângulo -------------------------------------");
        Retangulo[] retangulos = new Retangulo[10];
        Random r = new Random();
        float maior = 0;

        for (int i = 0; i < 10; i++) {
            retangulos[i] = new Retangulo(r.nextInt(1,20), r.nextInt(1, 20));
        }

        System.out.println("O retângulo de maior área é " + Retangulo.getRetanguloMaiorArea());
        System.out.println("A maior área: " + Retangulo.getRetanguloMaiorArea().getArea());
        System.out.println("O retângulo de menor perímetro é " + Retangulo.getRetanguloMenorPerimetro());
        System.out.println("O menor perímetro: " + Retangulo.getRetanguloMenorPerimetro().getPerimetro());
        System.out.println("\n");

        // 4. Relógio -----------------------------------------------------------
        System.out.println("4. Relógio -------------------------------------");

        // Laboratório 1
        Relogio relogio1 = new Relogio((byte) 13);
        relogio1.ajustarHora((byte) 14, (byte) 58, (byte) 32);
        relogio1.avancaMinuto();
        relogio1.avancaMinuto();
        System.out.println(relogio1.getHorario());
        relogio1.ajustarHora((byte) 23, (byte) 59, (byte) 59);
        relogio1.avancaSegundo();
        System.out.println(relogio1.getHorario());
        relogio1.setAmpm(true);
        relogio1.ajustarHora((byte) 23, (byte) 30, (byte) 45);
        System.out.println(relogio1.getHorario());

        // Laboratório 2
        relogio1.setAmpm(false);
        Relogio relogio2 = new Relogio((byte) 0, (byte) 0, (byte) 0);
        System.out.println("Relório 2: " + relogio2.getHorario());
        relogio2.sync(relogio1);
        System.out.println("Relório 1: " + relogio1.getHorario());
        System.out.println("Relório 2: " + relogio2.getHorario());
        relogio1.avancaHora();
        relogio2.avancaHora();
        relogio2.avancaMinuto();
        relogio2.avancaSegundo();
        System.out.println("Relório 1: " + relogio1.getHorario());
        System.out.println("Relório 2: " + relogio2.getHorario());
        System.out.println("Diferença entre o relógio 1 e o relógio 2: " + relogio2.diferenca(relogio1) + " segundos");
        System.out.println("\n");

        // 5. Produto -----------------------------------------------------------
        System.out.println("5. Produto -------------------------------------");
        // Laboratório 1
        Produto geladeira = new Produto("Geladeira", 832);
        Produto microondas = new Produto("Micro-ondas", 499);
        geladeira.setDesconto(6);
        microondas.setDesconto(12);

        float geladeiraComDesconto = (((float) (100 - geladeira.getDesconto()) / 100) * geladeira.getPreco());
        float microondasComDesconto = (((float) (100 - microondas.getDesconto()) / 100) * microondas.getPreco());

        System.out.println(geladeira.getNome() + ": " + geladeiraComDesconto);
        System.out.println(microondas.getNome() + ": " + microondasComDesconto);

        System.out.println(geladeira.anuncio());
        System.out.println(microondas.anuncio());

        // Laboratório 2
        Produto fogao = new Produto("Fogão 4 bocas Eletrolux KL4003", 677);

        String[] listaDeProdutos = Produto.listaDeProdutos();

        for (int i = 0; i < listaDeProdutos.length; i++) {
            if (listaDeProdutos[i] != null) {
                System.out.println(listaDeProdutos[i]);
            }
        }

        System.out.println("\n");

        // 6. Livro -----------------------------------------------------------
        System.out.println("6. Livro -------------------------------------");
        Livro livro = new Livro();
        livro.setNome("O Senhor dos Anéis - A Sociedade do Anel");
        System.out.println(livro.getNome());
        livro.setAutor("J. R. R. Tolkien");
        System.out.println(livro.getAutor());
        livro.setGeneros("fantasia aventura");
        System.out.println(livro.getGeneros());
        livro.setPaginas(464);
        System.out.println("Total de páginas " + livro.getPaginas());
        livro.setCapitulos(1, "Uma Festa Muito Esperada", 1);
        livro.setCapitulos(2, "A Sombra do Passado", 23);
        livro.setCapitulos(3, "Três é Demais", 44);
        livro.setCapitulos(4, "Um Atalho para Cogumelos", 66);
        livro.setCapitulos(5, "Uma Conspiração Desmascarada", 89);
        livro.setCapitulos(6, "A Floresta Velha", 110);
        livro.setCapitulos(7, "Em Casa de Tom Bombadil", 131);
        livro.setCapitulos(8, "Névoa nas Colinas dos Túmulos", 154);
        livro.setCapitulos(9, "No Pônei Empinado", 176);
        livro.setCapitulos(10, "Passolargo", 197);
        livro.setCapitulos(11, "Um Faca na Noite", 219);
        livro.setCapitulos(12, "Voo para o Vau", 240);
        livro.setCapitulos(13, "Muitos Encontros", 261);
        livro.setCapitulos(14, "O Conselho de Elrond", 282);
        livro.setCapitulos(15, "O Anel Vai para o Sul", 301);
        livro.setCapitulos(16, "Uma Jornada no Escuro", 320);
        livro.setCapitulos(17, "A Ponte de Khazad-dûm", 341);
        livro.setCapitulos(18, "Lothlórien", 361);
        livro.setCapitulos(19, "O Espelho de Galadriel", 383);
        livro.setCapitulos(20, "Adeus a Lórien", 403);
        livro.setCapitulos(21, "O Grande Rio", 423);
        livro.setCapitulos(22, "A Partida da Sociedade", 446);
        for (int i = 0; i < 90; i++) {
            livro.passarPagina();
        }
        System.out.println(livro.getPaginaAtual());
        System.out.println(livro.getCapitulos(livro.getPaginaAtual()));
        for (int i = 0; i < 300; i++) {
            livro.passarPagina();
        }
        System.out.println(livro.getPaginaAtual());
        System.out.println(livro.getCapitulos(livro.getPaginaAtual()));
        for (int i = 0; i < 100; i++) {
            livro.passarPagina();
        }
        System.out.println(livro.getPaginaAtual());

        // 6. Navio -----------------------------------------------------------
    }
}
