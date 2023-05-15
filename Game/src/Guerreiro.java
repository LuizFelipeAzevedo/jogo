
public class Guerreiro extends ElementoVisual {
    private Jogador jogador;

    public Guerreiro(String nome, Jogador jogador) {
        super(nome);
        this.jogador = jogador;
    }

    public void exibir() {
        System.out.println("Exibindo Guerreiro: " + getNome());
        System.out.println("Jogador: " + jogador.getNome());
        System.out.println("HP: " + jogador.getHp());
        System.out.println("XP: " + jogador.getXp());
    }
}
