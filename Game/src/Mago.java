
public class Mago extends ElementoVisual {
    private Jogador jogador;

    public Mago(String nome, Jogador jogador) {
        super(nome);
        this.jogador = jogador;
    }

    public void exibir() {
        System.out.println("Exibindo Mago: " + getNome());
        System.out.println("Jogador: " + jogador.getNome());
        System.out.println("HP: " + jogador.getHp());
        System.out.println("XP: " + jogador.getXp());
    }
}