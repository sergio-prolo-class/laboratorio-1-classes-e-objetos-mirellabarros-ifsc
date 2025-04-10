/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;

public class App {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.ligar();
        lampada2.desligar();

        String estadoLampada1 = lampada1.verEstado() ? "ligada" : "desligada";
        String estadoLampada2 = lampada2.verEstado() ? "ligada" : "desligada";

        System.out.println("Lampada 1: " + estadoLampada1);
        System.out.println("Lampada 2: " + estadoLampada2);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome("Alice");
        p1.setIdade(22);
        p2.setNome("Bruno");
        p2.setIdade(25);

        p2.felizAniversario();
        p2.felizAniversario();
        p2.felizAniversario();

        System.out.println(p1.getNome() + "tem " + p1.getIdade());
        System.out.println(p2.getNome() + "tem " + p2.getIdade());
    }

}
